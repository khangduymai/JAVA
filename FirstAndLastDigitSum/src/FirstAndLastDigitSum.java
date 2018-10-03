public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(8143));
        //System.out.println(11/10);


    }

    public static int sumFirstAndLastDigit(int num) {

        int sum = 0;

        if (num < 0)
            return -1;

        int lastDigit = num % 10;

        /*int div = 1;
        int num =123;
        while (num / div >= 10) {

            div *= 10;
        }

        if (num < 10) {
            sum = num + num;
        } else {
            num /= div;
            sum = num + lastDigit;
        }*/

        if (num < 10) {
            sum = num + num;
        }

        while(num >= 10){
                num /= 10;
                sum = num + lastDigit;
            }



        return sum;

    }
}
