public class main {
   public static void main(String [] args) {
    singletone single=singletone.getInstance();
    System.out.println("Mesajul:"+single.getMesaj());
    single.setMesaj("Mesaj pus de mine");

    singletone another=singletone.getInstance();

    if(single ==another){
        System.out.println("Aceeasi instanta");
    }
    else{
        System.out.println("Instanta diferita");
    }
    System.out.println("Mesaj:"+another.getMesaj());
   }
}
