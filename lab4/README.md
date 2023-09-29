# Sistem de Gestionare a Persoanelor în Java

Acesta este un program simplu în Java pentru gestionarea informațiilor despre persoane, inclusiv nume, vârstă și altele. Programul vă permite să introduceți date pentru mai multe persoane și să calculați vârsta mediană a acestora.

## Cuprins
- [Introducere](#introducere)
- [Utilizare](#utilizare)
- [Clasa `persoana`](#clasa-persoana)
- [Clasa `main`](#clasa-main)


## Introducere
Acest program în Java este conceput pentru a gestiona și calcula informații despre persoane. Puteți introduce date pentru mai multe persoane, inclusiv numele lor, vârsta și alte detalii, și acesta calculează vârsta mediană dintre ele.

## Clasa `persoana`
Clasa `persoana` este folosită pentru a reprezenta o persoană. Aceasta are următoarele atribute:

- `Nume`: Numele de familie al persoanei.
- `Prenume`: Prenumele persoanei.
- `CNP`: CNP-ul persoanei (presupunând că este un număr de identificare unic).
- `an_nastere`: Anul nașterii.
- `luna_nastere`: Luna nașterii.
- `ziua_nastere`: Ziua nașterii.
- `adresa`: Adresa persoanei (ar putea fi adăugată ulterior).
- `varsta`: Vârsta persoanei.

### Metode Publice
- `int getZiua()`: Obține ziua nașterii.
- `void setZiua(int ziua_nastere)`: Setează ziua nașterii.
- `int getVarsta()`: Obține vârsta.
- `void setVarsta(int varsta)`: Setează vârsta.
- `boolean validare()`: Realizează validarea vârstei. Metoda `validare` verifică dacă vârsta persoanei este de cel puțin 18 ani.

## Clasa `main`
Clasa `main` conține metoda `main` și se ocupă de interacțiunea cu utilizatorul. Ea permite utilizatorilor să introducă date pentru mai multe persoane și să calculeze vârsta mediană dintre ele.

### Metode Publice
- `public static void main(String[] args)`: Metoda principală a programului care inițializează aplicația și permite utilizatorilor să introducă date pentru mai multe persoane. De asemenea, calculează și afișează vârsta mediană a acestora.
- `private static int calculMedie(persoana[] persoane)`: Metoda privată care calculează vârsta medie a persoanelor dintr-un tablou de obiecte `persoana`.


