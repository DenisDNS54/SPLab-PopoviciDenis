package Clase;

public class Main {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);

        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();

        // Se presupune că alinierea a fost setată, dar nu face nimic conform output-ului dorit.
        // Puteți comenta următoarele linii dacă alinierea nu este necesară pentru output-ul final.
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        // Eliminăm toate paragrafele în afară de p4
        cap1.remove(p1);
        cap1.remove(p2);
        cap1.remove(p3);

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}
