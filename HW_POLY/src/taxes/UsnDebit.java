package taxes;

public class UsnDebit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        tax = (int) (debit * 0.06);
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
