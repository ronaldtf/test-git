package main.java.hello;

public class Greeter {
    public String sayHello() {
        return "Hello World! How are you today?";
    }
    public void printVersion() {
	System.out.println("Current JVM version - " + Runtime.version());
    }
}
