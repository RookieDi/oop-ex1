public class singletone {
    private static singletone instance;
    private String mesaj;
    private singletone(){
        mesaj="Salut";
    }
    public static singletone getInstance(){
        if(instance ==null){
            instance=new singletone();
        }
        return instance;
    }
    public String getMesaj(){
        return mesaj;
    }
    public void setMesaj(String mesaj){
        this.mesaj=mesaj;
    }
}
