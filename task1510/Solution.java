package com.javarush.task.pro.task15.task1510;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем байты в файл
*/

public class Solution {
    public static void main(String[] args) {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)){
             Path path = Files.write(Path.of(scanner.nextLine()), bytes);

//             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
//            bufferedWriter.write(bytes);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

