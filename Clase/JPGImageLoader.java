package Clase;

public class JPGImageLoader implements ImageLoader {
    public ImageContent load(String path) {
        // Implementarea încărcării unei imagini JPG
        System.out.println("Loading JPG image from " + path);
        // Returnează un nou conținut de imagine (fake pentru exemplu)
        return new ImageContent();
    }
}