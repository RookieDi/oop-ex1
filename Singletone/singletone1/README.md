## Logger.java

```java
package singletone1;

public class Logger {
    // Variabilă statică privată care stochează instanța unică a clasei Logger
    private static Logger instance;

    // ## Constructor
    // Constructorul clasei Logger este privat, ceea ce înseamnă că obiecte din afara clasei nu pot fi create direct. Acesta inițializează instanța Logger și afișează un mesaj de inițializare.
    private Logger() {
        System.out.println("Logger inițializat");
    }

    // ## Singleton
    // Metoda statică getInstance furnizează instanța unică a clasei Logger folosind modelul Singleton. Dacă nu există încă o instanță, se creează una nouă; altfel se returnează instanța existentă.
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // ## Înregistrarea mesajelor
    // Metoda log permite înregistrarea mesajelor. Ea afișează mesajul specificat împreună cu prefixul "Log: ".
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
