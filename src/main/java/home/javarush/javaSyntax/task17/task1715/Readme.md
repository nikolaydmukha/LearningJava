
В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо &mdash; клавишный.
Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке, и все смешалось в кучу.
Помоги артистам разобрать свои инструменты. И естественно, после этого оба оркестра должны дать концерт.

Для этого:
- в методе createKeyboardOrchestra() заполни список keyboardOrchestra одним органом и тремя пианино;
- в методе createStringedOrchestra() заполни список stringedOrchestra двумя скрипками и одной гитарой;
- метод playKeyboardOrchestra() должен вызывать метод playKeys() у всех элементов списка keyboardOrchestra;
- метод playStringedOrchestra() должен вызывать метод playStrings() у всех элементов списка stringedOrchestra.


Требования:
1.	Метод createKeyboardOrchestra() должен заполнять список keyboardOrchestra одним объектом класса Organ и тремя объектами Piano.
2.	Метод createStringedOrchestra() должен заполнять список stringedOrchestra двумя объектами класса Violin и одним объектом Guitar.
3.	Метод playKeyboardOrchestra() должен вызывать метод playKeys() у всех элементов списка keyboardOrchestra.
4.	Метод playStringedOrchestra() должен вызывать метод playStrings() у всех элементов списка stringedOrchestra.


