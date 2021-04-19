import java.util.Scanner;

/* 
Сравним строки

Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.

Требования:
Программа должна считывать две строки c клавиатуры.
Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
Если строки разные, то программа должна вывести сообщение "строки разные".
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String var1 = console.nextLine();
        String var2 = console.nextLine();
        if (var1.equals(var2))
        {
            System.out.println("строки одинаковые");
        }
        //напишите тут ваш код
        else {
            //напишите тут ваш код
            System.out.println("строки разные");
        }

    }
}