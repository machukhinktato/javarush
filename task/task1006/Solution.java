package com.javarush.task.pro.task10.task1006;

/* 
Кто тут наследник?
*/

public class Solution {
    public static void main(String[] args) {
//        Car car = new Car("ElectricCar");
//        System.out.println(car);
        ElectricCar ec = new ElectricCar();
        GasCar gc = new GasCar();
        HybridCar hc = new HybridCar();
    }
}
