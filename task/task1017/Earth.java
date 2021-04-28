package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {

    public Earth() {
    }

    public static void main(String[] args) {
        Africa africa = new Africa(111);
        Australia australia = new Australia(112);
        Eurasia eurasia = new Eurasia(113);
        NorthAmerica northAmerica = new NorthAmerica(114);
        SouthAmerica southAmerica = new SouthAmerica(115);
        Antarctica antarctica = new Antarctica(116);
    }
}