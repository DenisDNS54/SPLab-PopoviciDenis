package Clase;
public class JPGImageLoader implements ImageLoader {
    public ImageContent load(String path) {
        System.out.println("Loading JPG image from " + path);
        return new ImageContent();
    }
}