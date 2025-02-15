import deal.Deal;
import deal.Expenditure;
import deal.Sale;
import taxes.TaxSystem;
import taxes.UsnDebit;
import taxes.UsnDebitDiffCredit;

public class Main {
    public static void main(String[] args) {
        UsnDebit usnDebit = new UsnDebit();
        UsnDebitDiffCredit usnDebitDiffCredit = new UsnDebitDiffCredit();
        Company company = new Company("\"ООО Моя оборона\"", usnDebit);
        Company company2 = new Company("\"ООО Сыновья\"", usnDebitDiffCredit);

        company.shiftMoney(20);
        company.payTaxes();
        company.shiftMoney(-100);
        company.payTaxes();

        company2.shiftMoney(20);
        company2.payTaxes();
        company2.shiftMoney(-100);
        company2.shiftMoney(700);
        company2.payTaxes();

        Sale sale = new Sale("Сыр", 1800);
        Sale sale1 = new Sale("Молоко", 1000);
        Sale sale2 = new Sale("Колбаса", 38000);
        Sale sale3 = new Sale("Яйца", 1300);

        Expenditure expenditure = new Expenditure("ГСМ", 1000);
        Expenditure expenditure1 = new Expenditure("Комплектующие", 2100);
        Expenditure expenditure2 = new Expenditure("Расходник1", 430);
        Expenditure expenditure3 = new Expenditure("Расходник2", 1400);
        Expenditure expenditure4 = new Expenditure("Расходник3", 1320);

        Deal[] deal = new Deal[] {
                sale,
                sale1,
                sale2,
                sale3,
                expenditure,
                expenditure1,
                expenditure2,
                expenditure3,
                expenditure4
        };

        System.out.println("Разница debit и credit = "+company.applyDeals(deal));
        System.out.println("Разница debit и credit = "+company2.applyDeals(deal));
    }
}