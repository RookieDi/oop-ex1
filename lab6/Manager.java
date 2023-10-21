import java.util.Scanner;

public class Manager {
private CititorTastatura cititor;
private String cool_message;


public Manager(CititorTastatura cititor){
    this.cititor=cititor;
    this.cool_message="Saluuut";

}
public String afiseazaMesaj(){
return "Mesajul este:"+cool_message;
}

public String citesteMesaj() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Introduceti mesajul:");
    return scan.nextLine();
}
}
