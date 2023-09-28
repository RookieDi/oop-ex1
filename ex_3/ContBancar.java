public class ContBancar {
    private double sold=0.0;

    public ContBancar(double sold){
       this.sold=sold;
    }
    public void depozitareSuma(double suma)    {
        if(suma>0){
        sold +=suma;
        System.out.println("Suma depusa: " + suma);
            System.out.println("Soldul curent: " + sold);
        } else {
            System.out.println("Suma introdusa nu este valida.");
        }
        
    }
    public void extract(double suma) {
       if(suma >0 && suma<=sold){
        sold -=suma;
        System.out.println("Extraction successfully new balance:" +sold);
       }
       else{
        System.out.println("Invalid balance insufficient");
       }
    }
    public double getBalanta(){
        return sold;
    }

}
