import java.util.Scanner;
import java.util.Random;
/*class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti soldul initial");
        double sold=0.0;
        sold=scan.nextDouble();
        ContBancar con=new ContBancar(sold);
        System.out.println("Introduceti prima suma pentru depunere");
        double sum1=scan.nextDouble();
        sold=con.getBalanta();
        System.out.println("Balanta dupa a doua suma este:");
        System.out.println(sold);
        System.out.println("Introduceti a doua suma pentru depunere");
        double sum2=scan.nextDouble();
        con.depozitareSuma(sum1);
        con.depozitareSuma(sum2);
        sold=con.getBalanta();
        System.out.println(sold);
        System.out.println("The sum that you want to extract");
        double extract_sum=scan.nextDouble();
        con.extract(extract_sum);

        scan.close();
    }
}*/
/*class Main{
    public static void main(String[] args){
        ContBancar cont=new ContBancar(1000-0);
        Scanner scan=new Scanner(System.in);
         Random rnd=new Random();
        int n=rnd.nextInt(1001);
        for(int i=0;i<n;i++){
            int operatieAleatoare = rnd.nextInt(2);
           double sumaAleatoare = 1 +rnd.nextDouble() * 1000;

            if (operatieAleatoare == 0) {
                // Efectuați o depunere
                cont.depozitareSuma(n);
                System.out.println("Depunere de " + sumaAleatoare +
                " efectuată. Soldul curent: " + cont.getBalanta());
            } else {
                // Efectuați o retragere
                cont.extract(sumaAleatoare);
                System.out.println("Retragere de " + sumaAleatoare +
                " efectuată. Soldul curent: " + cont.getBalanta());
            }
         }
         scan.close();
        }
}/* */

