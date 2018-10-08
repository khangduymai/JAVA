public class AllFactor {

    public static void main(String[] args){
        printFactors(6);
        printFactors(7);
        printFactors(-8);
        printFactors(154);
    }

    public static void printFactors(int num){

        if(num < 1)
            System.out.println("Invalid Value");
        else{
            for(int i = 1; i <= num; i++){  // i is the factor
                if(num % i == 0)
                    System.out.println(i);
            }
        }
    }
}
