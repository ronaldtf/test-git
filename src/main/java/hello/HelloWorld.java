package main.java.hello;

import java.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
    	System.out.println("The current local time is: " + new HelloWorld().getCurrentTime());

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
	    System.out.println(greeter.getVersion());
    }

    public  LocalTime getCurrentTime() {
        return LocalTime.now();
    }
}
