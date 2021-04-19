import java.util.Scanner;

/* 
Высокая точность

Напиши программу, которая считывает с клавиатуры два вещественных числа и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.

Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Если числа равны, то программа должна вывести сообщение "числа равны".
•	Если числа не равны, то программа должна вывести сообщение "числа не равны".
•	Точность сравнения должна достигать одной миллионной (0.000001).
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double var1 = Math.abs(console.nextDouble());
        double var2 = Math.abs(console.nextDouble());
        // System.out.println(var1);
        // if ((Math.abs(var1)) == (Math.abs(var2))){
        if (Math.abs(var1 - var2)<=0.000001)
        {
        //напишите тут ваш код
            System.out.println("числа равны");
        }
        //напишите тут ваш код
        else {
            System.out.println("числа не равны");
        }
        // System.out.println(Math.abs(var1 - var2));
    }
}
