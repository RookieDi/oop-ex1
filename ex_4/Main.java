public class Main {
    public static void main(String[] args) {
        Planta planta1 = new Planta("Trandafir", "Rosa");
        planta1.setCuloare("Roșu");
        planta1.setDimensiune(30.5);

        Planta planta2 = new Planta("Orhidee");
        planta2.setCuloare("Alb");
        planta2.setDimensiune(15.0);

        planta1.creste();
        planta2.disparitie();

        Gradina gradina1 = new Gradina("Rosii, castraveti",
        "Mere, pere",20.5);


        Gradina gradina2 = new Gradina("Cartofi, morcovi",
        "Prune, cirese",30.6);
        gradina2.setPlanta(planta1);

        gradina1.legumee();
        gradina1.prod();

        gradina2.legumee();
        gradina2.prod();
    }
}
