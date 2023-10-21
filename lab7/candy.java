// Clasa de bază CandyBox
public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " has volume " + getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandyBox candyBox = (CandyBox) o;

        if (!flavor.equals(candyBox.flavor)) return false;
        return origin.equals(candyBox.origin);
    }
}

// Clasa derivată Lindt
public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {
    }

    public Lindt(float length, float width, float height, String flavor, String origin) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

// Clasa derivată Baravelli
public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {
    }

    public Baravelli(float radius, float height, String flavor, String origin) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

// Clasa derivată ChocAmor
public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor() {
    }

    public ChocAmor(float length, String flavor, String origin) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
