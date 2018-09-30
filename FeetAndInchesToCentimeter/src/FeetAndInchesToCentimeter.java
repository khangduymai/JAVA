public class FeetAndInchesToCentimeter {

    public static void main(String[] args){
        //calcFeetAndInchesToCentimeter(1,8);
        //calcFeetAndInchesToCentimeter(150);

        double NewResult = calcFeetAndInchesToCentimeter(150);
        System.out.println("Result is = " + NewResult + " cm");
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches){

        if(feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid Feet or Inches");
            return -1;
        }

        double centimeter = (feet * 12) * 2.54; // convert feet to inches
        centimeter += inches * 2.54;
        //System.out.println(feet + " feet " + inches + " inches" + " = " +centimeter + " cm");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeter(double inches){

        if(inches < 0){
            System.out.println("Invalid Inches");
            return -1;
        }

        double feet = (int)inches / 12;
        double remainInches = (int)inches % 12;
        System.out.println(inches + " inches = " + feet + " feet " + remainInches + " inches");
        return calcFeetAndInchesToCentimeter(feet, remainInches);


    }
}
