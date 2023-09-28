//import java.util.Random;
import java.util.Scanner;

//ex 1
/*class lab1 {
    public static void main(String args[]){

        System.out.println("Introduceti doua numere");
        int nr1=1;
        int nr2=2;
        Random rnd=new Random();
        System.out.println("Inmultirea cu numar random este:");
       System.out.println("Primul numar inmultit cu numarul random este:");
        System.out.println(nr1*rnd.nextInt(255));
        System.out.println("Al doilea numar inmultit cu numarul random este:");
        System.out.println(nr2*rnd.nextInt(255));
        System.out.println("Suma celor doua numere este:");
        System.out.println(nr1+nr2);
        System.out.println("Catul este:");
        System.out.println(nr1/nr2);
        System.out.println("Restul este:");
        System.out.println(nr1%nr2);
    }
}*/

//ex2
/*class lab1 {
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduceti doua numere");
        int nr1=sc.nextInt();
        int nr2=sc.nextInt();
        Random rnd=new Random();
        System.out.println("Inmultirea cu numar random este:");
        System.out.println("Primul numar inmultit cu numarul random este:");
        System.out.println(nr1*rnd.nextInt(255));
        System.out.println("Al doilea numar inmultit cu numarul random este:");
        System.out.println(nr2*rnd.nextInt(255));
        System.out.println("Suma celor doua numere este:");
        System.out.println(nr1+nr2);
        System.out.println("Catul este:");
        System.out.println(nr1/nr2);
        System.out.println("Restul este:");
        System.out.println(nr1%nr2);
        }
        }*/

//ex3

/*public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Introduceti un numar de 4 cifre");
        int nr = a.nextInt();
        int meniu;

        do {
            System.out.println("0. Exit");
            System.out.println("1. Paritate ultima cifra");
            System.out.println("2. Paritate prima cifra");
            System.out.println("3. Suma cifre");
            meniu = a.nextInt();

            switch (meniu) {
                case 1:
                    int last = nr % 10;
                    if (last % 2 == 0) {
                        System.out.println("Ultima cifra este para.");
                    } else {
                        System.out.println("Ultima cifra nu este para.");
                    }
                    break;
                case 2:
                    int first = nr / 1000;
                    if (first % 2 == 0) {
                        System.out.println("Prima cifra este para.");
                    } else {
                        System.out.println("Prima cifra nu este para.");
                    }
                    break;
                case 3:
                    int sum = 0;
                    int num = nr;
                    while (num != 0) {
                        int digit = num % 10;
                        sum += digit;
                        num /= 10;
                    }
                    System.out.printf("Suma cifrelor este %d%n", sum);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Optiune invalida. Va rugam sa alegeti o optiune valida.");
                    break;
            }
        } while (meniu != 0);

        a.close();
    }
}
*/
//ex4

class Main{
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);
        System.out.println("Introduceti un numar real ");
        float x=b.nextFloat();
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        System.out.println("Sinusul numarului este: " + sinX);
        System.out.println("Cosinusul numarului este: " + cosX);

        if(x>=0){
            double radical=Math.sqrt(x);
            System.out.println("Radicalul numarului este: " + radical);
        } else {
            System.out.println("Nu puteti calcula radicalul unui numar negativ.");
        }
        b.close();
    }
}