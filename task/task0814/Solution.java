package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }

//    public static void main(String[] args) {
////        System.out.println(setFlag(5, 3));
////        System.out.println(checkFlag(5, 3));
////        System.out.println(resetFlag(5, 3));
//        System.out.println(checkFlag(5, 3));
//    }
//
//    public static int setFlag(int number, int flagPos) {
////        System.out.println(Integer.toBinaryString((int) (number)));
////        System.out.println(Integer.toBinaryString((int) (number | 1 << flagPos)));
//        int value = Integer.parseInt(Integer.toBinaryString((int) (number | 1 << flagPos)));
//        return value;
//    }
//
//    public static int resetFlag(int number, int flagPos) {
////        int value = Integer.parseInt(Integer.toBinaryString((int) (number | 0 << flagPos)));
////        System.out.println(Integer.toBinaryString((int) (number)));
//        int value = Integer.parseInt(Integer.toBinaryString((int) (number & ~(1 << flagPos))));
//        return value;
////        return 0;
//    }
//
//    public static boolean checkFlag(int number, int flagPos) {
//        boolean value = (number & (1 << flagPos)) == (number & (1 << flagPos));
////        System.out.println((number & (1 << flagPos)) == (1 << flagPos));
////        System.out.println(Integer.toBinaryString((int) (number)));
//        System.out.println(Integer.toBinaryString((int) (number & (1 << flagPos))));
////        System.out.println(Integer.toBinaryString((int) (1 << flagPos)));
////        System.out.println(number);
////        System.out.println(flagPos);
//        return value;
//    }
}
