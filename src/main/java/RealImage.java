public class RealImage implements Image {

    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        System.out.println("Displaying image from file " + this.filename + ".");
    }

    public void loadFromDisk() {
    System.out.println("Loading image " + this.filename + " from disk.");
    }
}