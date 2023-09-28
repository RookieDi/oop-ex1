public class Gradina {
    public String legume;
    public String fructe;
    private Planta planta;
    public double productie;
    private String nume;

    public Gradina(String legume,String fructe,double productie){
        this.legume=legume;
        this.fructe=fructe;
        this.productie=productie;
    }
    public Gradina(){
        this.planta=new Planta("Nespecificata");
    }

    public Planta getPlanta(){
        return planta;
    }
    public void setPlanta(Planta planta){
        this.planta=planta;
    }
    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
       this.nume=nume;
    }
    public void legumee(){
        if(legume.length()<4){
            System.out.println("Exista putine legume");
        }
        System.out.println("Legumele pe care le avem sunt:"+legume);
    }
    public void prod(){
        if(productie<2000){
            System.out.println("Productia pe anul acesta este cam mica \n"+productie);
        }
        System.out.println("Productia este destul de buna\n"+productie);
    }
}


