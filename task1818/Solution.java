package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        String thirdFileName = reader.readLine();
        try (FileOutputStream fileOutputStream = new FileOutputStream(firstFileName, true);
             FileInputStream fileInputStream1 = new FileInputStream(secondFileName);
             FileInputStream fileInputStream2 = new FileInputStream(thirdFileName)) {
            while (fileInputStream1.available() > 0) {
                int data = fileInputStream1.read();
                fileOutputStream.write(data);
            }
            while (fileInputStream2.available() > 0) {
                int data = fileInputStream2.read();
                fileOutputStream.write(data);
            }
        }
    }
}
