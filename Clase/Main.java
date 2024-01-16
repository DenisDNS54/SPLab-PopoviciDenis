package Clase;
public class Main {
    public static void main(String[] args) throws Exception {
                Section cap1 = new Section("Capitolul 1");
                Paragraph p1 = new Paragraph("Paragraf 1");
                cap1.add(p1);
                Paragraph p2 = new Paragraph("Paragraf 2");
                cap1.add(p2);
                Paragraph p3 = new Paragraph("Paragraf 3");
                cap1.add(p3);
                Paragraph p4 = new Paragraph("Paragraf 4");
                cap1.add(p4);
                Image img = new Image("Imagine 1", "https://example.com/image1.jpg");
                cap1.add(img);
                Image img2 = new Image("Imagine 2", "https://example.com/image2.jpg");
                cap1.add(img2);
                RenderContentVisitor rcv = new RenderContentVisitor();
                cap1.accept(rcv);
                BookStatistics bs = new BookStatistics();
                cap1.accept(bs);
                bs.printStatistics();
    }
}