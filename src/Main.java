import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard card = new CreditCard();
        List<Products> products = new ArrayList<>();

        int count = 1;
        while (count != 0) {
            Products newProduct = new Products();

            if (counting == 1) {
                System.out.println("What is the Limite of card: ");
                int limit = scanner.nextInt();
                card.setLimit(limit);

                System.out.println("What is the description of product: ");
                String description = scanner.nextLine();
                newProduct.setName(description);

                System.out.println("What is the price of product: ");
                int price = scanner.nextInt();
            }

            if (price < card.getLimit()) {
                newProduct.setPrice(price);
            }

            int counting;
            System.out.println("Type 0 to exit or 1 to continue");
            counting = scanner.nextInt();
        }

    }
}
