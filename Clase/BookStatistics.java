package Clase;

public class BookStatistics implements Visitor {
    private int numberOfParagraphs;
    private int numberOfImages;
    private int numberOfTables;

    public void printStatistics() {
        System.out.println("== Book statistics ==");
        System.out.println("Number of paragraphs: " + numberOfParagraphs);
        System.out.println("Number of images: " + numberOfImages);
        System.out.println("Number of tables: " + numberOfTables);
    }

    @Override
    public void visitImage(Image image) {
        numberOfImages++;
    }

    @Override
    public void visitTable(Table table) {
        numberOfTables++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        numberOfParagraphs++;
    }

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitTableOfContents(TableOfContents tableofcontents) {

    }

    @Override
    public void visitImageProxy(ImageProxy ip) {

    }
}