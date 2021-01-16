package home.javarush.javaSyntax.task18.task1810;

import java.util.ArrayList;
import java.util.Collections;

/* 
Преобразование списка в массив
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        //напишите тут ваш код

        String[] strArr = strings.toArray(String[]::new);
        return strArr;
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        //напишите тут ваш код
        Integer[] intArr = integers.toArray(Integer[]::new);
        return intArr;
    }
}
