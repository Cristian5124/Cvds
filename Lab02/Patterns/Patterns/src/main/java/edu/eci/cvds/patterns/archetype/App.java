package edu.eci.cvds.patterns.archetype;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World!");
        } else {
            StringBuilder greeting = new StringBuilder("Hello");
            for (String arg : args) {
                greeting.append(" ").append(arg);
            }
            greeting.append("!");
            System.out.println(greeting);
        }
    }
}
