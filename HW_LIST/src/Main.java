import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("Выберите операцию: \n");
            System.out.println("0. Выход из программы\n" +
                    "1. Добавить дело\n" +
                    "2. Показать дела\n" +
                    "3. Удалить дело по номеру\n" +
                    "4. Удалить дело по названию\n" +
                    "5. Удалить дело по ключевому слову\n");
            System.out.print("Введите операцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Введите название задачи: ");
                    if (scanner.hasNext()) {
                        toDoList.add(scanner.nextLine());
                    }
                    break;
                case 2:
                    toDoList.show();
                    break;
                case 3:
                    System.out.print("Введите номер для удаления: ");
                    if (!toDoList.delete(scanner.nextInt())){
                        System.err.println("Задачи с таким номером не существет");
                    }
                    break;
                case 4:
                    System.out.print("Введите точное название задачи: ");
                    if(!toDoList.deleteEquals(scanner.nextLine())){
                        System.err.println("Задачи с таким именем не существует");
                    }
                    break;
                case 5:
                    System.out.print("Введите ключевое слово для удаления: ");
                    if(!toDoList.deleteContains(scanner.nextLine())){
                        System.err.println("Нет совпадений");
                    }
                    break;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова");
            }
        }
    }

    public static class ToDoList {
        List<String> taskList = new ArrayList<>();

        public boolean add(String task) {
            return taskList.add(task);
        }

        public void show() {
            int count = 0;
            for (String task : taskList) {
                count++;
                System.out.println(count + ". " + task);
            }
        }

        public boolean delete(int number) {
            if (taskList.size() < number) {
                return false;
            } else {
                taskList.remove(number - 1);
                return true;
            }
        }

        public boolean deleteEquals(String task) {
            return taskList.remove(task);
        }

        public boolean deleteContains(String task) {
            List<String> removeList = new ArrayList<>();
            for (String taskFromList : taskList) {
                if (taskFromList.contains(task)) {
                    removeList.add(taskFromList);
                }
            }
            return taskList.removeAll(removeList);
        }
    }
}