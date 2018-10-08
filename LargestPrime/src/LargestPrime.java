public class LargestPrime {

    public static void main(String[] args) {
        //getFactors(50);
        getFactors(1539);
        System.out.println(isPrime(513));
        System.out.println("Largest Prime Num: "+getLargestPrime(1539));
        //System.out.println(3%1);
    }

    public static void getFactors(int num) {
        int i;
        for (i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.println(i);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int getLargestPrime(int num) {
        int divisor;
        int prime = -1;
        for (divisor = 1; divisor <= num; divisor++) {
            if (num % divisor == 0) {
                if (isPrime(divisor)) {
                    prime = divisor;
                }
            }
        }
        return prime;
    }

    public static int getLargestPrime2(int num) {
        int divisor;
        int prime = -1;
        int checkDivisor;
        boolean flag = true;

        if(num <= 1)
            return prime;

        for (divisor = 1; divisor <= num; divisor++) {
            if (num % divisor == 0) {
                checkDivisor = divisor;

                for (int j = 2; j < checkDivisor; j++) {
                    if (checkDivisor % j == 0) {
                        flag = false;
                    }
                }
                if (flag)
                    prime =checkDivisor;
            }
        }
        return prime;
    }

}
