

public class BazaDate{
    private String sex;
    private String nume;
    private String prenume;
    private int CNP;
    private String judet;
    private String localitate;
    private String strada;
    private int nr_strada;
    private double varsta;
    private int cod_postal;

    public BazaDate(String sex,String nume,String prenume,int CNP,
    String localitate,String strada,int nr_strada,double varsta,
    int cod_postal,String judet){
       this.sex=sex;
        this.nume=nume;
        this.prenume=prenume;
        this.CNP=CNP;
        this.localitate=localitate;
        this.strada=strada;
        this.nr_strada=nr_strada;
        this.varsta=varsta;
        this.cod_postal=cod_postal;
}

public boolean validateAge(){
    int minAge=18;
    return varsta >=minAge;
}

public void updateAdress(String localitate_noua,String strada_noua,
int nr_nou,int cod_nou){
    this.localitate=localitate_noua;
    this.strada=strada_noua;
    this.nr_strada=nr_nou;
    this.cod_postal=cod_nou;

}

public void updateFull_name(String nume_nou,String prenume_nou){
    this.nume=nume_nou;
    this.prenume=prenume_nou;
}

public String generateEmail() {
    String firstName=this.nume.toLowerCase();
    String lastName=this.prenume.toLowerCase();
    String emailsource="@yahoo.com";
    String email=firstName+ "." +lastName +emailsource;
    return email;
}

public String toString() {
    if(sex.equals("Male")){
        return "Domnul:"+ nume +" " +prenume +"Cu CNP-ul:"+CNP+ " " + 
        "judetul:" +judet + " " + " localitatea:" + localitate + " " +
        "strada:" + strada + " " + "nr_starda:" + nr_strada
    + " " +"varsta:"+varsta +" " +"Cod postal:"+cod_postal;   }

    return "Doamna:"+ nume +" " +prenume +"Cu CNP-ul:"+CNP+ " " + 
    "judetul:" +judet + " " + " localitatea:" + localitate + " " +
    "strada:" + strada + " " + "nr_starda:" + nr_strada
    + " " +"varsta:"+varsta +" " +"Cod postal:"+cod_postal;
}
}