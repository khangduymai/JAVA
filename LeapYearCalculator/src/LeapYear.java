public class LeapYear {

    public static void main(String[] args){
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(-1200);
    }

    public static boolean isLeapYear(int year){
        //boolean checkRange;
        boolean leapYear = true;

        if(year < 1 || year > 9999){
            //checkRange = false;
            leapYear = false;
            System.out.println(leapYear);
        }
        if(year >= 1 && year <= 9999){
            //checkRange = true;
            if(year % 4 == 0  && year % 100 != 0){
                leapYear = true;
                //System.out.println(checkRange);
                System.out.println(leapYear);
            }
            else if(year %400 ==0){
                leapYear = true;
                //System.out.println(checkRange);
                System.out.println(leapYear);
            }
            else{
                leapYear = false;
                //System.out.println(checkRange);
                System.out.println(leapYear);
            }

        }
        return leapYear;
    }
}
