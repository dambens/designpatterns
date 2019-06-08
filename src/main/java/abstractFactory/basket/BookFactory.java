package abstractFactory.basket;

import java.util.Random;

public class BookFactory implements ProductFactory {

    private static final String[] authors =
            {"Zosia Banaszek", "Marcin Chrupie", "Doruch Ania"};
    private static final String[] titles =
            {"Kiwka Fifka", "LOTR", "50 twarzy Przemka"};
    private static final String[] ISBNs =
            {"3475965", "2369652", "3475458"};
    public Product getProduct() {
        Random random = new Random();
        double price = random.nextDouble() * 100;
        String author = authors[random.nextInt(3)];
        String title = titles[random.nextInt(3)];
        String ISBN = ISBNs[random.nextInt(3)];
        int yearOfRelease = random.nextInt(100)+1901;
        return new Book(price, author, title, ISBN, yearOfRelease);
    }
}
