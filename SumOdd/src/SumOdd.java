public class SumOdd {

    public static void main(String[] args){
        sumOdd(1,100);
        sumOdd(100,100);
        sumOdd(101,101);
        sumOdd(1,-100);
        sumOdd(-1,100);
        sumOdd(10,9);
    }

    public static boolean isOdd(int num1){
        if(num1 < 0)
            return false;
        else if(num1 % 2 != 0)
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end){
        int sumOdd =0;
        if(start <= 0 || end <= 0){
            System.out.println(-1);
            return -1;
        }

        if(end < start){
            System.out.println(-1);
            return -1;
        }

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
              sumOdd += i;
            }
        }

        System.out.println("SumOdd is = " + sumOdd);
        return sumOdd;
    }
}
