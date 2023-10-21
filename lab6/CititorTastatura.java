import java.util.Scanner;

public class CititorTastatura {
private String message;
private String source;
public CititorTastatura(String messae,String source){
    this.message=message;
    this.source=source;
}
public void citesteTastatura(){
    Scanner scan=new Scanner(System.in);
    System.out.println("introduceti mesajul");
    this.message=scan.nextLine();
    System.out.println("Introduceti sursa");
    this.source=scan.nextLine();
}

}
