package Clase;

public abstract class AlignLeft implements AlignStrategy {
    // Atribute specifice pentru AlignLeft, dacă este necesar
    // ...

    // Implementarea metodei render conform specificațiilor
    @Override
    public void render(Paragraph paragraph, Context context) {
        // Logica de aliniere la stânga
        System.out.println("Aligned to the left: " + paragraph.get());
        // ... cod suplimentar dacă este necesar
    }
}