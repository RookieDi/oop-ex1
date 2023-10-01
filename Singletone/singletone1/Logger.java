package singletone1;
public class Logger {
    private static Logger instance;
    public String message;

    private Logger() {
        System.out.println("Logger initialized");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {

        System.out.println("Log: " + message);
    }
}
