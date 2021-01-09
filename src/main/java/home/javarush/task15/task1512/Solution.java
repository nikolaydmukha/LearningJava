package main.java.home.javarush.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        printSomething(args[0]);
        String result = outputStream.toString();
        //напишите тут ваш код
        outputStream.reset();
        StringBuilder stringBuilder = new StringBuilder(result).reverse();
        outputStream.write(stringBuilder.toString().getBytes());
        System.out.println(outputStream.toString());

    }
    public static void printSomething(String str) throws IOException {
        stream.write(str.getBytes());
    }
}