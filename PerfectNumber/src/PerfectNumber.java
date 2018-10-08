public class PerfectNumber {

    public static void main(String[] args){
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int num){

        if(num < 1)
            return false;
        else{

            int sumPerfectNum = 0;

            for(int i = 1; i < num; i++){
                if(num % i ==0){
                    sumPerfectNum += i;
                }
            }

            if(sumPerfectNum == num)
                return true;
        }

        return false;
    }
}
