import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true){
            System.out.println("Выберите операцию: \n");
            System.out.println("0. Выход из программы\n" +
                    "1. Добавить дело\n" +
                    "2. Показать дела\n" +
                    "3. Удалить дело по номеру\n" +
                    "4. Удалить дело по названию\n"+
                    "5. Удалить дело по ключевому слову\n");
            System.out.print("Введите операцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Введите название задачи: ");
                    if (scanner.hasNext()){
                        String s = scanner.nextLine();
                        toDoList.add(s);
                    }
                    break;
                case 2:
                    toDoList.show();
                    break;
                case 3:
                    System.out.print("Введите номер для удаления: ");
                    toDoList.delete(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Введите точное название задачи: ");
                    toDoList.deleteEquals(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Введите ключевое слово для удаления: ");
                    toDoList.deleteContains(scanner.nextLine());
                    break;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова");
            }
        }
    }

    public static class ToDoList {
        List<String> list = new ArrayList<>();

        public boolean add(String s) {
            return list.add(s);
        }

        public void show() {
            int count = 0;
            for (String s : list) {
                count++;
                System.out.println(count + ". " + s);
            }
        }

        public void delete(int number) {
            list.remove(number - 1);
        }

        public void deleteEquals(String s) {
            list.remove(s);
        }

        public void deleteContains(String s) {
            List<String> removeList = new ArrayList<>();
            for (String str : list) {
                if (str.contains(s)){
                    removeList.add(str);
                }
            }
            list.removeAll(removeList);
        }
    }
}