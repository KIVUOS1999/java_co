package book_managment;

public class book {
    String name,author;
    int price;

    book(String name,String author,int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    book(book Book){
        this.name = Book.name;
        this.author = Book.author;
        this.price = Book.price;
    }
}
