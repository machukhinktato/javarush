package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
В этой задаче нужно:

Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.
Пример ввода:
8
4 // минимальное число
7
4 // минимальное число
5 // второе по величине число (второе минимальное)
9
5 // второе по величине число (второе минимальное)
exit
Пример вывода:
5


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран второе минимальное из введенных целых чисел.
4. Если введено несколько вторых минимальных чисел, необходимо вывести любое.
5. Считывать данные с клавиатуры необходимо в цикле while.*/

public class Solution {
    public static void main(String[] args) {

//        Scanner console = new Scanner(System.in);
//        while (true) {
//            int n = console.nextInt();
//            int varMin1 = n, varMin2 = n;
//            while (console.hasNextInt()) {
//                n = console.nextInt();
//                if (varMin1 > n) {
//
//                    if (varMin2 > varMin1) {
//                            varMin2 = varMin1;
//                    }
//                    varMin1 = n;
//                }
//
//                System.out.println(varMin2);
//            }
//            break;
        
        Scanner console = new Scanner(System.in);

        int min = console.nextInt();
        int secondMin = console.nextInt();
        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}
