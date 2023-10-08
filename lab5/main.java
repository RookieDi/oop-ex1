import java.util.Scanner;
import calculGrade.Grade;

public class main{
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Temperatura in celsius");
    double celsiustemp=scan.nextDouble();
    double fahrentemp=Grade.convertCtoF(celsiustemp);
    System.out.println(celsiustemp+"in fahren este "+fahrentemp);

    System.out.println("Introduceti temperatura in fahren");
    double fahreninp=scan.nextDouble();
    double celsiusinp=Grade.convertCtoC(fahreninp);
    System.out.println(fahreninp+"in celsius este"+celsiusinp);

    scan.close();
}



}


