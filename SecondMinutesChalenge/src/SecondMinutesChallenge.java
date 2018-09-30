public class SecondMinutesChallenge {

    private static final String INVALIC_VALUE_MESSAGE = "Invalid value"; // declare constant variable

    public static void main(String[] args){
        String display = getDurationString(130, 35);
        System.out.println(display);

        display = getDurationString(7835L);
        System.out.println(display);

        display = getDurationString(65,9);
        System.out.println(display);

        display = getDurationString(-7835L);
        System.out.println(display);
    }

    private static String getDurationString(long minutes, long seconds){

        if(minutes < 0 || seconds < 0 || seconds >= 60){
            //System.out.println("Invalid value");
            return INVALIC_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        String minString = remainMinutes + "m";
        if(remainMinutes < 10){
            minString = "0" + minString;
        }

        String secString = seconds + "s";
        if(seconds < 10){
            secString = "0" + secString;
        }
        return hoursString + " " + minString + " " + secString;
    }

    private static String getDurationString(long seconds){

        if(seconds < 0)
            return INVALIC_VALUE_MESSAGE;

        long minutes = seconds / 60;
        long remainSeconds = seconds % 60;
        return getDurationString(minutes,remainSeconds);
    }
}
