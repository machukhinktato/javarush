package com.javarush.task.pro.task10.task1021;

/* 
Автопроизводитель
*/

public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize (String model, int year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void main(String[] args) {
        this.initialize("mustang", 1987, "black");
        System.out.println(this.model);
        System.out.println(this.year);
        System.out.println(this.color);
    }
}
