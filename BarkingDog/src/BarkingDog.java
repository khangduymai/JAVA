public class BarkingDog {

    public static void main(String[] args) {
        bark(false, 2);
        bark(true, -1);
        bark(true, 7);
    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (barking && (hourOfDay < 0 || hourOfDay > 23)) {
            barking = false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            barking = true;
        } else
            barking = false;
        System.out.println(barking);
        return barking;
    }
}
