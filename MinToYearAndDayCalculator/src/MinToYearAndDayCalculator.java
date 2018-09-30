public class MinToYearAndDayCalculator {

    public static final long TOTAL_MINUTES_IN_A_YEAR = 525600;
    public static final long TOTAL_MINUTES_IN_A_DAY = 1440;

    public static void main(String[] args){
        printYearsAndDays(-525600);
    }

    public static void printYearsAndDays (long minutes){

        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long convertToYears = minutes / TOTAL_MINUTES_IN_A_YEAR;
            long remainderInMinutes = minutes % TOTAL_MINUTES_IN_A_YEAR;
            long convertToDays = remainderInMinutes / TOTAL_MINUTES_IN_A_DAY;

            System.out.println(minutes + " min = " + convertToYears + " y and " + convertToDays + " d");
        }
    }
}
