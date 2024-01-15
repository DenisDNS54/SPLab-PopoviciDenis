package Clase;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        // Simulate right alignment with padding
        String text = paragraph.getText();
        int width = 80; // Assume a fixed width for alignment
        int paddingLength = width - text.length();
        String padding = String.format("%" + paddingLength + "s", "");
        System.out.println(padding + text);
    }
}