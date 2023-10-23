

interface INotification {
    void trimiteNotificare(String mesaj);
}

class Task implements INotification {
    private String descriere;
    private StringBuffer notificari;
    private String status="Ne-finalizat";


    public Task(String descriere) {
        this.descriere = descriere;

        notificari = new StringBuffer();
    }

    public void finalization() {

        String notificare = "Task-ul \"" + descriere + "\" a fost inserat.";
        notificari.append(notificare);
        trimiteNotificare(notificare);
    }
    public String getStatus(){
        return status;
    }

    public void toggleStatus() {
        if (status.equals("Ne-finalizat")) {
            status = "Finalizat";
        } else {
            status = "Ne-finalizat";
        }
    }

    public String getDescriere() {
        return descriere;
    }


    public String getNotifications() {
        return notificari.toString();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        System.out.println("Notificare " + mesaj);
    }

    @Override
public String toString() {
    return "<html>Task: " + descriere + "<br>Status: " + status + "<br>Notificari:<br>" + notificari.toString() + "</html>";
}


}
