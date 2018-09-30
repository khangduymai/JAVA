package com.KhangMai;



public class Main {
    public static String extraEnd(String str){
        int lastIndex = str.length()-1;
        String subStr = str.substring(lastIndex-1);
        return subStr + subStr + subStr;
    }

    public static void main(String[] args) {
	// write your code here
        String result = extraEnd("ab");
        System.out.println("The result is: " + result);

    }
}
