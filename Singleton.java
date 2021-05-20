package com.javarush.task.task14.task1421;

class Singleton {
    private static Singleton instance = null;
    private Singleton() {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
