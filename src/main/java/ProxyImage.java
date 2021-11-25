import lombok.Getter;
import lombok.Setter;

public class ProxyImage implements Image{

    @Getter
    private final String filename;
    @Getter
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
