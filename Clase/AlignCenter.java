package Clase;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        // Asumând că vrem un aliniament centrat într-un spațiu de 80 de caractere
        int space = (80 - paragraph.getText().length()) / 2;
        String padding = String.format("%" + space + "s", "");
        System.out.println(padding + paragraph.getText() + padding);
    }
}