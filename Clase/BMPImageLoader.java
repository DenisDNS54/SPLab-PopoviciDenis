package Clase;

public class BMPImageLoader implements ImageLoader {
    public ImageContent load(String path) {
        // Implementarea încărcării unei imagini BMP
        System.out.println("Loading BMP image from " + path);
        // Returnează un nou conținut de imagine (fake pentru exemplu)
        return new ImageContent();
    }
}
