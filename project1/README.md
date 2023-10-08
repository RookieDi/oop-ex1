
## Componentele Codului

### Clasa BazaDate

Clasa `BazaDate` reprezintă informațiile personale ale unei persoane. Conține următoarele atribute:

- `sex`: Gen (Masculin sau Feminin).
- `nume`: Prenume.
- `prenume`: Nume de familie.
- `CNP`: Număr de Identificare Personală.
- `judet`: Divizie administrativă.
- `localitate`: Localitate.
- `strada`: Stradă.
- `nr_strada`: Numărul străzii.
- `varsta`: Vârsta.
- `cod_postal`: Cod poștal.

#### Constructori

Clasa `BazaDate` are un constructor care vă permite să creați o nouă persoană cu informațiile furnizate.

#### Metode

- `validateAge()`: Validează dacă persoana este adultă (vârsta >= 18 ani).
- `updateAdress()`: Actualizează informațiile adresei.
- `updateFull_name()`: Actualizează numele complet.
- `generateEmail()`: Generează o adresă de e-mail.
- `toString()`: Generează o reprezentare sub formă de șir a informațiilor persoanei.

### Clasa main

Clasa `main` este punctul de intrare al aplicației. Furnizează o interfață bazată pe meniu pentru interacțiunea cu obiecte `BazaDate`. Puteți adăuga, valida vârsta, actualiza adresele, actualiza numele complet, genera adrese de e-mail și afișa informații.



### Clasa permis

Clasa `permis` reprezintă un permis de conducere. Conține atribute precum `model`, `culoare` și `tip`.

#### Constructori

Clasa `permis` are mai mulți constructori pentru crearea unui obiect de permis de conducere cu niveluri diferite de detalii.

#### Metode

- `getModel()`, `getColor()`, `getTip()`: Metode de obținere a valorilor atributelor.
- `setModel()`, `setColor()`, `setTip()`: Metode de stabilire a valorilor atributelor.
- `toString()`: Generează o reprezentare sub formă de șir a permisului de conducere.


