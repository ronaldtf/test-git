package hello;

import org.junit.jupiter.api.Test;

import main.java.hello.Greeter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GreeterTest {

    @Test
    public void testMessage() {
        Greeter greeter = new Greeter();
        assertEquals("Hello World! How are you today?", greeter.sayHello());
    }

    @Test
    public void testPrintVersion() {
        Greeter g1 = new Greeter();
        Greeter g2 = new Greeter();
        assertEquals(g1.getVersion(), g2.getVersion());
    }


}
