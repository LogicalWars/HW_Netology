import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result, year, days, count = 0;
        while (true) {
            result = 365;
            System.out.println("Введите год: ");
            year = scanner.nextInt();
            System.out.println("Введите количество дней: ");
            days = scanner.nextInt();
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                result = 366;
            }
            if (result != days) {
                System.out.println("Неправильно! В этом году " + result + " дней");
                System.out.println("Набрано очков: "+count);
                break;
            } else {
                count++;
            }
        }
    }
}