class Planta{
 public String nume;
 public String specie;
 private String culoare;
 private double dimensiune;

    public Planta(String nume,String specie){
        this.nume=nume;
        this.specie=specie;
    }

    public Planta(String specie){
        this.specie=specie;
        this.nume="Nu exista documentatie ";
    }
    public String getCuloare(){
        return culoare;
    }
    public void setCuloare(String culoare){
        this.culoare=culoare;
    }
    public double getDimensiune(){
        return dimensiune;
    }
    public void setDimensiune(double dimensiune){
        this.dimensiune=dimensiune;
    }
    public void creste(){
        System.out.println("Planta "+nume+ " creste ");
    }
    public void disparitie(){
        System.out.println(specie+" este pe cale de disparitie");
    }
}

