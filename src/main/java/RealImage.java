import lombok.Getter;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RealImage implements Image {

    @Getter
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        System.out.println("Displaying image from file " + this.filename + ".");

        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void loadFromDisk() {
    System.out.println("Loading image " + this.filename + " from disk.");
    }
}
