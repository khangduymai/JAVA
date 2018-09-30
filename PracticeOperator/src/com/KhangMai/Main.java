package com.KhangMai;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double num1 = 20d;
        double num2 = 80d;
        double total = (num1 + num2) * 25;
        double remainder = total % 40;
        if (remainder <= 20) {
            System.out.println("Total was over the limit");
        } else
            System.out.println("Total was fine");

    }
}
