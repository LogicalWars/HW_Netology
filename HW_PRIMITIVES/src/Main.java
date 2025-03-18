import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        while (true) {
            System.out.println("Выберите операцию и введите ее номер:\n"+
                    "1. Добавить новый доход\n"+
                    "2. Добавить новый расход\n"+
                    "3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStrEarn = scanner.nextLine();
                    int moneyEarn = Integer.parseInt(moneyStrEarn);
                    earnings += moneyEarn;
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneyStrSpend = scanner.nextLine();
                    int moneySpend = Integer.parseInt(moneyStrSpend);
                    spendings += moneySpend;
                    System.out.println("");
                    break;
                case 3:
                    int taxEarnings = taxEarnings(earnings);
                    int taxEarningsMinusSpending = taxEarningsMinusSpendings(earnings, spendings);
                    if (taxEarningsMinusSpending < taxEarnings) {
                        System.out.println("\nМы советуем Вам УСН доходы минус расходы\n"+
                                "Ваш налог составит: "+taxEarningsMinusSpending+" рублей\n"+
                                "Налог на другой системе: "+taxEarnings+" рублей\n"+
                                "Экономия: "+(taxEarnings - taxEarningsMinusSpending));
                    } else {
                        System.out.println("Мы советуем Вам УСН доходы\n"+
                                "Ваш налог составит: "+taxEarnings+" рублей\n"+
                                "Налог на другой системе: "+taxEarningsMinusSpending+" рублей\n"+
                                "Экономия: "+(taxEarningsMinusSpending - taxEarnings)+"\n");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int taxEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        return tax;
    }
}