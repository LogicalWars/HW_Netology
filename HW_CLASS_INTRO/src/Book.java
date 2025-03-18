public class Book {
    private String title;
    private int releaseYear;
    private int pages;
    private Author author;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.getName().contains(word) || author.getSurname().contains(word);
    }

    public int estimatePrice() {
        int price = pages * 3 * (int) Math.floor(Math.sqrt(author.getRating()));
        if (price <= 250) {
            return 250;
        } else {
            return price;
        }
    }
}
