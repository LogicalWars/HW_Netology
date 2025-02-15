import deal.Deal;
import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    TaxSystem taxSystem = new TaxSystem();

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        System.out.println("Компания "+title+" получила "+amount+" руб.");
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        System.out.println("Компания "+title+" уплатила налог в размере: "+taxSystem.calcTaxFor(debit, credit)+" руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal: deals){
            System.out.println(deal.getComment());
            debit += deal.getDebitChange();
            credit += deal.getCreditChange();
        }
        int diff = debit - credit;
        payTaxes();
        return diff;
    }
}
