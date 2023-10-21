## CititorTastatura

`CititorTastatura` este o clasă care vă permite să citiți mesaje de la tastatură.

### Atribute

- `message` (String): Mesajul citit de la tastatură.
- `source` (String): Sursa mesajului citit.

### Constructor

#### `CititorTastatura(String message, String source)`

- **Descriere:** Constructor pentru inițializarea atributele `message` și `source`.
- **Parametri:**
  - `message` (String): Mesajul citit de la tastatură.
  - `source` (String): Sursa mesajului citit.

### Metode

#### `citesteTastatura()`

- **Descriere:** Această metodă citește mesajul și sursa de la tastatură și le stochează în atributele corespunzătoare.

## Manager

`Manager` este o clasă care utilizează `CititorTastatura` pentru a gestiona mesaje.

### Atribute

- `cititor` (CititorTastatura): O instanță a clasei `CititorTastatura` utilizată pentru citirea mesajelor.
- `cool_message` (String): Un mesaj predefinit, "Saluuut".

### Constructor

#### `Manager(CititorTastatura cititor)`

- **Descriere:** Constructor pentru inițializarea atributelor `cititor` și `cool_message`.
- **Parametru:**
  - `cititor` (CititorTastatura): O instanță a clasei `CititorTastatura`.

### Metode

#### `afiseazaMesaj()`

- **Descriere:** Această metodă returnează un mesaj format cu `cool_message`.

#### `citesteMesaj()`

- **Descriere:** Această metodă citește un mesaj de la tastatură folosind `Scanner` și îl returnează.

