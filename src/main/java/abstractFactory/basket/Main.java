package abstractFactory.basket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductFactory> factories = new ArrayList<>();
        factories.add(new BookFactory());
        factories.add(new BookFactory());
        factories.add(new BookFactory());
        factories.add(new BookFactory());

        for (ProductFactory factory : factories){
            Product product = factory.getProduct();
            String entry = String.format("price: %s, %s", product.getPrice(), product.getSummary());
            System.out.println(entry);
        }
    }
}
