package singletone1;
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Mesaj");
        logger.log("Alt mesaj.");
    }
}

