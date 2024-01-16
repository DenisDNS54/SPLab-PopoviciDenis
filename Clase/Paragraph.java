package Clase;
import java.util.ArrayList;
import java.util.List;
public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;
    private List<Element> elements;
    public Paragraph(String text) {
        this.text = text;
        this.elements = new ArrayList<>();
    }
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this);
        } else {
            System.out.println("Clase.Paragraph: " + text);
        }
    }
    @Override
    public void add(Element element) {
        elements.add(element);
    }
    @Override
    public void remove(Element element) {
        elements.remove(element);
    }
    public Element get(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }
    public void printAll() {
        for (Element element : elements) {
            if (element instanceof Paragraph) {
                ((Paragraph) element).print();
            }
        }
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String get() {
        return text;
    }
    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }
}