package com.javarush.task.pro.task11.task1101;

/* 
Солнечная система — наш дом
*/

public class Solution {

//    public static void main(String[] args) {
//        SolarSystem ss = new SolarSystem();
//        System.out.println("Человечество живет в Солнечной системе.");
//        System.out.printf("Ее возраст около %d лет.%n", ss.age);
//        System.out.printf("В Солнечной системе %d известных планет. \n", ss.planetsCount);
//        System.out.printf("Как и большинство звездных систем, состоит из %d звезды.\n", ss.starsCount);
//        System.out.printf("Звезды по имени %s.", ss.starName);
//        System.out.printf("Расстояние к центру галактики составляет %d световых лет.\n", ss.galacticCenterDistance);
//        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");
//
//    }

    public static void main(String[] args) {

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + SolarSystem.age + " лет.");
        System.out.println("В Солнечной системе " + SolarSystem.planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + SolarSystem.starsCount + " звезды.");
        System.out.println("Звезды по имени " + SolarSystem.starName + ".");
        System.out.println("Расстояние к центру галактики составляет " + SolarSystem.galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
