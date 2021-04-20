package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование

Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.

Требования:
Программа должна считывать данные c клавиатуры.
Программа должна выводить данные на экран, если пользователь ввел слово "ENTER".
Необходимо посчитать сумму введенных целых чисел и вывести её на экран.
В программе необходимо использовать цикл while.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean var1 = true;
        int answer = 0;
        while (var1)
        {
            if (console.hasNextInt())
            {
                var1 = console.hasNextInt();
                answer += console.nextInt();
                
                // continue;
            }
            else 
            {
                System.out.println(answer);
                var1 = false;
            }
        }
        
        //напишите тут ваш код

    }
}
