## Учет товаров на складах

*Описание*

Необходимо написать программу для учета товаров на складах.
Основная цель: по серийному номеру товара узнать, на каком складе он хранится.
Итак, у нас есть:
* Товар: номер (уникальный), название, цена;
* Склад: имя (уникальное), адрес.

### Функционал программы
1. Создание нескольких складов при запуске программы (2 или 3 склада);
2. Добавление товара на каждый склад;
3. Поиск наличия товара на каждом складе (в цикле).

### Пример
```
Добрый день, вы запустили программу складского учета.
Чтобы добавить товар введите: номер, название, цену товара (за кг, литр) и нажмите <enter>
Чтобы завершить ввод введите пустую строку в качестве товара
Введите товар:
12344 Мандарины 120 р. <enter>
Укажите склад размещения товара (склад 1, склад 2):
склад 1 <enter>
Введите товар:
52341 Помидоры 99 р. <enter>
Укажите склад размещения товара (склад 1, склад 2):
склад 2 <enter>
<enter>
Для поиска товара введите его идентификатор и нажмите <enter>:
12344 <enter>
Остатки товара с номером 12344:
  Склад: склад 1
  Товар: Мандарины
  Цена: 120 р.
<enter>
Для поиска товара введите его идентификатор и нажмите <enter> (для выхода нажмите <enter>):
<enter>
Выход.
```

### Реализация
1. Создадим классы Product и Storage.
2. Для корректной работы коллекций HashMap и HashSet переопределим функции `hashCode()` и `equals()` в используемых 
   классах. Так как у товара и у склада есть поля с уникальными значениями (номер у товара и имя у склада), сделать это 
   будет легко! Просто воспользуемся реализацией hashCode и equals этих полей.
   Например:
  ```
  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (obj.getClass() != getClass()) return false;
    Product other = (Product) obj;
    return name.equals(other.name);
  }
  
  @Override
  public int hashCode() {
    return name.hashCode();
  }
  ```
3. Создадим 2 или 3 объекта Storage (склад).
4. Создадим цикл для ввода Product. После каждого создания объекта Product нужно запросить информацию,
   на какой склад добавить созданный объект.
5. Создадим метод поиска товаров на складе.

### Дополнительный функционал
1. Добавить перемещение товара с одного склада на другой.
2. Добавить удаление товара со склада по идентификатору товара.