package deal;

public class Sale extends Deal{
    private String product;

    public Sale(String product, int debitChange) {
        super("Продажа "+product+" на "+debitChange+" руб.", 0, debitChange);
    }
}
