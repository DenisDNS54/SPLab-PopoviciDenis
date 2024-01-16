package Clase;
public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        String text = paragraph.getText();
        int width = 80;
        int paddingLength = width - text.length();
        String padding = String.format("%" + paddingLength + "s", "");
        System.out.println(padding + text);
    }
}