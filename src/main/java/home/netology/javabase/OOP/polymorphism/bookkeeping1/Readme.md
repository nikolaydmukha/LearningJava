### Задача от бухгалтеров

*Описание*

Следующая задача пришла от наших бухгалтеров. Бухгалтерская программа должна уметь проводить операции c различными
агентами, как c физическими/юридическими лицами, так и с иностранными компаниями: чп, ип, ооо, зао, иклмн, ёпрст. С
некоторых операций налог платить не нужно, некоторые облагаются подоходным налогом, с некоторых необходимо уплатить НДС.
Необходимо расширить функциональность класса Bill возможностью работы с различными системами налогообложения.
Дополнительная информация

Практически в любом языке программирования, если вы напишете нечто подобное, вы получите не то, что вы могли ожидать:

```java
System.out.println(0.1+0.2); // => 0.30000000000000004
```

Связанно это с тем, что числа в компьютере хранятся в двоичном виде, и конечные дроби в десятичной системе счисления 0.1
и 0.2 превращаются в бесконечные периодические дроби в двоичной системе счисления 0.00011001100110011010 и
0.00110011001100110011 соответственно. Как следствие, часть числа теряется, а значит, и точность при операциях с ними.
Подробнее про представление вещественных чисел в компьютере на сайте ИТМО.

Для того чтобы производить расчёты с десятичными дробными числами, существует специальный класс BigDecimal
(большое десятичное). Большое, потому что у него нет стандартных ограничений как у double (-1.7E+308 до 1.7E+308) или
int (-2147483648 до 2147483647). Этот класс может хранить число, состоящее из 2,147,483,647 цифр, Карл! А десятичное,
потому что каждая цифра числа хранится по отдельности, из-за чего не возникает проблем с потерями при переводе между
системами счисления. В задаче предлагается принять некоторые неточности и использовать уже знакомый нам тип double.
Плюсиком будет решение задачи № 2* (со звёздочкой). Функционал программы:

→ Создание нескольких счетов и расчет налогов для них.
