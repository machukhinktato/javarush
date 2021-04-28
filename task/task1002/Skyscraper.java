package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper() {
        System.out.print(Skyscraper.SKYSCRAPER_WAS_BUILD + "\n");
    }

    public Skyscraper(int number) {
        System.out.print(Skyscraper.SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + number + "\n");
    }

    public Skyscraper(String name) {
        System.out.print(Skyscraper.SKYSCRAPER_WAS_BUILD_DEVELOPER + name + "\n");
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}
