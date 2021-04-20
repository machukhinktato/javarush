package com.javarush.task.pro.task04.task0412;

/* 
Сумма четных чисел
Напиши программу, которая выводит на экран сумму чисел от 1 до 17, кратных 3. Для этого используй цикл for.
Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.


Требования:
1. Программа должна вывести в консоль сумму чисел от 1 до 17, кратных 3.
2. В программе необходимо использовать цикл for.
3. В цикле for необходимо использовать оператор continue.
*/

public class Solution {
    public static void main(String[] args) {
        int summ = 0;
        for (int i = 1; i <= 17; i++) {
            if (i % 3 == 0) {
                summ += i;
            } else {
                continue;
            }
        }
        System.out.println(summ);
    }
}
