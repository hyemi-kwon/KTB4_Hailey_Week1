package week1;

class Book extends LibraryItem {
    String author;
    String publisher;

    public Book() {
    }

    public Book(
            String title,
            String type,
            String category,
            boolean available,
            String author,
            String publisher
    ) {
        this.title = title;
        this.type = type;
        this.category = category;
        this.available = available;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", available=" + available +
                '}';
    }
}