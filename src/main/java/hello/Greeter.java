package main.java.hello;

public class Greeter {
    public String sayHello() {
        return "Hello World! How are you today?";
    }
    public String getVersion() {
	    return "Current JVM version - " + Runtime.version();
    }
}
