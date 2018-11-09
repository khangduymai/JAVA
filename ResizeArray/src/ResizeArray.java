import java.util.Scanner;

public class ResizeArray {

    private static int[] base = new int[10];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter 10 numbers");
        getArray();
        printArray(base);
        resizeArray();
        getArray();
        printArray(base);
    }

    public static void getArray(){
        boolean isValid = false;
        for(int i = 0; i < base.length; i++){
            System.out.println("Please enter number:");
            while(isValid == false){
                if(input.hasNextInt()){
                    base[i] = input.nextInt();
                    isValid = true;
                }
                else{
                    System.out.println("Invalid number");
                    continue;
                }
            }
            isValid = false;
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Array " + (i+1) + " is: " + array[i]);
        }
    }

    public static void resizeArray(){
        int[] original = base;

        base = new int[12];
        for(int i = 0; i < original.length; i++){
            base[i] = original[i];
        }
    }
}
