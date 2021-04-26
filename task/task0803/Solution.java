package com.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
В этой задаче тебе нужно:

Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).

Требования:
1. Программа должна считывать числа с клавиатуры.
2. Класс Solution должен содержать только три метода.
3. Метод getArrayOfTenElements() должен считать с клавиатуры 10 чисел, потом вернуть массив размером 10 элементов, заполненный считанными числами.
4. Метод min(int[]) должен вернуть минимальный элемент массива, используя метод min(int, int) класса Math.
5. Метод main() должен вызывать метод getArrayOfTenElements().
6. Метод main() должен вызывать метод min(int[]).
*/

public class Solution {

    public static void main(String[] args) {
//        getArrayOfTenElements();
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        System.out.println(Arrays.toString(ints));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                min = min >= Math.min(ints[i], ints[j]) ? Math.min(ints[i], ints[j]) : min;
            }
            System.out.println(min);
            break;
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
