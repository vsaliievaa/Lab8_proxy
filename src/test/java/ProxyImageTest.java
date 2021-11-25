import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {

    private ProxyImage proxyImage;

    @BeforeEach
    void setUp() {
        proxyImage = new ProxyImage("some_image.png");
    }

    @Test
    void getFilename() {
        assertEquals("some_image.png", proxyImage.getFilename());
    }

    @Test
    void getRealImage() {
//        assertInstanceOf(Class<RealImage>, proxyImage.getRealImage());
    }
}