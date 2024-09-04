import javax.print.StreamPrintServiceFactory;
import java.lang.reflect.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                //1
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите целое число: ");
//                int number = scanner.nextInt();
//
//                if (number % 2 == 0) {
//                    System.out.println(number + " - четное число");
//                } else {
//                    System.out.println(number + " - нечетное число");
//                }
                //2

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите первое число: ");
//                int first = scanner.nextInt();
//                System.out.print("Введите второе число: ");
//                int second = scanner.nextInt();
//                System.out.print("Введите третье число: ");
//                int third = scanner.nextInt();
//
//                int min = first;
//                if (second < min) {
//                    min = second;
//                }
//                if (third < min) {
//                    min = third;
//                }
//
//                System.out.println("Минимальное число: " + min);

                //3

//                System.out.println("Таблица умножения на 5:");
//                for (int i = 1; i <= 10; i++) {
//                    System.out.println("5 * " + i + " = " + (5 * i));
//                }

                //4

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите число N: ");
//                int n = scanner.nextInt();
//
//                int sum = 0;
//                for (int i = 1; i <= n; i++) {
//                    sum += i;
//                }
//
//                System.out.println("Сумма чисел от 1 до " + n + " = " + sum);

                //5

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите число N: ");
//                int n = scanner.nextInt();
//
//                int first = 0;
//                int second = 1;
//                System.out.print("Первые " + n + " чисел Фибоначчи: ");
//                for (int i = 0; i < n; i++) {
//                    System.out.print(first + " ");
//                    int next = first + second;
//                    first = second;
//                    second = next;
//                }
//                System.out.println();

                //6

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите целое число: ");
//                int number = scanner.nextInt();
//
//                boolean isPrime = true;
//                if (number <= 1) {
//                    isPrime = false;
//                } else {
//                    for (int i = 2; i <= Math.sqrt(number); i++) {
//                        if (number % i == 0) {
//                            isPrime = false;
//                            break;
//                        }
//                    }
//                }
//
//                if (isPrime) {
//                    System.out.println(number + " - простое число");
//                } else {
//                    System.out.println(number + " - не простое число");
//                }

                //7

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите число N: ");
//                int n = scanner.nextInt();
//
//                System.out.print("Числа от " + n + " до 1 в обратном порядке: ");
//                for (int i = n; i >= 1; i--) {
//                    System.out.print(i + " ");
//                }
//                System.out.println();

                //8

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите число A: ");
//                int a = scanner.nextInt();
//                System.out.print("Введите число B: ");
//                int b = scanner.nextInt();
//
//                int sum = 0;
//                for (int i = a; i <= b; i++) {
//                    if (i % 2 == 0) {
//                        sum += i;
//                    }
//                }
//
//                System.out.println("Сумма четных чисел в диапазоне от " + a + " до " + b + " равна " + sum);

                //9

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите строку: ");
//                String inputString = scanner.nextLine();
//
//                String reversedString = new StringBuilder(inputString).reverse().toString();
//
//                System.out.println("Строка в обратном порядке: " + reversedString);

                //10

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите целое число: ");
//                int number = scanner.nextInt();
//
//                int count = 0;
//                if (number == 0) {
//                    count = 1;
//                } else {
//                    while (number != 0) {
//                        number /= 10;
//                        count++;
//                    }
//                }
//
//                System.out.println("Количество цифр в числе: " + count);

                //11

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите целое число N: ");
//                int n = scanner.nextInt();
//
//                long factorial = 1;
//                for (int i = 1; i <= n; i++) {
//                    factorial *= i;
//                }
//
//                System.out.println("Факториал числа " + n + " равен " + factorial);

                //12

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите целое число: ");
//                int number = scanner.nextInt();
//
//                int sum = 0;
//                while (number != 0) {
//                    sum += number % 10;
//                    number /= 10;
//                }
//
//                System.out.println("Сумма цифр числа: " + sum);

                //13

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите строку: ");
//                String inputString = scanner.nextLine();
//
//                String reversedString = new StringBuilder(inputString).reverse().toString();
//
//                if (inputString.equalsIgnoreCase(reversedString)) {
//                    System.out.println("Строка является палиндромом");
//                } else {
//                    System.out.println("Строка не является палиндромом");
//                }

                //14

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите размер массива: ");
//                int arraySize = scanner.nextInt();
//
//                int[] array = new int[arraySize];
//                System.out.println("Введите элементы массива:");
//                for (int i = 0; i < arraySize; i++) {
//                    array[i] = scanner.nextInt();
//                }
//
//                int max = array[0];
//                for (int i = 1; i < arraySize; i++) {
//                    if (array[i] > max) {
//                        max = array[i];
//                    }
//                }
//
//                System.out.println("Максимальное число в массиве: " + max);

                //15

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите размер массива: ");
//                int arraySize = scanner.nextInt();
//
//                int[] array = new int[arraySize];
//                System.out.println("Введите элементы массива:");
//                for (int i = 0; i < arraySize; i++) {
//                    array[i] = scanner.nextInt();
//                }
//
//                int sum = 0;
//                for (int i = 0; i < arraySize; i++) {
//                    sum += array[i];
//                }
//
//                System.out.println("Сумма всех элементов массива: " + sum);

                //16

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите размер массива: ");
//                int arraySize = scanner.nextInt();
//
//                int[] array = new int[arraySize];
//                System.out.println("Введите элементы массива:");
//                for (int i = 0; i < arraySize; i++) {
//                    array[i] = scanner.nextInt();
//                }
//
//                int positiveCount = 0;
//                int negativeCount = 0;
//                for (int i = 0; i < arraySize; i++) {
//                    if (array[i] > 0) {
//                        positiveCount++;
//                    } else if (array[i] < 0) {
//                        negativeCount++;
//                    }
//                }
//
//                System.out.println("Количество положительных чисел: " + positiveCount);
//                System.out.println("Количество отрицательных чисел: " + negativeCount);

                //17

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите число A: ");
//                int a = scanner.nextInt();
//                System.out.print("Введите число B: ");
//                int b = scanner.nextInt();
//
//                System.out.print("Простые числа в диапазоне от " + a + " до " + b + ": ");
//                for (int i = a; i <= b; i++) {
//                    if (isPrime(i)) {
//                        System.out.print(i + " ");
//                    }
//                }
//                System.out.println();
//            }
//
//            private static boolean isPrime(int number) {
//                if (number <= 1) {
//                    return false;
//                }
//                for (int i = 2; i <= Math.sqrt(number); i++) {
//                    if (number % i == 0) {
//                        return false;
//                    }
//                }
//                return true;

                //17

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите строку: ");
//                String inputString = scanner.nextLine();
//
//                int vowelCount = 0;
//                int consonantCount = 0;
//                for (int i = 0; i < inputString.length(); i++) {
//                    char ch = Character.toLowerCase(inputString.charAt(i));
//                    if (ch >= 'a' && ch <= 'z') {
//                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                            vowelCount++;
//                        } else {
//                            consonantCount++;
//                        }
//                    }
//                }
//
//                System.out.println("Количество гласных букв: " + vowelCount);
//                System.out.println("Количество согласных букв: " + consonantCount);

                //19

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите строку: ");
//                String inputString = scanner.nextLine();
//
//                String[] words = inputString.split(" ");
//                StringBuilder reversedString = new StringBuilder();
//                for (int i = words.length - 1; i >= 0; i--) {
//                    reversedString.append(words[i]).append(" ");
//                }
//
//                System.out.println("Слова в обратном порядке: " + reversedString.toString().trim());

                //20

//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите целое число: ");
//                int number = scanner.nextInt();
//
//                int originalNumber = number;
//                int digitCount = 0;
//                int sum = 0;
//
//                while (number != 0) {
//                    digitCount++;
//                    number /= 10;
//                }
//
//                number = originalNumber;
//                while (number != 0) {
//                    int digit = number % 10;
//                    sum += Math.pow(digit, digitCount);
//                    number /= 10;
//                }
//
//                if (sum == originalNumber) {
//                    System.out.println(originalNumber + " - число Армстронга");
//                } else {
//                    System.out.println(originalNumber + " - не число Армстронга");
//                }

    }
}