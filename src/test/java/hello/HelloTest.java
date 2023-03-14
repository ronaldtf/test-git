package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import main.java.hello.HelloWorld;

/**
 * Unit test for simple App.
 */
public class HelloTest {

    @Test
    public void testTime() {
        HelloWorld app1 = new HelloWorld();
        HelloWorld app2 = new HelloWorld();
        assertNotEquals(app1.getCurrentTime(), app2.getCurrentTime());
    }
}