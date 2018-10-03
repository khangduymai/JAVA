public class NumberPalindrome {

    public static void main(String[] args){
/*        int num =121;
        int temp = num;
        int reverse =0;
        while(num > 0){

            int lastDigit = num % 10;
            reverse = reverse*10 + lastDigit;
            num /= 10; // This is the number after removing last digit
        }
        System.out.println("This is a reverse num: " +reverse);

        if(reverse==temp)
            System.out.println("true");*/


/*        int x =12;
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        System.out.println(div);
        while (x != 0) {
            int l = x / div;
            int r = x % 10;
            if (l != r) System.out.println("False");
            x = (x % div) / 10;
            div /= 100;
        }*/

        isPalindrome(123);
        isPalindrome(121);
        isPalindrome(-121);

        //System.out.println(-12/10);
    }

    public static boolean isPalindrome(int num){
        int reverse = 0;
        int lastDigit;


        if(num <0)
            num *= -1;

        int temp = num;

        while(num > 0){

            lastDigit = num % 10;
            reverse = reverse*10 + lastDigit;
            num /= 10; // This is the number after removing last digit
        }

        if(reverse == temp) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}
