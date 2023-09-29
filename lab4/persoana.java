public class persoana {
    private String Nume;
    private String Prenume;
    private int CNP;
    private int an_nastere;
    private int luna_nastere;
    private int ziua_nastere;
    private String adresa;
    private int varsta;


    public persoana(String Nume,String Prenume,int CNP,int an_nastere,int varsta){
        this.Nume=Nume;
        this.Prenume=Prenume;
        this.CNP=CNP;
        this.an_nastere=an_nastere;
        this.varsta=varsta;
    }



    public int getZiua(){
        return ziua_nastere;
    }
    public void setZiua(int ziua_nastere){
        this.luna_nastere=ziua_nastere;
    }

    public int getVarsta(){
        return varsta;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public boolean validare(){
        int min=18;
        return varsta>=min;
    }

    }


