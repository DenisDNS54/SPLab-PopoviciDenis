package Clase;

import java.util.ArrayList;
import java.util.List;

public class Table implements Element {
    private String title;
    private List<Element> elements;

    public Table(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Clase.Table Title: " + title);
        for (Element element : elements) {
            element.print();
        }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public Element get(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
