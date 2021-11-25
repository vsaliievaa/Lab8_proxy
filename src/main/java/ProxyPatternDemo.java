public class ProxyPatternDemo {
    public static void main(String[] args) {
        String filename = "image.jpg";
        Image img = new ProxyImage(filename);

        img.display();
    }
}
