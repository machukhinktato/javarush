import java.util.Scanner;

/* 
Координатные четверти

Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x", а второе - координата "y"). Известно, что точка не лежит на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (x, y) к одной из четвертей определяется следующим образом:

для первой четверти x>0 и y>0;
для второй четверти x<0 и y>0;
для третьей четверти x<0 и y<0;
для четвертой четверти x>0 и y<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
Требования:
Программа должна считывать два числа c клавиатуры.
Программа должна использовать команду System.out.println() или System.out.print().
Если точка находится в первой координатной четверти, вывести "1".
Если точка находится во второй координатной четверти, вывести "2".
Если точка находится в третей координатной четверти, вывести "3".
Если точка находится в четвёртой координатной четверти, вывести "4".
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        boolean qtr1 = (x>0 && y>0);
        boolean qtr2 = (x<0 && y>0);
        boolean qtr3 = (x<0 && y<0);
        boolean qtr4 = (x>0 && y<0);
        if (qtr1 == true){
            System.out.println(1);
        }
        if (qtr2 == true){
            System.out.println(2);
        }
        if (qtr3 == true){
            System.out.println(3);
        }
        if (qtr4 == true){
            System.out.println(4);
        }
    }
}
