package Clase;
public class BMPImageLoader implements ImageLoader {
    public ImageContent load(String path) {
        System.out.println("Loading BMP image from " + path);
        return new ImageContent();
    }
}
