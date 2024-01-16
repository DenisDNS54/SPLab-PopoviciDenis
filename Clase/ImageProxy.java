package Clase;
import java.awt.*;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
public class ImageProxy implements Element{
        private String url;
        private Dimension dim;
        private Image reallmg;
        public ImageProxy(String url) {
            this.url = url;
            this.dim = dim;
        }
        public Image loadImage() {
            if(reallmg == null){
                reallmg= new Image() {
                    @Override
                    public int getWidth(ImageObserver observer) {
                        return 0;
                    }
                    @Override
                    public int getHeight(ImageObserver observer) {
                        return 0;
                    }
                    @Override
                    public ImageProducer getSource() {
                        return null;
                    }
                    @Override
                    public Graphics getGraphics() {
                        return null;
                    }
                    @Override
                    public Object getProperty(String name, ImageObserver observer) {
                        return null;
                    }
                };
            }
            return reallmg;
        }
        // Metodă pentru a obține URL-ul imaginii
        public String getUrl() {
            return url;
        }
        // Metodă pentru a obține dimensiunile imaginii
        public Dimension getDim() {
            return dim;
        }
    @Override
    public void print() {
    }
    @Override
    public void add(Element element) {
    }
    @Override
    public void remove(Element element) {

    }
    @Override
    public Element get(int index) {
        return null;
    }
    @Override
    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }
}