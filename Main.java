// Clasa "Author"
class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}

// Clasa "Book"
class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Book Title: " + title);
        author.print();
    }
}

// Clasa "TableOfContents"
class TableOfContents {
    public void print() {
        System.out.println("Table of Contents");
    }
}

// Clasa "Chapter"
class Chapter {
    private String name;

    public Chapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Chapter: " + name);
    }
}

// Clasa "SubChapter"
class SubChapter {
    private String name;

    public SubChapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("SubChapter: " + name);
    }
}

// Clasa "Image"
class Image {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }
}

// Clasa "Paragraph"
class Paragraph {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
}

// Clasa "Table"
class Table {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table Title: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplu de utilizare a claselor

        Author author = new Author("John Doe");
        Book book = new Book("Sample Book", author);
        TableOfContents toc = new TableOfContents();
        Chapter chapter = new Chapter("Chapter 1");
        SubChapter subChapter = new SubChapter("SubChapter 1");
        Image image = new Image("Image 1");
        Paragraph paragraph = new Paragraph("This is a paragraph.");
        Table table = new Table("Table 1");

        book.print();
        toc.print();
        chapter.print();
        subChapter.print();
        image.print();
        paragraph.print();
        table.print();
    }
}
