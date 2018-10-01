public class NumberOfDaysInMonth {

    public static void main(String[] args){
        getDaysInMonth(8,2020);
        getDaysInMonth(2,2018);
        getDaysInMonth(-1,2018);
        getDaysInMonth(2,-2018);
    }

    public static boolean isLeapYear(int year){

        boolean leapYear = true;

        if(year < 1 || year > 9999){

            leapYear = false;
            //System.out.println(leapYear);
        }

        if(year >= 1 && year <= 9999){

            if(year % 4 == 0  && year % 100 != 0){
                leapYear = true;
               // System.out.println(leapYear);
            }
            else if(year %400 ==0){
                leapYear = true;
                System.out.println(leapYear);
            }
            else{
                leapYear = false;
                //System.out.println(leapYear);
            }

        }
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {

        int daysInMonth = -1;


        if (year < 1 || year > 9999) {
            year = -1;
            System.out.println( year + " since the parameter year is out of the range of 1 to 9999");
            return year;
        } else {
            switch (month) {
                case 1:
                    daysInMonth = 31;
                    System.out.println(daysInMonth + " days since January has 31 days");
                    //return daysInMonth;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                        System.out.println(daysInMonth + " days since February and " + year + " is a leap year");
                        //return daysInMonth;
                    } else {
                        daysInMonth = 28;
                        System.out.println(daysInMonth + " days since February and " + year + " is not leap year");
                        //return daysInMonth;
                    }
                    break;
                case 3:
                    daysInMonth = 31;
                    System.out.println(daysInMonth + " days since March has 31 days");
                    //return daysInMonth;
                break;
                case 4:
                    daysInMonth = 30;
                    System.out.println(daysInMonth + " days since March has 30 days");
                    //return daysInMonth;
                    break;
                case 5:
                    daysInMonth = 31;
                    System.out.println(daysInMonth + " days since March has 31 days");
                    //return daysInMonth;
                    break;
                case 6:
                    daysInMonth = 30;
                    System.out.println(daysInMonth + " days since June has 30 days");
                    //return daysInMonth;
                    break;
                case 7:
                    daysInMonth = 31;
                    System.out.println(daysInMonth + " days since July has 31 days");
                    //return daysInMonth;
                    break;
                case 8:
                    daysInMonth = 31;
                    System.out.println(daysInMonth + " days since August has 31 days");
                    //return daysInMonth;
                    break;
                case 9:
                    daysInMonth = 30;
                    System.out.println(daysInMonth + " days since September has 30 days");
                    return daysInMonth;
                //break;
                case 10:
                    daysInMonth = 31;
                    System.out.println(daysInMonth + " days since October has 31 days");
                    //return daysInMonth;
                    break;
                case 11:
                    daysInMonth = 30;
                    System.out.println(daysInMonth + " days since November has 30 days");
                    //return daysInMonth;
                    break;
                case 12:
                    daysInMonth = 31;
                    System.out.println(daysInMonth + " days since December has 31 days");
                    //return daysInMonth;
                    break;
                default:
                    System.out.println(daysInMonth + " since the parameter month is invalid");
                    return daysInMonth;
            }

        }

        return daysInMonth;
    }
}
