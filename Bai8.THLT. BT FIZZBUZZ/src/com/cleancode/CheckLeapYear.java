package com.cleancode;

import java.util.Scanner;

public class CheckLeapYear {
    public static boolean isLeapYear(int year){
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    return true;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập năm");
        int year= scanner.nextInt();
        if(isLeapYear(year)){
            System.out.println("Năm nhuận");
        }else {
            System.out.println("Năm không nhuận");
        }
    }
}
