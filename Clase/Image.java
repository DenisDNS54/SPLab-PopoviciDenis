package Clase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Image implements Element{
    private String url;
    private String imageName;
    public void print() {
        System.out.println("Clase.Image: " + url);
    }
    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void add(Element element) {
    }
    @Override
    public void remove(Element element) {
    }
    private List<Image> images;
    public Image(String imageName, String url) {
        this.imageName = imageName;
        this.url = url;
    }
    public void add(Image image) {
        images.add(image);
    }
    public Image get(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        }
        return null;
    }
    public void remove(int index) {
        if (index >= 0 && index < images.size()) {
            images.remove(index);
        }
    }
    public void printAll() {
        for (Image image : images) {
            image.print();
        }
    }
    @Override
    public void accept(Visitor v) {
        v.visitImage(this);
    }
}