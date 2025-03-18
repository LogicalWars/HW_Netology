import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", 2024, new Author("Лев", "Толстой", 10), 1984);
        Book book2 = new Book("Мастер и Маргарита", 2024, new Author("Михаил", "Булгаков", 9), 512);
        Book book3 = new Book("Сборник цитат", 2024, new Author("Anonymous", "", 1), 50 );

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        for (Book book : books) {
            System.out.println("Книга: "+book.getTitle()+", автор: "+book.getAuthor());
            System.out.println("Большая? "+book.isBig());
            System.out.println("Есть слово Мир? "+book.matches("Мир"));
            System.out.println("Есть слово Михаил? "+book.matches("Михаил"));
            System.out.println("Цена: "+book.estimatePrice()+" рублей\n");
        }
    }
}