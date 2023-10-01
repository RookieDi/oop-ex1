# Exemplu de Singleton în Java

Acest proiect conține un exemplu simplu de implementare a Singleton în limbajul de programare Java.

## Clasa `singletone`

- `public static singletone getInstance()`: Aceasta este o metodă statică care returnează o instanță a clasei Singleton. Dacă nu există încă o instanță, se creează una nouă și se returnează.

- `public String getMesaj()`: Această metodă permite să obții valoarea stocată în variabila `mesaj`.

- `public void setMesaj(String mesaj)`: Această metodă permite să setezi o valoare nouă pentru variabila `mesaj`.

## Clasa `main`

Această clasă conține metoda `main()`, care este punctul de intrare în program. În cadrul metodei `main()`, sunt efectuate următoarele acțiuni:

1. Se obține o instanță a clasei Singleton utilizând metoda `getInstance()`.
2. Se afișează mesajul stocat în instanța Singleton.
3. Se setează un nou mesaj în instanța Singleton.
4. Se obține o altă instanță a clasei Singleton utilizând din nou metoda `getInstance()`.
5. Se compară cele două instanțe pentru a verifica dacă sunt aceleași sau diferite și se afișează rezultatul.
6. Se afișează mesajul stocat în a doua instanță Singleton.

Aceasta este o prezentare a metodelor și acțiunilor din codul tău Java. Această explicație face codul mai ușor de înțeles pentru utilizatori atunci când accesează repository-ul tău GitHub.
