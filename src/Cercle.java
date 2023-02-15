public class Cercle {

    public static double perimeter(double rayon){
        double perimeter =  0.0;
        perimeter = 2 * Math.PI * rayon;
        return perimeter;
    }

    public static double area(double rayon){
        double area =  0.0;
        area = Math.PI * Math.pow(rayon,2);
        return area;
    }
}
