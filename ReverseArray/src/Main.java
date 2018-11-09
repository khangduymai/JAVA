public class Main {

    public static void main(String[] args){
        //int num = 5;
        int[] array = {1,2,3,4,5,6,7};

        printArray(array);
        System.out.println();
        reverseArray(array);

    }
    // 1 2 3 4 5 6
    // 0 1 2 3 4 5

    public static void reverseArray(int[] array){
        int lastIndex = array.length-1;
        int temp;
        for(int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = temp;
            lastIndex--;
        }

        printArray(array);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
