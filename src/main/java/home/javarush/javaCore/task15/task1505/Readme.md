
Исправь метод containsBones() и всю связанную с ним логику так, чтобы:
1. Поведение программы осталось прежним.
2. Метод containsBones() возвращал тип Object и значение &quot;Yes&quot; вместо true, &quot;No&quot; &mdash; вместо false.


Требования:
1.	Метод containsBones() в классе BodyPart должен иметь тип возвращаемого значения Object.
2.	Класс Finger должен быть потомком класса BodyPart.
3.	Метод containsBones() в классе Finger должен иметь тип возвращаемого значения Object.
4.	Метод containsBones() в классе BodyPart должен возвращать строку &quot;Yes&quot;.
5.	Метод containsBones() в классе Finger должен возвращать строку &quot;Yes&quot;, если такой же метод в классе BodyPart возвращает &quot;Yes&quot; и флаг isArtificial равен false. Если приведенное условие не выполняется - вернуть &quot;No&quot;.
6.	Метод toString() в классе BodyPart должен возвращать строку формата &quot;name(имя части тела) содержит кости&quot;, если метод containsBones() возвращает &quot;Yes&quot; для этой части тела. Если &quot;No&quot;, то строку формата &quot;name(имя части тела) не содержит кости&quot;.


