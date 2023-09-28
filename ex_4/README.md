Documentație Java - Plante și Grădină
Introducere
Acest proiect Java conține trei clase: Planta, Gradina și Main, care modelează plantele, grădinile și operațiile cu acestea. Documentația de mai jos oferă detalii despre fiecare clasă și modul în care funcționează.

Clasa Planta
Clasa Planta modelează caracteristicile și comportamentul plantelor. Aceasta are următoarele atribute și metode:

Atribute
nume: Numele plantei (public)
specie: Specia plantei (public)
culoare: Culoarea plantei (privat)
dimensiune: Dimensiunea plantei (privat)
Constructori
Planta(String nume, String specie): Constructor care primește numele și specia plantei.

Planta(String specie): Constructor care primește doar specia plantei, iar numele este setat implicit ca "Nu există documentație".

Metode
getCuloare(): Returnează culoarea plantei.
setCuloare(String culoare): Setează culoarea plantei.
getDimensiune(): Returnează dimensiunea plantei.
setDimensiune(double dimensiune): Setează dimensiunea plantei.
creste(): Afișează un mesaj despre creșterea plantei.
disparitie(): Afișează un mesaj despre dispariția plantei.
Clasa Gradina
Clasa Gradina modelează caracteristicile și activitățile grădinii. Aceasta are următoarele atribute și metode:

Atribute
legume: Lista de legume cultivate în grădină (public)
fructe: Lista de fructe cultivate în grădină (public)
productie: Cantitatea de producție (public)
planta: O referință la o plantă specifică (privat)
nume: Numele grădinii (privat)
Constructori
Gradina(String legume, String fructe, double productie): Constructor care primește legumele, fructele și cantitatea de producție ale grădinii.

Gradina(): Constructor fără argumente care inițializează planta la o valoare nespecificată.

Metode
getPlanta(): Returnează planta specifică din grădină.
setPlanta(Planta planta): Setează planta specifică din grădină.
getNume(): Returnează numele grădinii.
setNume(String nume): Setează numele grădinii.
legumee(): Afișează legumele cultivate în grădină și oferă informații despre cantitatea de legume.
prod(): Afișează informații despre producția grădinii.
Clasa Main
Clasa Main conține metoda main, care este punctul de intrare în aplicație. Aici sunt create instanțe ale claselor Planta și Gradina, iar operațiile pe aceste obiecte sunt exemplificate. Dacă doriți să extindeți sau să modificați funcționalitatea, puteți începe cu această clasă.