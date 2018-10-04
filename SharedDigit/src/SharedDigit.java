public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 65));

        //13,33
        //30,13
        //15, 65
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (num1 > 0) {
            int lastDigitNum1 = num1 % 10;


/*            for (int copyNum2 = num2; copyNum2 > 0; copyNum2 /= 10) {
                int lastDigitNum2 = copyNum2 % 10;

                if (lastDigitNum1 == lastDigitNum2) {
                    return true;
                }
            }*/

            int copyNum2 = num2;

            while (copyNum2 > 0) {
                int lastDigitNum2 = copyNum2 % 10;

                if (lastDigitNum1 == lastDigitNum2) {
                    return true;
                }

                copyNum2 /= 10;

            }

            num1 /= 10;

        }


        return false;
    }
}




//Below is the wrong code which will have buggy

/*        boolean hasSharedDigit = true;

        while (num1 > 0) {
            int lastDigitNum1 = num1 % 10;

            while (num2 > 0) {
                int lastDigitNum2 = num2 % 10;

                if (lastDigitNum1 != lastDigitNum2) {
                    hasSharedDigit = false;
                } else {
                    hasSharedDigit = true;
                }


                num2 /= 10;

            }

            num1 /= 10;
        }

        return hasSharedDigit;
    }*/



