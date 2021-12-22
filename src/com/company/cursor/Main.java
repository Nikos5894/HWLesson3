package com.company.cursor;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[100];
        SelfArray array = new SelfArray(arr);
        array.fillOddNumbers();
        array.fillRandomNumbers();
        array.getMiddleValue();
        array.getMultiplesOfThree();
        array.getOddIndexesValues();
        array.bubbleSort();
        array.getMinValue();
        array.getMaxValue();
        array.getValueOddIndexes();
        array.showFirstSymbolsASCII();
        array.taskWithStar();
    }
}
