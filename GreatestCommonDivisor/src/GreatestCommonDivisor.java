public class GreatestCommonDivisor {

    public static void main(String[] args){
        System.out.println("Greatest Common Divisor =" + getGreatestCommonDivisor(12, 30));
        System.out.println("Greatest Common Divisor =" +getGreatestCommonDivisor(20, 30));
        System.out.println("Greatest Common Divisor =" +getGreatestCommonDivisor(-20, 30));
        System.out.println("Greatest Common Divisor =" +getGreatestCommonDivisor(65, 145));
        System.out.println("Greatest Common Divisor =" +getGreatestCommonDivisor(650, 1450));

        /*int num1 = 20;
        int quotient;

        for(int i = 1; i <= num1; i++){
            quotient = num1%i;
            if(quotient==0)
                System.out.println(i);
        }*/
    }
    public static int getGreatestCommonDivisor(int num1, int num2){

        int quotient1;
        int quotient2;
        int i1, i2;
        int commonDivisor=0;

        if(num1 < 10 || num2 < 10)
            return -1;

        for(  i1 = 1, i2 = 1; i1 <= num1 || i2 <= num2; i1++, i2++){
            quotient1 = num1 % i1;
            quotient2 = num2 % i2;

            if(quotient1==0 && quotient2==0 && i1==i2)
                commonDivisor = i1;

        }
        return commonDivisor;
    }
}

/*
for (initialization; termination;
        increment) {
        statement(s)
        }*/
