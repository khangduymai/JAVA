public class Array {

    public static void  main(String[] args){

        //First way to declare and init array
/*        int[] myArray;
        myArray = new int[10];
        myArray[0]= 1;*/

        //Second way to declare and init array with values
        //int myArray[] = {1,2,3};

        //OR
        //int myArray[] = new int[] {1,2,3};

        //Third way to do it
/*        int myArray[] = new int[3];
        myArray[0] = 1;
        myArray[1] = 22;
        myArray[2] = 3;
        myArray[3] = 4;
        System.out.println(myArray[0]);*/

        int[] myArray = new int[10];

        printArray(myArray);

    }

    public static void printArray(int[] array){
        for(int i =0; i < 10; i++){
            array[i] = i*10;
            System.out.println("element: " + i + " and value is: " + array[i]);
        }
    }
}
