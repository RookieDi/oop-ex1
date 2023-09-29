D## Documentație Java - Cont Bancar

### Introducere

Acest proiect Java implementează o clasă numită `ContBancar` care simulează operațiuni simple 
pe un cont bancar. Clasa permite depunerea și extragerea de sume de bani din cont și furnizează informații despre soldul curent al contului.

### Cum funcționează

Clasa `ContBancar` are următoarele funcționalități:

## Constructor

Clasa conține un constructor care primește un sold inițial și îl stochează în cont.

## `depozitareSuma(double suma)`

Metoda `depozitareSuma` permite depunerea unei sume de bani în cont.
Această metodă verifică dacă suma depusă este mai mare decât zero și, în caz afirmativ, 
adaugă suma la soldul contului. Metoda afișează sumele depuse și soldul curent după fiecare depunere.

## `extract(double suma)`

Metoda `extract` permite extragerea unei sume de bani din cont.
Pentru a efectua o extragere, suma trebuie să fie mai mare decât zero și să nu
depășească soldul curent al contului. Dacă condițiile sunt îndeplinite, metoda scade suma din sold. În caz contrar, se afișează un mesaj de eroare.

## `getBalanta()`

Metoda `getBalanta` furnizează soldul curent al contului.
