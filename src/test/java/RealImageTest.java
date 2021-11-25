import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealImageTest {

    private RealImage image;

    @BeforeEach
    void setUp() {
        image = new RealImage("some_image.jpg");
    }

    @Test
    void getFilename() {
        assertEquals("some_image.jpg", image.getFilename());
    }
}