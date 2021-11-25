import java.nio.file.Path;
import java.nio.file.Paths;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Path currentRelativePath = Paths.get("");
        String p = currentRelativePath.toAbsolutePath().toString();
        String filename = p + "\\" + "cat_for_you.jpg";
        Image img = new ProxyImage(filename);

        img.display();
    }
}
