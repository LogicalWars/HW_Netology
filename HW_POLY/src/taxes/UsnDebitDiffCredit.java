package taxes;

public class UsnDebitDiffCredit extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        tax = (int) ((debit - credit) * 0.15);
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
