# Умова задачі
Задача 4️

Напишіть код, що генерує абсолютно випадкове число від 1 до 100… але без генератора випадкових чисел. Ви ж таке можете, чи не так?

# Розв'язок задачі

```java
    return (((Integer.parseInt(String.valueOf(System.nanoTime() / 1000000)) % (5 == 5 ? null == null ? 0b1100100 : 0 : 0)) * ((int) System.nanoTime() % (11 - 1) > 0 ? 0b1 : -0b1) + (1 << 6 | 1 << 5 | 1 << 2)) + ((int) (((new Object()).hashCode() * 32416190071L + ("01".charAt(1) - '0')) % 100) + Integer.parseInt("100")) % 100 + (int) Math.pow(10, 0)) % (true ? 100 : 0) + ('A' - '@');
```

## Опис

Цей проєкт демонструє метод для генерації випадкового числа в діапазоні від 1 до 100 на мові Java. Метод `getRandomNumber()` є складним, важко передбачуваним і навмисно погано написаним. Незважаючи на свою хаотичну і неефективну реалізацію, цей метод успішно повертає числа у зазначеному діапазоні.

Програма включає:
1. Тестування на 100 мільйонів випадкових чисел для перевірки валідності генерації.
2. Демонстрацію результатів у вигляді 10 випадкових чисел.

## Структура проекту

Проєкт складається з одного класу:

- `LainoCodeTask`: Містить метод `main()` для запуску тестів і демонстрації генерації випадкових чисел та методу для генерації чисел `getRandomNumber()`.

## Метод `getRandomNumber()`

```java
private static int getRandomNumber() {
        return (((Integer.parseInt(String.valueOf(System.nanoTime() / 1000000)) % (5 == 5 ? null == null ? 0b1100100 : 0 : 0)) * ((int) System.nanoTime() % (11 - 1) > 0 ? 0b1 : -0b1) + (1 << 6 | 1 << 5 | 1 << 2)) + ((int) (((new Object()).hashCode() * 32416190071L + ("01".charAt(1) - '0')) % 100) + Integer.parseInt("100")) % 100 + (int) Math.pow(10, 0)) % (true ? 100 : 0) + ('A' - '@');
    }
```

## Пояснення роботи `getRandomNumber()`

Цей метод генерує випадкове число за допомогою кількох кроків, використовуючи неефективні і нелогічні підходи:

### Час у наносекундах:
```java
(Integer.parseInt(String.valueOf(System.nanoTime() / 1000000)) % (5 == 5 ? null == null ? 0b1100100 : 0 : 0))
```
Метод починає з використання поточного часу в наносекундах через `System.nanoTime()`. Спочатку час ділиться на 1 мільйон, щоб отримати мілісекунди, після чого цей результат конвертується в строку, а потім назад у ціле число. Цей результат ділиться по модулю на 100, щоб обмежити його в діапазоні від -99 до 99.

### Зміна знаку:
```java
((int) System.nanoTime() % (11 - 1) > 0 ? 0b1 : -0b1)
```
Час у наносекундах перевіряється по модулю на 10. Якщо залишок більше нуля, результат множиться на 1 (залишаючи його незмінним), а інакше множиться на -1, що робить результат погативним (>0).

### Додавання 100:
```java
(Час у наносекундах * Зміна знаку) + (1 << 6 | 1 << 5 | 1 << 2))
```
До результату попереднього множення додається 100 для того, щоб ТОЧНО уникнути негативних чисел та стабілізувати значення в межах позитивного діапазону.

### Хеш-код об'єкта:
```java
 ((int) (((new Object()).hashCode() * 32416190071L + ("01".charAt(1) - '0')) % 100) + Integer.parseInt("100")) % 100 + (int) Math.pow(10, 0)
```
Далі створюється новий об'єкт `new Object()`, і використовується його хеш-код. Хеш-код множиться на велике просте число `32416190071L`, і результат знову обмежується по модулю на 100. Цей код - це розписана 1, і він мав збільшувати попередній крок на 1 для того щоб обмежити генерацію в межах 1 - 100, але як виявилось без цього шматка коду генерація не працює, і я не знаю чому))))

### Фінальне обмеження числа для меж 1 - 100:
```java
% (true ? 100 : 0) + ('A' - '@')
```
Останній етап — остача від ділення на 100 та додавання 1, які обмежують результат у діапазоні від 1 до 100.

## Приклад використання

Метод `main()` запускає тестування та демонструє приклади випадкових чисел:

### Тестування:
Програма генерує 100 мільйонів випадкових чисел і перевіряє, чи всі вони потрапляють у діапазон від 1 до 100. Якщо число виходить за межі, виводиться повідомлення про помилку.

### Демонстрація:
Після тестування виводяться 10 випадкових чисел для візуального підтвердження коректної роботи.

```java
System.out.println("Random number is: " + getRandomNumber());
```

## Демонстрація

Щоб переглянути відеодемонстрацію роботи коду, відвідайте [це посилання](https://drive.google.com/file/d/15mJn1hDfgo1GYg8tng0mLtZuxtIzrMZk/view?usp=sharing).
