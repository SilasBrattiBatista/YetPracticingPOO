public class CreditCard {
    private double limit;

    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) {
        if (limit < 0) {
            System.out.println("You can't set this limit");
        } else {
            this.limit = limit;
        }
    }
}
