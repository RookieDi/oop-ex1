public class permis {
    private String model;
    private String culoare;
    private String tip;


    public permis(String model) {
        this.model = model;
    }


    public permis(String model, String culoare) {
        this.model = model;
        this.culoare = culoare;
    }


    public permis(String model, String culoare, String tip) {
        this.model = model;
        this.culoare = culoare;
        this.tip = tip;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getColor(){
        return culoare;
    }
    public void setColor(String culoare){
        this.culoare=culoare;
    }
    public String getTip(){
        return tip;
    }
    public void setTip(String tip){
        this.tip=tip;
    }
    public String toString() {
        return " model: " + model + "\nCuloare: " + culoare + "\nTip: " + tip;
    }

}
