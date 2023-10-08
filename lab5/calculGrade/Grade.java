package calculGrade;

public class Grade{
   
    public static double convertCtoF(double celsius){
        double fahren=(celsius *9/5)+32;
        return fahren;
    }

    public static double convertCtoC(double fahren){
    double celsius=(fahren-32)*5/9;
    return celsius;
    }
}

