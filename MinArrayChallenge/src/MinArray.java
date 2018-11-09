import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinArray {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int inputNumber = 0;
        boolean isValid = false;
        while(isValid == false){
            System.out.println("Please enter the number you want to input into array: \r");
            if(input.hasNextInt()){
                inputNumber = input.nextInt();
                isValid = true;
            }
            else {
                input.nextLine();
                System.out.println("Invalid number.");
                continue;
            }
            input.nextLine();
        }

        int[] arrayInput = getArray(inputNumber);

        int min = findMin2(arrayInput);
        System.out.println(min);



        //System.out.println("Array list " + Arrays.toString(arrayInput));
    }

    private static int[] getArray(int num){
        int[] listArray = new int[num];
        boolean isValid = false;

        for(int i = 0; i < listArray.length; i++){
            Scanner inputArray = new Scanner(System.in);

            while(isValid == false){
                System.out.println("Please enter number " + (i+1));
                if(inputArray.hasNextInt()){
                    listArray[i] = inputArray.nextInt();
                    isValid = true;
                }
                else{
                    System.out.println("Invalid number.");
                }
                inputArray.nextLine();
            }
            isValid = false;
        }
        return listArray;
    }


    private static void printArray(int[] arrayPrinted){
        for(int i = 0; i < arrayPrinted.length; i++){
            System.out.println(arrayPrinted[i]);
        }
    }

    private static int findMin(int[] array){
        //5,6,3,7,1
        int temp;
        int arraySize = array.length;
        for(int i = 0; i < array.length; i++){
           for(int j = 0; j < arraySize -1; j++){
               if(array[j] > array[j+1]){
                   temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
               //arraySize --;
           }
        }
        return array[0];
    }

    private static int findMin2(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
