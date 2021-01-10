
У Амиго появилась задача: записать байты в файл. Он написал программу, которая считывает из консоли путь к файлу
и записывает в этот файл последовательность байтов, полученную из аргумента метода main(String[]).
Но в процессе написания программы он допустил ошибку.
Как ты уже знаешь, BufferedWriter &quot;не работает&quot; с байтами: для записи байтов в файл нужно использовать метод
write(Path, byte[]) класса Files.
Помоги Амиго исправить программу.


Требования:
1.	Программа должна считать из консоли путь к файлу.
2.	Программа должна записывать байты в файл.
3.	Для записи байтов должен быть использован метод write(Path, byte[]) класса Files.
4.	Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.

