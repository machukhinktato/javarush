package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
В этой задаче тебе нужно:

Считать 10 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
Примеры.

Массив после чтения строк:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}
Массив после удаления повторяющихся строк:
{null, null, null, "Java", "Tasks", null}


Требования:
1. В методе main(String[]) считай с клавиатуры 10 строк и заполнить ими массив strings.
2. В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.
*/

//public class Solution {
//    public static String[] strings = new String[10];
//
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        for (int idx = 0; idx < strings.length; idx++) {
//            strings[idx] = console.nextLine();
//        }
//        for (int idx = 0; idx < strings.length; idx++) {
//            for (int i = idx + 1; i < strings.length - 1; i++) {
//                if (strings[i].equals(strings[idx])) {
//                    strings[idx] = null;
//                    break;
//                }
//            }
//        }
//        for (String string : strings) {
//            System.out.print(string + ", ");
//        }
//
//    }
//}


public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
