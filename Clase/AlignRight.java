package Clase;

public abstract class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph, Context context) {
        // Logica de aliniere la dreapta
        System.out.println("Aligned to the right: " + paragraph.get());
        // ... cod suplimentar dacă este necesar
    }
}
