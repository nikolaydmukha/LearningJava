package home.javarush.javaSyntax.task18.task1817;

import java.util.stream.Stream;

/* 
Анализ потока чисел
*/

public class Solution {

    public static void main(String[] args) {
        String answerYes = "Yes";
        String answerNo = "No";

        Stream<Integer> stream1 = Stream.of(10, -22, 3, 12, -85, 0, 142);

        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream1) ? answerYes : answerNo;
        System.out.println("Has stream negative even numbers? " + answerNegativeEvenNumbers);

        Stream<Integer> stream2 = Stream.of(10, 22, 3, 12, 85, 142);

        String answerOnlyPositiveNumbers = hasOnlyPositiveNumbers(stream2) ? answerYes : answerNo;
        System.out.println("Has stream only positive numbers? " + answerOnlyPositiveNumbers);

        Stream<Integer> stream3 = Stream.of(-10, -22, -3, -12, -85, -142);

        String answerOnlyNegativeNumbers = hasOnlyNegativeNumbers(stream3) ? answerYes : answerNo;
        System.out.println("Has stream only negative numbers? " + answerOnlyNegativeNumbers);
    }

    public static boolean hasNegativeEvenNumbers(Stream<Integer> stream) {
        //напишите тут ваш код
        boolean eventNegative = stream.anyMatch(item -> item < 0 && item % 2 == 0);
        return eventNegative;
    }

    public static boolean hasOnlyPositiveNumbers(Stream<Integer> stream) {
        //напишите тут ваш код
        boolean allPositive = stream.allMatch(item -> item > 0);
        return allPositive;
    }

    public static boolean hasOnlyNegativeNumbers(Stream<Integer> stream) {
        //напишите тут ваш код
        boolean allNegative = stream.noneMatch(item -> item > 0);
        return allNegative;
    }
}
