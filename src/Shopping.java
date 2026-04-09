public class Shopping {
    private String description;
    private double price;

    public Shopping(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Description: " + getDescription() + '\'' + "Price: " + getPrice();
    }
}
