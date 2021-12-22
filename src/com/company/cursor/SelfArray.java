package com.company.cursor;

import java.util.Arrays;
import java.util.Random;

public class SelfArray {
    private int[] array;

    public SelfArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    public void fillOddNumbers() {
        array = new int[array.length];
        for (int i = 0, a = 2; i < array.length; i++) {
            array[i] = a;
            a += 2;
        }
        System.out.println("Заповнити масив тільки парними числами");
        System.out.println("Odd numbers: " + Arrays.toString(array) + "\n\n");
    }

    public void fillRandomNumbers() {
        array = new int[array.length];
        Random random = new Random();
        for (int i = 0, a; i < array.length; i++) {
            a = random.nextInt(100);
            array[i] = a;
        }
        System.out.println("Заповнити масив рандомними числами");
        System.out.println("Random values: " + Arrays.toString(array) + "\n\n");
    }


    public void getMiddleValue() {
        fillRandomNumbers();
        int avg = 0;
        for (int i = 0, a; i < array.length; i++) {
            a = array[i];
            avg += a;
        }
        System.out.println("Вивести середнє значення масиву");
        System.out.println("AVG: " + avg / array.length + "\n\n");
    }


    public void getMultiplesOfThree() {
        fillRandomNumbers();
        int sum = 0;
        for (int i = 0, a; i < array.length; i++) {
            a = array[i];
            if (a % 3 == 0) {
                sum += a;
            }
        }
        System.out.println("Вивести суму всіх значень кратних 3");
        System.out.println("sum of all multiples of 3: " + sum + "\n\n");
    }

    public void getOddIndexesValues() {
        fillRandomNumbers();
        int[] arrIndex = new int[array.length / 2];
        for (int i = 0, a = 0; i < arrIndex.length; i++) {
            if (i % 2 == 0) {
                arrIndex[a] = arrIndex[i];
                a++;
            }
        }
        System.out.println("Вивести значення всіх парних індексів масиву");
        System.out.println("Values of odd indexes: " + Arrays.toString(arrIndex) + "\n\n");
    }

    public void bubbleSort() {

        int[] arrToSort = array.clone();
        for (int i = 0; i < arrToSort.length - 1; i++) {
            int temp;
            for (int j = 1; j < arrToSort.length - i; j++) {
                if (arrToSort[j - 1] > arrToSort[j]) {
                    temp = arrToSort[j - 1];
                    arrToSort[j - 1] = arrToSort[j];
                    arrToSort[j] = temp;
                }
            }
        }
        System.out.println("Просортувати масив в порядку зростання bubble sort");
        System.out.println("Sorted array: " + Arrays.toString(arrToSort) + "\n\n");
    }

    public void getMinValue() {
        fillRandomNumbers();
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < min) {
                    min = array[j];
                }
            }
        }
        System.out.println("Вивести найменше значення в масиві");
        System.out.println("Min values: " + min + "\n\n");
    }

    public void getMaxValue() {
        fillRandomNumbers();
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
            }
        }

        System.out.println("Вивести найбільше значення масиву");
        System.out.println("Max value: " + max + "\n\n");
    }


    public void getValueOddIndexes() {
        fillRandomNumbers();
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }

        System.out.println("Вивести суму значень всіх парних індексів");
        System.out.println("Sum of odd indexes: " + sum + "\n\n");


    }

    public void showFirstSymbolsASCII() {
        char[] firstTwentySymbols = new char[20];
        for (int i = 0; i < firstTwentySymbols.length; i++) {
            firstTwentySymbols[i] = (char) (i);
        }

        System.out.println("Вивести перших 20 символів з таблиці ASCI");
        System.out.println("First 20 symbols from ASCI table: " + Arrays.toString(firstTwentySymbols) + "\n\n");
    }

    public void taskWithStar() {
        System.out.println("Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними");
        int temp;
        Random random = new Random();
        fillRandomNumbers();
        for (int i = 0, a; i < array.length; i++) {
            a = random.nextInt(100);
            array[i] = a;
        }
        System.out.println("Random values: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i += 2) {
            temp = array[i + 1];
            array[i + 1] = array[i];
            array[i] = temp;
        }
        System.out.println("changed random values odd and even places: " + Arrays.toString(array) + "\n\n");
    }
}
