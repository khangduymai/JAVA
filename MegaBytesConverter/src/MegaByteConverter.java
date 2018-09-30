public class MegaByteConverter {

    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(-100);
        printMegaBytesAndKiloBytes(6020);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else
            if(remainder == 0){
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
            }
            else if (remainder != 0){
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
        }
    }
}
