package account;

public class SimpleAccount extends Account {
    @Override
    public boolean add(long amount) {
        balance += amount;
        return balance >= 0;
    }

    @Override
    public boolean pay(long amount) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}
