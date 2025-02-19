import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String ADD_NAME = "a friend of";
        final String TO_DO = "сделал новый маникюр";

        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Deque<String> queue = new ArrayDeque<>();

        for (String firstClient : firstClients) {
            queue.offerFirst(firstClient);
        }

        while (!queue.isEmpty()){

            System.out.println("Размер очереди: " + queue.size());
            String name = queue.pollLast();
            System.out.println(name+" "+TO_DO);
            String friend = ADD_NAME + " " + name;

            if (Math.random() < 0.5) { // проверка условия, которое срабатывает с 50% вероятностью
                System.out.printf("Записался друг: %s%n\n", friend);
                queue.offerFirst(friend);
            } else {
                System.out.println("Друг не записался\n");
            }
        }


    }
}