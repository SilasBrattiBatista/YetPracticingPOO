import java.util.ArrayList;

public class CreditCard {
    private double limit;
    private double balance;
    private ArrayList<Shopping> shopping;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shopping = new ArrayList<>();
    }

    public boolean buying(Shopping shooping) {
        if (this.balance > shooping.getPrice()) {
            this.balance -= shooping.getPrice();
            this.shopping.add(shooping);
            return true;
        }

        return false;
    }

    public double getLimit() {
        return this.limit;
    }

    public double getBalance() {
        return this.balance;
    }
}
