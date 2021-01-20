
Давай создадим классы животных и определим их размер, унаследовав их от правильных классов.
Для этого:
1. Создай public static класс Goose (Гусь).
2. Создай public static класс Dragon (Дракон).
3. Унаследуй класс Goose от BigAnimal или SmallAnimal, подумай, какой подходит лучше.
4. Унаследуй класс Dragon от BigAnimal или SmallAnimal, подумай, какой подходит лучше.
5. В классах Goose и Dragon переопредели метод String getSize(), расширь видимость до максимальной.
6. В классе Goose метод getSize должен возвращать строку &quot;Гусь маленький, &quot; + [getSize родительского класса].
7. В классе Dragon метод getSize должен возвращать строку &quot;Дракон большой, &quot; + [getSize родительского класса].


Требования:
1.	Класс Goose должен быть создан внутри класса Solution и быть статическим.
2.	Класс Dragon должен быть создан внутри класса Solution и быть статическим.
3.	Класс Goose должен быть потомком класса SmallAnimal.
4.	Класс Dragon должен быть потомком класса BigAnimal.
5.	В классе Goose должен быть переопределен метод getSize, который должен возвращать строку формата &quot;Гусь маленький, &quot; + [getSize родительского класса].
6.	В классе Dragon должен быть переопределен метод getSize, который должен возвращать строку формата &quot;Дракон большой, &quot; + [getSize родительского класса].
7.	Область видимости переопределенных методов getSize в классах Goose и Dragon нужно расширить до максимальной.

