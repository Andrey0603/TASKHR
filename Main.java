// Задача: Написать программу, которая из имеющегося массива строк формирует новый массив из строк, длина которых меньше, либо равна 3 символам. Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.

// Примеры:
// [“Hello”, “2”, “world”, “:-)”] → [“2”, “:-)”]
// [“1234”, “1567”, “-2”, “computer science”] → [“-2”]
// [“Russia”, “Denmark”, “Kazan”] → []

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        String[][] inputArrays = {
                {"Hello", "2", "world", ":-)"},
                {"1234", "1567", "-2", "computer science"},
                {"Russia", "Denmark", "Kazan"}
        };

        for (String[] originalArray : inputArrays) {
            String[] newArray = formNewArray(originalArray);
            printArray(newArray);
        }
    }

    public static String[] formNewArray(String[] originalArray) {
        int count = 0;
        for (String str : originalArray) {
            if (str.length() <= 3) {
                count++;
            }
        }

        String[] newArray = new String[count];
        int index = 0;
        for (String str : originalArray) {
            if (str.length() <= 3) {
                newArray[index] = str;
                index++;
            }
        }

        return newArray;
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}