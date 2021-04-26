package com.javarush.task.pro.task06.task0607;

/* 
Добро пожаловать! Но не всем.
Перед тобой метод signIn(), который приветствует пользователей сайта. Сейчас он приветствует всех пользователей, а должен только зарегистрированных. Имена всех незарегистрированных пользователей — "user".
Добавь проверку имени пользователя в начало метода signIn().
Если имя "user", прерви выполнение метода, используя ключевое слово return.


Требования:
1. Если имя пользователя "user", метод signIn() должен прекратить работу, не выводя ничего в консоли.
2. Если имя пользователя не "user", метод signIn() должен продолжать работу и вывести строки приветствия в консоли.
3. Для прерывания работы метода signIn() должно использоваться ключевое слово return.
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            signIn(args[i]);
        }
    }

    public static void signIn(String username){
//        System.out.println( username.getClass().getSimpleName());
//        System.out.println( username.equals("Mike"));
        username = username.replace(",", "");
        if (username.equalsIgnoreCase("user")){
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}