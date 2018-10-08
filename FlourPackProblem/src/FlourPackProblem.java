public class FlourPackProblem {

    public static final int BIG_BAG = 5;
    public static final int SMALL_BAG = 1;

    public static void main(String[] args) {
        System.out.println(canPack(3, 2, 12));
        //System.out.println(5%4);
    }

    public static boolean canPack(int big, int small, int goal) {

        if (big < 0 || small < 0 || goal < 0) {
            return false;
        }

        int TotalBigBag = big * BIG_BAG;
        int TotalSmallBag = small * SMALL_BAG;
        int sum = TotalBigBag + TotalSmallBag;

        if (sum < 0)
            return false;

        if (sum == goal)
            return true;


        /*
        * (2, 1) -> 1 big
        * (2, 2) -> 2 big
        *
        *
        * (2, 3) -> 2 big
        *
        * (2, 0) -> 0 big
        *
        * (0, 100) -> 0
        *
        * (100, 0) -> 0
        *
        * (3, 1) -> 1
        *
        * (5, 7) -> 5
        *
        * min (big bag, goal / 5)
        *
        * (2, 4, 12)
        *
        * (2, 1) -> 1
        *
        *
        *
        * ----------
        * (5, 7, 18)
        *
        * (5, 18) -> 3
        * 18 - 15 = 3
        *
        * remain = goal - min(big, goal / 5) * 5 = 3
        *
        * return remain <= small;
        *
        * 3 * 5 + 7 = 22 >= 18
        */
        if (sum > 0) {
            if (TotalBigBag == 0 && TotalSmallBag >= goal) {
                return true;
            }
            //(3,1,12)
            //)3,0,10)
            if (TotalBigBag > goal) {
                goal -= Math.min(big, goal / BIG_BAG) * BIG_BAG;
                if (TotalSmallBag >= goal)
                    return true;
            }

            if (TotalBigBag < goal && TotalBigBag + TotalSmallBag >= goal) {
                return true;
            }
         }

        return false;
    }

    public static boolean canPack2(int big, int small, int goal) {
        if (goal < 0 || small < 0 || big < 0)
            return false;

        int usableBig = Math.min(big, goal / BIG_BAG);

        int remain = goal - usableBig * BIG_BAG;

        return remain <= small;

        // return  small + Math.min(big, goal / 5) * 5 >= goal;
    }


    public static boolean canPack3 (int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        }

        for (int i = 0; i <= bigCount ; i++) {

            for (int j = 0; j <= smallCount ; j++) {
                if ((i * 5) + j == goal){
                    return true;

                }

            }

        }
        return false;
    }


}

