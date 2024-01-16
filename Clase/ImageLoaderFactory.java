package Clase;
public class ImageLoaderFactory {
    public ImageLoader create(String type) {
        if (type.equalsIgnoreCase("BMP")) {
            return new BMPImageLoader();
        } else if (type.equalsIgnoreCase("JPG")) {
            return new JPGImageLoader();
        } else {
            throw new IllegalArgumentException("Unknown image type: " + type);
        }
    }
}