public class AreaCalculator {

    public static final double PI = 3.14159;

    public static void main(String[] args){
        area(5.0);
        area(-1);
        area(5.0,4.0);
        area(-1.0,4.0);
    }

    public static double area(double radius){

        if(radius < 0.0){
            System.out.println("Invalid radius");
            return -1.0;
        }

        double areaCircle = radius * radius * PI;
        System.out.println("Area of Circle = " + areaCircle);
        return areaCircle;
    }

    public static double area(double x, double y){

        if(x < 0.0 || y < 0.0){
            System.out.println("Invalid x or y");
            return -1.0;
        }

        double areaRectangle = x * y;
        System.out.println("Area of Rectangle = " + areaRectangle);
        return areaRectangle;
    }
}
