public class SumDigits {

    public static void main(String[] args) {

/*
        int num = 1346;
        System.out.println( num/10);
*/
        System.out.println(sumDigits(11));
    }

    public static int sumDigits(int num) {
        int sumDigits = 0;
        if (num < 10) {
            return -1;
        }

        while (num > 0) {
            sumDigits += num % 10;
            num = num / 10;
        }
        return sumDigits;
    }


}
