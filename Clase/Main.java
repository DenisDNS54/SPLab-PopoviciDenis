package Clase;// Clasa "Clase.Author"

public class Main {
    public static void main(String[] args) {
        // Exemplu de utilizare a claselor

        Author author = new Author("John Doe");
        Book book = new Book("Sample Clase.Book", author);
        TableOfContents toc = new TableOfContents();
        Chapter chapter = new Chapter("Clase.Chapter 1");
        SubChapter subChapter = new SubChapter("Clase.SubChapter 1");
        Image image = new Image("Clase.Image 1");
        Paragraph paragraph = new Paragraph("This is a paragraph.");
        Table table = new Table("Clase.Table 1");

        book.print();
        toc.print();
        chapter.print();
        subChapter.print();
        image.print();
        paragraph.print();
        table.print();
    }
}
