package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10], заполни его таблицей умножения и выведи в консоли в следующем виде:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…
Числа в строке разделены пробелом.


Требования:
1. В методе main массив MULTIPLICATION_TABLE должен быть заполнен таблицей умножения.
2. Выведенный текст должен содержать 10 строк.
3. Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
4. Выведенные числа должны быть таблицей умножения.
*/

import java.util.Arrays;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE = new int[10][10];


    public static void main(String[] args) {
        MULTIPLICATION_TABLE = timesTable(10,10);
        for (int row = 0; row < MULTIPLICATION_TABLE.length; row++) {
            for (int column = 0; column < MULTIPLICATION_TABLE[row].length; column++) {
                System.out.printf("%2d ", MULTIPLICATION_TABLE[row][column]);
            }
            System.out.println();
//        for (int[] ints : MULTIPLICATION_TABLE) {
//            for (int anInt : ints) {
//                System.out.printf("%2d ", anInt);
//            }
//            System.out.println();
//        }
        }
    }

    public static int[][] timesTable(int r, int c) {
        int[][] yes = new int[r][c];
        for (int row = 0; row < yes.length; row++) {
            for (int column = 0; column < yes[row].length; column++) {
                yes[row][column] = (row + 1) * (column + 1);
            }

        }
        return yes;
    }
}
