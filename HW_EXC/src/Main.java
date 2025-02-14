import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker passwordChecker = new PasswordChecker();
        while (true) {
            try {
                System.out.print("Введите мин. длину пароля: ");
                passwordChecker.setMinLength(scanner.nextInt());
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e);
                System.out.println("\n");
            }
        }

        while (true) {
            try {
                System.out.print("Введите макс. допустимое кол-во повторений символа подряд: ");
                passwordChecker.setMaxRepeats(scanner.nextInt());
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e);
                System.out.println("\n");
            }
        }


        while (true) {
            System.out.println("Введите пароль или end: ");
            String str = scanner.next();
            if (str.equals("end")) {
                break;
            }

            if (passwordChecker.verify(str)) {
                System.out.println("Пароль подходит");
            } else {
                System.out.println("Пароль не подходит");
            }
        }
    }
}