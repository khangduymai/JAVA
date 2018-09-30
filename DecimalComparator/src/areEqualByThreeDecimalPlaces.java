public class areEqualByThreeDecimalPlaces {

    public static void main(String[] args){
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 *=1000;
        num2 *=1000;

        int firstCast = (int)num1;
        int secondCast = (int)num2;

        if(firstCast == secondCast){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }

    }
}
