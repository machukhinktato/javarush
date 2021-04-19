/* 
Получение длины строки

В методе main на экран выводятся значения трех строк.
Внеси изменения в код, чтобы вместо значений строк вывелись их длины.

Требования:
Не изменяй значение переменной emptyString.
У трех строк, переданных в метод println, нужно вызвать метод length.
Программа должна вывести на экран три числа, каждое - с новой строки.
*/

public class Solution {

    public static void main(String[] args) {
        String emptyString = "";

        //напишите тут ваш код
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
