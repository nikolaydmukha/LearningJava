*Variant1*

Одним из распространенных способов использования интерфейсов в Java является создание обратного вызова. Суть обратного
вызова состоит в том, что мы создаем действия, которые вызываются при других действиях. То есть одни действия вызываются
другими действиями. Стандартный пример - нажатие на кнопку. Когда мы нажимаем на кнопку, мы производим действие, но в
ответ на это нажатие запускаются другие действия. Например, нажатие на значок принтера запускает печать документа на
принтере и т.д.

Итак, здесь у нас определен класс Button, который в конструкторе принимает объект интерфейса EventHandler и в методе
click (имитация нажатия) вызывает метод execute этого объекта.

Далее определяется реализация EventHandler в виде класса ButtonClickHandler. И в основной программе объект этого класса
передается в конструктор Button. Таким образом, через конструктор мы устанавливаем обработчик нажатия кнопки. И при
каждом вызове метода button.click() будет вызываться этот обработчик

*Variant 2*

Но казалось бы, зачем нам выносить все действия в интерфейс, его реализовать, почему бы не написать проще сразу в классе
Button/

Дело в том, что на момент определения класса нам не всегда бывают точно известны те действия, которые должны
производиться. Особенно если класс Button и класс основной программы находятся в разных пакетах, библиотеках и могут
проектироваться разными разработчиками. К тому же у нас может быть несколько кнопок - объектов Button и для каждого
объекта надо определить свое действие. Например, изменим главный класс программы.

Здесь у нас две кнопки - одна для включения-выключения телевизора, а другая для печати на принтере. Вместо того, чтобы
создавать отдельные классы, реализующие интерфейс EventHandler, здесь обработчики задаются в виде анонимных объектов,
которые реализуют интерфейс EventHandler. Причем обработчик кнопки телевизора хранит дополнительное состояние в виде
логической переменной on.
