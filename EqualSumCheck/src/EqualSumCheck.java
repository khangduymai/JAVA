public class EqualSumCheck {

    public static void main(String[] args){

    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        int totalNum1Num2 = num1 + num2;
        if(totalNum1Num2 == num3){
            System.out.println("true");
            return true;
        }
        else
            return false;
    }
}
