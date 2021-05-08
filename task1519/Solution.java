package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> sourceFiles = Files.newDirectoryStream(sourceDirectory)) {
            for (Path sourceFile : sourceFiles) {
                if (Files.isRegularFile(sourceFile)) {
                    Path resolve = targetDirectory.resolve(sourceFile.getFileName());
                    Files.copy(sourceFile, resolve);
                }
            }
        }
    }
}
