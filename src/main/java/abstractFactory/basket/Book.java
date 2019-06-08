package abstractFactory.basket;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book implements Product {
    private double price;
    private String author;
    private String title;
    private String ISBN;
    private int yearOfRelease;



    public String getSummary() {
        return String.format("Author: %s, Title: %s, %s, %s", this.author, this.title, this.ISBN, this.yearOfRelease);
    }
}
