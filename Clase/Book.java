package Clase;
import java.util.ArrayList;
import java.util.List;
import Clase.Author;
class Book {
    private String title;
    private Author author;
    private TableOfContents tableOfContents;
    private List<Chapter> chapters;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.tableOfContents = tableOfContents;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }
    public void print() {
        System.out.println("Clase.Book Title: " + title);
        author.print();
    }
}
