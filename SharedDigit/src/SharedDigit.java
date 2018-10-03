public class SharedDigit {

    public  static void main(String[] args){
        System.out.println(hasSharedDigit(10,23));
    }

    public static boolean hasSharedDigit(int num1, int num2){

        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        boolean hasSharedDigit = true;

        while(num1 > 0){
            int lastDigitNum1 = num1 % 10;

            while(num2 > 0){
                int lastDigitNum2 = num2 % 10;

                if(lastDigitNum1 != lastDigitNum2){
                    hasSharedDigit = false;
                }
                else{
                    hasSharedDigit = true;
                }


                num2 /= 10;

            }

            num1 /= 10;
        }

        return hasSharedDigit;
    }
}
