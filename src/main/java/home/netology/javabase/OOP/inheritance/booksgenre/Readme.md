### Иерархия "Жанры книг"

*Описание*

Продолжим рассматривать предметную область онлайн-библиотеки. В нашей библиотеке есть множество жанров книг. Часть из
них можно объединить в группы и переиспользовать их функционал вместо того, чтобы писать его заново.

Реализуйте иерархию жанров книг с помощью наследования. В ней должны быть представлены три группы жанров:

→ по объему текста (повесть/роман/рассказ);

→ по форме текста (проза/стихи);

→ по содержанию (фантастика/детектив/проф.литература).

Необходимо с помощью наследования реализовать программу, в которой будет один базовый класс Genre, три наследника
базового класса (GenreByContent, GenreByForm, GenreByNumberOfPages), в которых будут определены атрибуты каждой группы
жанров, и на каждый класс группы жанров — по несколько классов, в которых будет определено конкретное название жанра.

Данный функционал пригодится в случае массовой фильтрации книг по какому-то искомому статусу (в нашем случае по жанру).

Также необходимо будет описать класс Book с базовым набором полей, состоящим из title и списка жанров, и класс
BookService с методом filterBookByGenre, в котором будет осуществляться фильтрация книг.

Общая идея следующая: у каждой книги может быть множество жанров разных групп одновременно, мы хотим научиться отбирать
книги по нужному нам жанру.
