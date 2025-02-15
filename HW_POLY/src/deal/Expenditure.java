package deal;

public class Expenditure extends Deal{
    private String product;

    public Expenditure(String product, int creditChange) {
        super("Покупка "+product+" на "+creditChange+" руб.", creditChange, 0);
    }
}
