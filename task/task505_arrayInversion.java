package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
Тебе нужно написать программу, которая:

Считывает с консоли число N (в тестах оно всегда будет положительным).
Потом считывает N чисел с консоли.
Если N чётное — вывести введенные числа в обратном порядке, иначе — вывести в том же порядке. Каждое число выводить с новой строки.

Требования:
1. Программа должна считывать число N и за ним еще N чисел.
2. В классе должен быть метод public static void main(String[]).
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить введенные N чисел в обратном порядке если N чётное.
5. Программа должна выводить введенные N чисел в том же порядке если N нечётное.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int len = console.nextInt();
        int[] array = new int[len];
        for (int elem = 0; elem < array.length; elem++) {
            array[elem] = console.nextInt();
        }
        if (array.length % 2 == 0) {
            for (int number = array.length; number > 0; number--) {
                System.out.println(array[number - 1]);
            }
        }
        else
        {
            for (int number = 0; number < array.length; number++) {
                System.out.println(array[number]);
            }
        }
    }
}
