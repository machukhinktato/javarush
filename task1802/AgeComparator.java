package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {

    public int compare(Student std1, Student std2) {
        return std2.getAge() - std1.getAge();
    }
}
