package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел

Минимум из введенных чисел
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ. Выведи на экран минимальное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.

Пример ввода:
8
4
9
4
5
e

Пример вывода:
4

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран минимальное из введенных целых чисел.
4. Если введено несколько минимальных чисел, необходимо вывести любое.
5. Если введен только один не числовой символ, то вывести на экран максимальное значение числа типа int.
6. Считывать данные с клавиатуры необходимо в цикле while.
*/

//public class Solution {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int minNum = 0;
//        int maxNum = 0;
//        int consoleNum;
//        int i = 0;
//        while (console.hasNextInt()) {
////            while (console.hasNextInt();
//            consoleNum = console.nextInt();
////            System.out.println(consoleNum.length);
//            if (i == 0){
//                minNum = consoleNum;
//                maxNum = consoleNum;
//                i++;
////                System.out.println(consoleNum);
//                continue;
//            }
//            else if (minNum > consoleNum) {
//                minNum = consoleNum;
//                System.out.println(minNum);
//            }
//            else if (maxNum < consoleNum) {
//                maxNum = consoleNum;
//            }
//        }
//        System.out.println(maxNum);
//
//    }
//}

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
