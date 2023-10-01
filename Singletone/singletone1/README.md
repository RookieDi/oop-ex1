```java
package singletone1;

public class Logger {
    // Private static variable to store the unique instance of the Logger class
    private static Logger instance;

    // Constructor
    // The Logger class constructor is private, which means objects from outside the class cannot be created directly. It initializes the Logger instance and displays an initialization message.
    private Logger() {
        System.out.println("Logger initialized");
    }

    // Singleton
    // The static getInstance method provides the unique instance of the Logger class using the Singleton pattern. If there is no instance yet, a new one is created; otherwise, the existing instance is returned.
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logging Messages
    // The log method allows for logging messages. It displays the specified message with the "Log: " prefix.
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

