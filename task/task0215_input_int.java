import java.util.Scanner;

/* 
Чтение чисел

Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.

Пример ввода:

51
202
101
Пример вывода:

118
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка.

Требования:
Программа должна считывать с клавиатуры три целых числа.
Программа должна выводить на экран среднее арифметическое считанных чисел.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int answer1 = console.nextInt();
        int answer2 = console.nextInt();
        int answer3 = console.nextInt();

        System.out.println((answer1 + answer2 + answer3) / 3);
    }
}
