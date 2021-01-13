package main.java.home.javarush.javaCore.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        System.out.println(o.getClass().getSimpleName());
        if (o instanceof Cat && !o.getClass().getSimpleName().equals("Tiger") && !o.getClass().getSimpleName().equals("Lion")){
            return "Кот";
        }else if (o instanceof Tiger && o.getClass().getSimpleName().equals("Tiger")) {
            return "Тигр";
        }else if (o instanceof Lion && o.getClass().getSimpleName().equals("Lion")) {
            return "Лев";
        }else if (o instanceof Bull) {
            return "Бык";
        }else if (o instanceof Cow) {
            return "Корова";
        }
        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
