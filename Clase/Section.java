package Clase;
import java.util.ArrayList;
import java.util.List;
public class Section implements Element{
    private String sectionTitle;
    private List<Element> elements;
    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        this.elements = new ArrayList<>();
    }
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
    public void remove(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        }
    }
    public void print() {
        System.out.println("Clase.Section Title: " + sectionTitle);
        for (Element element : elements) {
            element.print();
        }
    }
    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
        for(Element e : elements) {
            e.accept(v);
        }
    }
}