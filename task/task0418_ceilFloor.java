package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан. Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner. В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.

Пример ввода:
true

Пример вывода:
1

Подсказка:
Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().


Требования:
1. Программа должна считывать c клавиатуры данные типа boolean.
2. Программа должна выводить целое число на экран согласно условию.
3. В программе необходимо использовать метод Math.floor().
4. В программе необходимо использовать метод Math.ceil().
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        boolean choise = console.nextBoolean();
        if (choise == true) {
            System.out.println((int) Math.ceil(glass));
        } else if (choise == false) {
            System.out.println((int) Math.floor(glass));
        }
    }
}
