public class NumberToWords {

    public static void main(String[] args){
         //System.out.println(reverse(123));
         //System.out.println(reverse2(-12305));
         //System.out.println(getDigitCount(reverse(1010)));
         System.out.println(getDigitCount(12300));
         //numberToWords(12300);

    }

    public static int reverse(int num){
        int convertToPositive;

        if(num == 0)
            return 0;
        else if(num <0) {
            convertToPositive = num * -1;
            String newConvert = "";
            int reverseLastDigit;
            while(convertToPositive > 0){
                int lastDigit = convertToPositive % 10;
                String convert = Integer.toString(lastDigit);
                newConvert += convert;
                convertToPositive /= 10;
            }
            reverseLastDigit= Integer.valueOf(newConvert);
            int convertToNegative= (reverseLastDigit * -1);
            return convertToNegative ;
        }
        else {
            String newConvert = "";
            int reverseLastDigit;
            while (num > 0) {
                int lastDigit = num % 10;
                String convert = Integer.toString(lastDigit);
                newConvert += convert;
                num /= 10;
            }

            reverseLastDigit = Integer.valueOf(newConvert);
            return reverseLastDigit;
        }
    }

    public static int reverse2(int num) {
        int result = 0;

        boolean negative = false;

        if (num < 0) {
            num *= -1;
            negative = true;
        }

        while (num > 0) {
            int lastDigit = num % 10;

            if (result != 0) {
                result = result * 10 + lastDigit;
            } else {
                result += lastDigit;
            }

            num /= 10;
        }

        return negative ? result * -1 : result;
    }

    public static int getDigitCount(int num){
        int count = 0;

        if(num >= 0 && num <=9)
            return 1;

        if(num < 0)
            return -1;

        while(num > 0){
            int lastDigit = num % 10;
            count ++;
            num /=10;
        }

        return count;
    }


    public static void numberToWords(int num) {

        if (num < 0)
            System.out.println("Invalid Value");
        else {
            int newReverse = reverse(num);
            int getCountNum = getDigitCount(num);
            int getCountReverse = getDigitCount(newReverse);
            int diff;

            while (newReverse > 0) {
                int lastDigit = newReverse % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                newReverse /= 10;

            }


/*            int getCountNum = getDigitCount(num); // 5
            int getCountReverse = getDigitCount(newReverse); // 1
            int diff; --> Totally wrong */

            if (getCountNum > getCountReverse) {
                diff = getCountNum - getCountReverse;

                for (int i = 1; i <= diff; i++) {
                    System.out.println("Zero");

                }
            }

        }
    }
}
