import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int sumProducts = 0;
        int[] productCount = new int[products.length];
        while (true) {
            System.out.println("Список возможных товаров для покупки");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
            }

            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Ваша корзина: ");
                for (int i = 0; i < productCount.length; i++) {
                    if (productCount[i] == 0) {
                        continue;
                    }
                    System.out.println(products[i] + " " + productCount[i] + " шт " + prices[i] + " руб/шт " + productCount[i] * prices[i] + " руб в сумме");
                    sumProducts += productCount[i] * prices[i];
                }
                System.out.println("Итого: " + sumProducts + " руб");
                break;
            }
            int[] entryArray = new int[2];
            for (int i = 0; i < 2; i++) {
                entryArray[i] = Integer.parseInt(input.split(" ")[i]);
            }
            if (entryArray[0] > products.length) {
                System.out.println("Некорректный выбор товара");
            } else {
                productCount[entryArray[0] - 1] += entryArray[1];
            }
        }
        System.out.println("Программа завершена!");
    }
}
