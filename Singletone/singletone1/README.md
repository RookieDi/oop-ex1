# Logger - Clasa Singleton

Aceasta este clasa Logger care implementează modelul Singleton pentru înregistrarea mesajelor.

## Constructor
Constructorul clasei Logger este privat, ceea ce înseamnă că obiecte din afara clasei nu pot fi create direct. Acesta inițializează instanța Logger și afișează un mesaj de inițializare.

## Singleton
Metoda statică `getInstance` furnizează instanța unică a clasei Logger folosind modelul Singleton. Dacă nu există încă o instanță, se creează una nouă; altfel se returnează instanța existentă.

## Înregistrarea mesajelor
Metoda `log` permite înregistrarea mesajelor. Ea afișează mesajul specificat, prefixat cu "Log: ".
