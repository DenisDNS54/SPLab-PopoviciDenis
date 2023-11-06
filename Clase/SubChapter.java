package Clase;

class SubChapter {
    private String name;
    private Image image;
    private Paragraph paragraph;
    private Table table;

    public SubChapter(String name) {
        this.name = name;
        this.image = image;
        this.paragraph = paragraph;
        this.table = table;
    }

    public void print() {
        System.out.println("Clase.SubChapter: " + name);
    }
}
