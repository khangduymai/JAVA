public class EvenDigitSum {

    public static void main(String[] args){
        System.out.println(getEvenDigitSum(-123456789));
    }

    public static int getEvenDigitSum(int num){

        if(num < 0)
            return -1;


        int sumEvenDigit = 0;

        while(num > 0){

          int lastDigit = num %10;

          if(lastDigit %2 ==0){
              sumEvenDigit += lastDigit;
          }

          num /= 10;

        }

        return sumEvenDigit;
    }

   /* public static boolean isDigitEven(int num){

        if(num % 2 == 0)
            return true;
        else
            return false;
    }*/
}
