
import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduceti numarul de persoane");
        int n=scanner.nextInt();


        //declarare tablou pentru a stocale instantele
        persoana[] persoane=new persoana[n];

        for(int i=0;i<n;i++){
            System.out.println("Introduceti datele");
            System.out.println("Nume");
            String nume=scanner.next();
            System.out.println("Introduceti Prenumele");
            String prenume=scanner.next();
            System.out.println("CNP");
            int cnp=scanner.nextInt();
            System.out.println("Anul nasterii");
            int an=scanner.nextInt();
            System.out.println("Introduceti varsta");
            int varsta=scanner.nextInt();

            persoane[i]=new persoana(nume, prenume,cnp,an,varsta);
        }

        int middleAge=calculMedie(persoane);
        System.out.println("Varsta medie"+middleAge);
    }

    private static int calculMedie(persoana[] persoane) {
        int n = persoane.length;
        if (n == 0) {
            return 0;
        }
        int[] age = new int[n];
        for (int i = 0; i < n; i++) {
            age[i] = persoane[i].getVarsta();
        }
        java.util.Arrays.sort(age);
        if (n % 2 == 0) {
            // Correct the average calculation
            return (age[n / 2 - 1] + age[n / 2]) / 2;
        } else {
            return age[n / 2];
        }
    }

}

