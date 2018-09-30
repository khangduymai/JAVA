package com.KhangMai;

public class Main {
    public static final double POUNDTOKG = 0.45359237;
    public static void main(String[] args) {
	// write your code here
        double pound = 190.8;
        double kg = pound * POUNDTOKG;
        System.out.println("Convert " + pound +  " pound to kg: " + kg  + " kg");
    }
}
