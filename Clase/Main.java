package Clase;// Clasa "Clase.Author"

public class Main {
    public static void main(String[] args) {
        // Exemplu de utilizare a claselor
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section();
        Section cap11 = new Section();
        Section cap111 = new Section();
        Section cap1111 = new Section();
        noapteBuna.addContent( new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent( cap1);
        cap1.add( new Paragraph("Moto capitol"));
        cap1.add( cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add( cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add( cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        noapteBuna.print();


    }
}
