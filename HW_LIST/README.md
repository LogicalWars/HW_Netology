# Домашнее задание к занятию «Коллекции List»

## Цель задания

1. Применить новый инструмент для работы с наборами данных — списки.

------

## Задание 1 (обязательное)

Реализуйте программу, которая помогает пользователю управлять списком дел. Дела можно считать уникальными, т. е. без повторов.

Должны быть операции:

* добавления нового дела в список;
* вывода всех дел с нумерацией;
* удаления дела по его номеру. Если нет дела с таким номером, об этом нужно написать пользователю;
* удаления дела по его точному тексту. Если нет дела текст которого совпадает с искомым текстом, об этом нужно написать пользователю;
* выход из программы.

Пользователю на повторе должно предлагаться меню с операциями на выбор.
После каждой операции должен выводиться пронумерованный список всех дел.

### Пример работы программы

```text
Выберите операцию:

0. Выход из программы
1. Добавить дело
2. Показать дела
3. Удалить дело по номеру
4. Удалить дело по названию
Ваш выбор: 1

Введите название задачи: Сходить в магазин
Добавлено!
Ваш список дел:
1. Сходить в магазин

Выберите операцию:
0. Выход из программы
1. Добавить дело
2. Показать дела
3. Удалить дело по номеру
4. Удалить дело по названию
Ваш выбор: 1

Введите название задачи: Приготовить завтрак
Добавлено!
Ваш список дел:
1. Сходить в магазин
2. Приготовить завтрак

Выберите операцию:
0. Выход из программы
1. Добавить дело
2. Показать дела
3. Удалить дело по номеру
4. Удалить дело по названию
Ваш выбор: 1

Введите название задачи: Помочь соседу
Добавлено!
Ваш список дел:
1. Сходить в магазин
2. Приготовить завтрак
3. Помочь соседу

Выберите операцию:
0. Выход из программы
1. Добавить дело
2. Показать дела
3. Удалить дело по номеру
4. Удалить дело по названию
Ваш выбор: 3

Введите номер для удаления: 2
Удалено!
Ваш список дел:
1. Сходить в магазин
2. Помочь соседу

Выберите операцию:
0. Выход из программы
1. Добавить дело
2. Показать дела
3. Удалить дело по номеру
4. Удалить дело по названию
Ваш выбор: 4

Введите задачу для удаления: Сходить в магазин
Удалено!
Ваш список дел:
1. Помочь соседу
```

------

## Задание 2 (необязательное)

:warning: _Эта задача — усложнение первой задачи, поэтому выполняйте её в том же проекте. В качестве домашнего задания вы сдадите один проект, в котором первая или вторая задача._

Добавьте операцию удаления по ключевому слову.
При такой операции пользователь вводит слово, а из списка удаляются все задачи, которые это слово содержат.

Напоминаем, что нельзя модифицировать коллекцию во время её обхода циклом for-each или итератором.
Подумайте, как можно реализовать требуемый функционал и соблюсти это ограничение.
Обязательно проверьте работоспособность программы на примере удаления нескольких задач одним вызовом этой операции, включая удаление подряд стоящих задач.

