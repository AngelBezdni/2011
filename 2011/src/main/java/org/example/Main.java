package org.example;

public class Main {
    public static void main(String[] args) {

        // Кальк (тест методов без запроса ввода данных)
        System.out.println(Calculator.sum(10, 20.5));   // 30.5
        System.out.println(Calculator.multiply(4, 6L)); // 24.0
        try {
            System.out.println(Calculator.divide(12, 0)); // Исключение
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());         // Деление на ноль!
        }

        // Массивы
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};

        System.out.println(ArrayUtils.compareArrays(arr1, arr2)); // true

        String[] strArr1 = {"a", "b"};
        String[] strArr2 = {"c", "d"};

        System.out.println(ArrayUtils.compareArrays(strArr1, strArr2)); // false

        // Пары
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println(pair);                 // (Hello, 42)
        System.out.println(pair.getFirst());      // Hello
        System.out.println(pair.getSecond());     // 42
    }
}