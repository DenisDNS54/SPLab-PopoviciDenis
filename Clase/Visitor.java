package Clase;
public interface Visitor {
    public void visitBook(Book book);
    public void visitSection(Section section);
    public void visitTableOfContents(TableOfContents tableofcontents);
    public void visitParagraph(Paragraph paragraph);
    public void visitImageProxy(ImageProxy ip);
    public void visitImage(Image image);
    public void visitTable(Table table);
}