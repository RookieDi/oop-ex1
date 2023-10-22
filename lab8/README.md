## Calculator Java

Această clasă Java și clasele sale de excepții asociate vă permit să efectuați operații pe valori double, gestionând diferite excepții.

### Clase de Excepții Personalizate

Sunt definite următoarele clase de excepții personalizate:

- `NullParameterException`: Aruncată atunci când un parametru este `null`.
- `OverflowException`: Aruncată atunci când rezultatul este `Double.POSITIVE_INFINITY`.
- `UnderflowException`: Aruncată atunci când rezultatul este `Double.NEGATIVE_INFINITY`.

### Interfața ICalculator

Interfața `ICalculator` definește următoarele metode:

#### `double add(Double a, Double b)`

Adaugă două valori double și returnează rezultatul.

Aruncă excepții în caz de nevoie:
- `NullParameterException` dacă oricare dintre operanzi este `null`.
- `OverflowException` dacă rezultatul este `Double.POSITIVE_INFINITY`.
- `UnderflowException` dacă rezultatul este `Double.NEGATIVE_INFINITY`.

#### `double divide(Double a, Double b)`

Împarte două valori double și returnează rezultatul.

Aruncă excepții în caz de nevoie:
- `NullParameterException` dacă oricare dintre operanzi este `null`.
- `OverflowException` dacă rezultatul este `Double.POSITIVE_INFINITY`.
- `UnderflowException` dacă rezultatul este `Double.NEGATIVE_INFINITY`.

#### `double average(List<Double> values)`

Calculează media unei liste de valori double și returnează rezultatul.

Aruncă excepții în caz de nevoie:
- `NullParameterException` dacă lista este `null` sau goală, sau dacă conține valori `null`.
- `OverflowException` dacă rezultatul este `Double.POSITIVE_INFINITY`.
- `UnderflowException` dacă rezultatul este `Double.NEGATIVE_INFINITY`.

### Clasa Calculator

Clasa `Calculator` implementează interfața `ICalculator`.

