public class ProxyImage implements Image{

    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(this.filename);
        }
        this.realImage.display();
    }
}
