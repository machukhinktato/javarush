package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {
    private Engine engine;

    class Engine{
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}

//public class Car {
//
//    static class Engine {
//        boolean isRunning;
//
//        public void start() {
//            this.isRunning = true;
//            System.out.println("Двигатель запущен");
//        }
//
//        public void stop() {
//            this.isRunning = false;
//            System.out.println("Двигатель остановлен");
//        }
//    }
//
//    public static void main(String[] args) {
//        Engine engine = new Engine();
//        engine.start();
//        engine.stop();
//    }
//
//}
