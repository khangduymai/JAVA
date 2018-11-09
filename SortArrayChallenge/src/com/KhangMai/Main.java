package com.KhangMai;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        Scanner inputNumberOfArray = new Scanner(System.in);
        int arrayNumber = 0;
        boolean isValid = false;
        while(isValid == false){
            //input asking user how many numbers they want to input
            System.out.println("Please enter the number of values you want to sort \r");
            //validate the int data
            if(inputNumberOfArray.hasNextInt()){
                arrayNumber = inputNumberOfArray.nextInt();
                isValid = true;
            }
            else{
                System.out.println("Invalid data.");
            }
            inputNumberOfArray.nextLine();
        }

        //declare array and instantiate array
        int[] values = getArrayValues(arrayNumber);
        //printArray(values);
        System.out.println();
        int[] sortValue = sortArray(values);
        printArray(sortValue);

    }

    private static int[] getArrayValues(int arrayNumbers){
        int[] arrayInput = new int[arrayNumbers];
        boolean isValid = false;

        for(int i = 0; i < arrayInput.length; i++){
            int temp = i +1;
            if(checkLastDigitOne(temp)){
                while(isValid == false){
                    System.out.println("Please enter " + temp + "st number. \r");
                    //validate the int data
                    if(input.hasNextInt()){
                        arrayInput[i] = input.nextInt();
                        isValid = true;
                    }
                    else{
                        System.out.println("Invalid data.");
                    }
                    input.nextLine();
                }
                isValid = false;
            }
            else if(checkLastDigitTwo(temp)){
                while(isValid == false){
                    System.out.println("Please enter " + temp + "nd number. \r");
                    //validate the int data
                    if(input.hasNextInt()){
                        arrayInput[i] = input.nextInt();
                        isValid = true;
                    }
                    else{
                        System.out.println("Invalid data.");
                    }
                    input.nextLine();
                }
                isValid = false;
            }
            else if(checkLastDigitThree(temp)){
                while(isValid == false){
                    System.out.println("Please enter " + temp + "rd number. \r");
                    //validate the int data
                    if(input.hasNextInt()){
                        arrayInput[i] = input.nextInt();
                        isValid = true;
                    }
                    else{
                        System.out.println("Invalid data.");
                    }
                    input.nextLine();
                }
                isValid = false;
            }
            else{
                while(isValid == false){
                    System.out.println("Please enter " + temp + "th number. \r");
                    //validate the int data
                    if(input.hasNextInt()){
                        arrayInput[i] = input.nextInt();
                        isValid = true;
                    }
                    else{
                        System.out.println("Invalid data.");
                    }
                    input.nextLine();
                }
                isValid = false;
            }

        }
        return arrayInput;
    }

    private static boolean checkLastDigitOne(int number){
        int getLastDigit;
        getLastDigit = number %10;
        if(getLastDigit == 1 || number == 1)
            return true;
        else
            return false;
    }

    private static boolean checkLastDigitTwo(int number){
        int getLastDigit;
        getLastDigit = number %10;
        if(getLastDigit == 2 || number == 2)
            return true;
        else
            return false;
    }

    private static boolean checkLastDigitThree(int number){
        int getLastDigit;
        getLastDigit = number %10;
        if(getLastDigit == 3 || number == 3)
            return true;
        else
            return false;
    }

    public static void printArray(int[] arrayPrint){
        for(int i = 0; i < arrayPrint.length; i++){
            System.out.println("Element " + i + " with the value is: " + arrayPrint[i]);
        }
    }

    public static int[] sortArray(int[] arraySort){
        int arraySize = arraySort.length;
        int temp;
        for(int i = 0; i < arraySort.length; i++){
            for(int j = 0; j < arraySize -1; j++){
                if(arraySort[j] > arraySort[j+1]){
                    temp = arraySort[j];
                    arraySort[j] = arraySort[j+1];
                    arraySort[j+1] = temp;
                }
            }
            arraySize--;
        }
        return  arraySort;
    }

}
