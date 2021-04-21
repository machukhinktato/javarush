package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;


/*
Максимальное из N чисел
В этой задаче тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.

Требования:
1. В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
2. В методе main(String[]) выведи в консоль максимальное число среди элементов массива.
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
//        Scanner console = new Scanner(System.in);
//        int N = console.nextInt();
//        array = new int[N];
//        int max = array[0];
//        for (int elem = 0; elem < array.length; elem++) {
//            array[elem] = console.nextInt();
//            if (max < array[elem]){
//                max = array[elem];
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
