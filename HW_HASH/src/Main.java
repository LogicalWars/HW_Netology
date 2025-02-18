import java.util.*;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Russia", "Moscow");
        Address address2 = new Address("Russia", "Ufa");
        Address address3 = new Address("Russia", "Saratov");
        Address address4 = new Address("Belarus", "Minsk");
        Address address5 = new Address("Japan", "Tokyo");
        Address address6 = new Address("China", "Pekin");

        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(address1, 20);
        costPerAddress.put(address2, 100);
        costPerAddress.put(address3, 200);
        costPerAddress.put(address4, 1000);
        costPerAddress.put(address5, 2500);
        costPerAddress.put(address6, 3000);

        Scanner scanner = new Scanner(System.in);
        int cost;
        int totalCost = 0;
        Set<String> uniqueCountry = new HashSet<>();
        while(true) {
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну или введите end: ");
            String county = scanner.nextLine();
            if (county.equals("end")){
                break;
            }
            System.out.print("Введите город: ");
            String city = scanner.nextLine();
            System.out.print("Введите вес (кг): ");
            int weight = Integer.parseInt(scanner.nextLine());
            Address newOrder = new Address(county, city);
            if (costPerAddress.get(newOrder) == null) {
                System.out.println("Доставки по такому адресу нет\n\n");
            } else {
                uniqueCountry.add(county);
                cost = costPerAddress.get(newOrder) * weight;
                totalCost += cost;
                System.out.println("Стоимость доставки составит: "+cost+" руб.");
                System.out.println("Общая стоимость всех доставок: "+totalCost+" руб.\n");
                System.out.println("Кол-во уникальных стран, в которые были оформлены заказы: "+uniqueCountry.size());
                System.out.println("В какие страны были оформлены заказы: ");
                for (String country: uniqueCountry){
                    System.out.println(country);
                }
                System.out.print("\n\n");
            }

        }
    }
}