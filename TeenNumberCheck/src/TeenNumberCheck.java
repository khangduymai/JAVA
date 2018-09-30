public class TeenNumberCheck {

    public static void main(String[] args){
        hasTeen(13,99,100);
        hasTeen(11,99,100);
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)){
            System.out.println("True");
            return true;
        }
        else
            System.out.println("False");
            return false;
    }
}
