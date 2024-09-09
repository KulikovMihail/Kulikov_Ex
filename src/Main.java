import javax.print.StreamPrintServiceFactory;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

        class ExceptionHandling {

            // 1
            public static int findMax(int num1, int num2) throws Exception {
                if (num1 == num2) {
                    throw new Exception("Числа равны");
                }
                return Math.max(num1, num2);
            }

            // 2
            public static double divide(int dividend, int divisor) throws ArithmeticException {
                if (divisor == 0) {
                    throw new ArithmeticException("Деление на ноль недопустимо");
                }
                return (double) dividend / divisor;
            }

            // 3
            public static int convertToInt(String str) throws NumberFormatException {
                return Integer.parseInt(str);
            }

            // 4
            public static void checkAge(int age) throws IllegalArgumentException {
                if (age < 0 || age > 150) {
                    throw new IllegalArgumentException("Недопустимый возраст");
                }
            }

            // 5
            public static double findSquareRoot(double num) throws IllegalArgumentException {
                if (num < 0) {
                    throw new IllegalArgumentException("Число отрицательное");
                }
                return Math.sqrt(num);
            }

            // 6
            public static long factorial(int num) throws IllegalArgumentException {
                if (num < 0) {
                    throw new IllegalArgumentException("Число отрицательное");
                }
                if (num == 0) {
                    return 1;
                }
                long result = 1;
                for (int i = 1; i <= num; i++) {
                    result *= i;
                }
                return result;
            }

            // 7
            public static void checkArrayForZeros(int[] array) throws Exception {
                if (Arrays.stream(array).anyMatch(x -> x == 0)) {
                    throw new Exception("В массиве есть нули");
                }
            }

            // 8
            public static double power(double base, int exponent) throws IllegalArgumentException {
                if (exponent < 0) {
                    throw new IllegalArgumentException("Степень отрицательная");
                }
                return Math.pow(base, exponent);
            }

            // 9
            public static String truncateString(String str, int maxLength) throws Exception {
                if (maxLength > str.length()) {
                    throw new Exception("Число символов больше длины строки");
                }
                return str.substring(0, maxLength);
            }

            // 10
            public static int findElement(int[] array, int element) throws Exception {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == element) {
                        return i;
                    }
                }
                throw new Exception("Элемент не найден в массиве");
            }

            // 11
            public static String convertToBinary(int num) throws IllegalArgumentException {
                if (num < 0) {
                    throw new IllegalArgumentException("Число отрицательное");
                }
                return Integer.toBinaryString(num);
            }

            // 12
            public static boolean isDivisible(int dividend, int divisor) throws ArithmeticException {
                if (divisor == 0) {
                    throw new ArithmeticException("Деление на ноль недопустимо");
                }
                return dividend % divisor == 0;
            }

            // 13
            public static <T> T getElementFromList(List<T> list, int index) throws IndexOutOfBoundsException {
                return list.get(index);
            }

            // 14
            public static void checkPassword(String password) throws WeakPasswordException {
                if (password.length() < 8) {
                    throw new WeakPasswordException("Пароль слишком короткий");
                }
            }

            // 15
            public static void checkDate(String date) throws DateTimeParseException {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                try {
                    LocalDate.parse(date, formatter);
                } catch (IllegalArgumentException e) {
                    throw new DateTimeParseException("Некорректный формат даты. Должен быть dd.MM.yyyy", date, 0);
                }
            }

            // 16
            public static String concatenateStrings(String str1, String str2) throws NullPointerException {
                if (str1 == null || str2 == null) {
                    throw new NullPointerException("Одна из строк равна null");
                }
                return str1 + str2;
            }

            // 17
            public static int getRemainder(int dividend, int divisor) throws ArithmeticException {
                if (divisor == 0) {
                    throw new ArithmeticException("Деление на ноль недопустимо");
                }
                return dividend % divisor;
            }

            // 18
            public static double squareRoot(double num) throws IllegalArgumentException {
                if (num < 0) {
                    throw new IllegalArgumentException("Число отрицательное");
                }
                return Math.sqrt(num);
            }

            // 19
            public static double celsiusToFahrenheit(double celsius) throws IllegalArgumentException {
                if (celsius < -273.15) {
                    throw new IllegalArgumentException("Температура меньше абсолютного нуля");
                }
                return celsius * 9 / 5 + 32;
            }

            // 20
            public static void checkEmptyString(String str) throws Exception {
                if (str == null || str.isEmpty()) {
                    throw new Exception("Строка пустая или равна null");
                }
            }

            public static class WeakPasswordException extends Exception {
                public WeakPasswordException(String message) {
                    super(message);
                }
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                //1
                try {
                    System.out.print("Введите первое число: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    int num2 = scanner.nextInt();

                    int max = findMax(num1, num2);
                    System.out.println("Максимальное число: " + max);
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 2
                try {
                    System.out.print("Введите делимое: ");
                    int dividend = scanner.nextInt();
                    System.out.print("Введите делитель: ");
                    int divisor = scanner.nextInt();

                    double result = divide(dividend, divisor);
                    System.out.println("Результат деления: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 3
                try {
                    System.out.print("Введите строку для конвертации: ");
                    String str = scanner.next();

                    int number = convertToInt(str);
                    System.out.println("Конвертированное число: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 4
                try {
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();

                    checkAge(age);
                    System.out.println("Возраст корректный");
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 5
                try {
                    System.out.print("Введите число для нахождения корня: ");
                    double num = scanner.nextDouble();

                    double root = findSquareRoot(num);
                    System.out.println("Квадратный корень: " + root);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 6
                try {
                    System.out.print("Введите число для вычисления факториала: ");
                    int num = scanner.nextInt();

                    long factorial = factorial(num);
                    System.out.println("Факториал: " + factorial);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 7
                try {
                    System.out.print("Введите размер массива: ");
                    int size = scanner.nextInt();
                    int[] array = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }

                    checkArrayForZeros(array);
                    System.out.println("В массиве нет нулей");
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 8
                try {
                    System.out.print("Введите основание: ");
                    double base = scanner.nextDouble();
                    System.out.print("Введите степень: ");
                    int exponent = scanner.nextInt();

                    double result = power(base, exponent);
                    System.out.println("Результат: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 9
                try {
                    System.out.print("Введите строку: ");
                    String str = scanner.next();
                    System.out.print("Введите максимальную длину: ");
                    int maxLength = scanner.nextInt();

                    String truncatedString = truncateString(str, maxLength);
                    System.out.println("Обрезанная строка: " + truncatedString);
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 10
                try {
                    System.out.print("Введите размер массива: ");
                    int size = scanner.nextInt();
                    int[] array = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.print("Введите элемент для поиска: ");
                    int element = scanner.nextInt();

                    int index = findElement(array, element);
                    System.out.println("Индекс элемента: " + index);
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 11
                try {
                    System.out.print("Введите целое число: ");
                    int num = scanner.nextInt();

                    String binary = convertToBinary(num);
                    System.out.println("Двоичное представление: " + binary);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 12
                try {
                    System.out.print("Введите делимое: ");
                    int dividend = scanner.nextInt();
                    System.out.print("Введите делитель: ");
                    int divisor = scanner.nextInt();

                    boolean divisible = isDivisible(dividend, divisor);
                    if (divisible) {
                        System.out.println("Делится");
                    } else {
                        System.out.println("Не делится");
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 13
                try {
                    List<String> list = Arrays.asList("One", "Two", "Three");
                    System.out.print("Введите индекс элемента: ");
                    int index = scanner.nextInt();

                    String element = getElementFromList(list, index);
                    System.out.println("Элемент: " + element);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 14
                try {
                    System.out.print("Введите пароль: ");
                    String password = scanner.next();

                    checkPassword(password);
                    System.out.println("Пароль корректный");
                } catch (WeakPasswordException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 15
                try {
                    System.out.print("Введите дату в формате dd.MM.yyyy: ");
                    String date = scanner.next();

                    checkDate(date);
                    System.out.println("Дата корректная");
                } catch (DateTimeParseException e) {
                    System.out.println("Ошибка: Некорректный формат даты. Должен быть dd.MM.yyyy");
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 16
                try {
                    System.out.print("Введите первую строку: ");
                    String str1 = scanner.next();
                    System.out.print("Введите вторую строку: ");
                    String str2 = scanner.next();

                    String concatenatedString = concatenateStrings(str1, str2);
                    System.out.println("Объединенная строка: " + concatenatedString);
                } catch (NullPointerException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 17
                try {
                    System.out.print("Введите делимое: ");
                    int dividend = scanner.nextInt();
                    System.out.print("Введите делитель: ");
                    int divisor = scanner.nextInt();

                    int remainder = getRemainder(dividend, divisor);
                    System.out.println("Остаток: " + remainder);
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 18
                try {
                    System.out.print("Введите число для нахождения квадратного корня: ");
                    double num = scanner.nextDouble();

                    double root = squareRoot(num);
                    System.out.println("Квадратный корень: " + root);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 19
                try {
                    System.out.print("Введите температуру в Цельсиях: ");
                    double celsius = scanner.nextDouble();

                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("Температура в Фаренгейтах: " + fahrenheit);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // 20
                try {
                    System.out.print("Введите строку: ");
                    String str = scanner.next();

                    checkEmptyString(str);
                    System.out.println("Строка не пустая");
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                scanner.close();
            }
        }