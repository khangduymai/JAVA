package com.KhangMai;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("My total is " + myTotal);

        //short has a width of 16
        short myShortValue = 32767;


        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValye = (byte)(myByteValue/2);
        System.out.println("My new byte value is " + myNewByteValye);


    }
}
