
В статическом блоке класса Solution выбрось Exception.
Нужно, чтобы класс не загрузился, и вместо значения переменной B появилось сообщение об ошибке:

Exception in thread &quot;main&quot; java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.&lt;clinit&gt;(Solution.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement


Требования:
1.	В классе Solution в статическом блоке должно возникать исключение (Exception).
2.	Программа не должна ничего выводить на экран, кроме автоматического сообщения о возникшем исключении.
3.	Программа не должна считывать данные с клавиатуры.
4.	Класс Solution должен быть public.

