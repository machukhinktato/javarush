import java.util.Scanner;

/* 
Три числа

Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2
Требования:
Программа должна считывать три числа c клавиатуры.
Программа должна содержать System.out.println() или System.out.print()
Если два числа равны между собой, необходимо вывести их на экран.
Если все три числа равны между собой, необходимо вывести все три.
Если нет равных чисел, ничего не выводить.

*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int var1 = console.nextInt();
        int var2 = console.nextInt();
        int var3 = console.nextInt();
        if (var1 == var2)
        {
            if (var2 == var3) 
            {
                System.out.print(var1);
                System.out.print(" ");
                System.out.print(var2);
                System.out.print(" ");
                System.out.print(var3);
            }
            else {
                System.out.print(var1);
                System.out.print(" ");
                System.out.print(var2);
            }
        }
        else if (var1 == var3)
        {
            System.out.print(var1);
            System.out.print(" ");
            System.out.print(var3);
        }
        else if (var2 == var3)
        {
            System.out.print(var2);
            System.out.print(" ");
            System.out.print(var3);
        }

    }
}
