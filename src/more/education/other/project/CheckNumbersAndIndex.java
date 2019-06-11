package more.education.other.project;

import java.util.Scanner;

public class CheckNumbersAndIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        do {
            System.out.println("ВВедите размер массива: ");
            size = input.nextInt();

            if (size <= 0) {
                System.out.println("Размер массива должен быть больше 0");
            }
        } while (size <= 0);

        double[] array = new double[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Полученный массив: ");
        printArray(array);
        System.out.println();


        int userIdxForUpdate ;

        do {
            System.out.println("Введите индекс числа: ");
            userIdxForUpdate = input.nextInt();
            if (userIdxForUpdate <= 0 || userIdxForUpdate > array.length) {
                System.out.println("Индекс не может быть 0 и не может не соответствовать ни одному из элементов массива");
            }


        } while (userIdxForUpdate <= 0 || userIdxForUpdate > array.length);

        array[userIdxForUpdate - 1] = array[userIdxForUpdate - 1] + array[userIdxForUpdate - 1] / 100 * 10;
        System.out.println();

        System.out.println("результат: ");
        printArray(array);

    }

    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
    }

}