package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3

Сумма чисел, не кратных 3
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.

Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.


Требования:
1. Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
2. В программе необходимо использовать цикл while.
3. В программе необходимо использовать оператор continue.
*/

public class Solution {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (n < 101) {
            if (n % 3 == 0) {
                n++;
                continue;
            } else {
//                System.out.println(n);
                sum += n;
                n++;
//                System.out.println(3 % 3 == 0);
            }
        }
        System.out.println(sum);
    }
}
