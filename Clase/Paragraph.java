package Clase;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;
    private List<Element> elements; // Presupun că aceasta este pentru conținutul compozit

    // Constructor pentru un paragraf cu un text specificat
    public Paragraph(String text) {
        this.text = text;
        this.elements = new ArrayList<>(); // Inițializarea listei pentru conținutul compozit
    }

    // Metoda setAlignStrategy pentru a seta strategia de aliniere
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    // Modificarea metodei print pentru a folosi AlignStrategy
    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this);
        } else {
            System.out.println("Clase.Paragraph: " + text);
        }
    }

    // Restul metodelor pentru gestionarea elementelor compozite
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

    // Metoda pentru a printa toate elementele compozite
    public void printAll() {
        for (Element element : elements) {
            if (element instanceof Paragraph) {
                ((Paragraph) element).print();
            }
            // Aici ar trebui să gestionăm și alte tipuri de Elemente dacă există
        }
    }

    // Getter pentru textul paragrafului
    public String getText() {
        return text;
    }

    // Setter pentru textul paragrafului
    public void setText(String text) {
        this.text = text;
    }

    public String get() {
        return text;
    }
}
