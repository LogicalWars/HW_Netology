package account;

public class CreditAccount extends Account{
    private long limit;

    public CreditAccount (long limit) {
        this.limit = limit;
        this.balance = limit;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > limit){
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount < 0) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}
