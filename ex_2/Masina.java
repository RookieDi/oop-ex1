import java.util.Scanner;
public class Masina {
    private String tip;
    private String culoare;
    private double viteza;

    public Masina(String tip, String culoare, double viteza) {
        this.tip = tip;
        this.culoare = culoare;
        this.viteza = viteza;

    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getColor() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getSpeed() {
        return viteza;
    }

    public void setSpeed(double viteza) {
        this.viteza = viteza;
    }

    public String toString() {
        return "Masina: Tip = " + tip + ", Culoare = " + culoare + 
        ", Viteza = " + viteza;
    }
}

