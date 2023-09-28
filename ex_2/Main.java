import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Introduceti tipul autovehiculului");
      String var2 = var1.next();
      System.out.println("Introduceti culoarea autovehiculului");
      String var3 = var1.next();
      System.out.println("Introduceti viteza autovehiculului");
      double var4 = var1.nextDouble();
      Masina var6 = new Masina(var2, var3, var4);
      System.out.println(var6);
      var1.close();
   }
}

