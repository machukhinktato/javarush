import java.util.Scanner;

/* 
Тепло или холодно

Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".

Требования:
Программа должна считывать значение температуры c клавиатуры.
Программа должна использовать команду System.out.println() или System.out.print().
Если температура меньше 0, вывести только сообщение "на улице холодно".
Если температура больше либо равна 0, вывести только сообщени
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int answer = console.nextInt();
        if (answer < 0 )
            System.out.println("на улице холодно");
        else
            System.out.println("на улице тепло");
    }
}
