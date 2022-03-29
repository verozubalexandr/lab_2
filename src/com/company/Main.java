package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
    }





    /**
     * У вас есть доллары. Вы хотите обменять их на гривны. Есть информация о стоимости купли-продажи в банках города.
     * В городе N банков. Составьте программу, определяющую, какой банк выбрать,
     * чтобы выгодно обменять доллары на гривны
     */
    private static void task1() {
        //init
        int bestRatePosition = 0;
        float bestRate = 0;
        byte firstRate = 1;
        float[] dollarExchangeRates = new float[((int) ((Math.random() * 6) + 10))];

        //fill array + search best rate
        for (int i = 0; i < dollarExchangeRates.length; i++) {
            dollarExchangeRates[i] = ((float) ((Math.random() * 3) + 28));
            if (firstRate == 1) {
                bestRate = dollarExchangeRates[i];
                bestRatePosition = i;
                firstRate = 0;
            } else {
                if (bestRate < dollarExchangeRates[i]) {
                    bestRate = dollarExchangeRates[i];
                    bestRatePosition = i;
                }
            }
        }

        //print results
        System.out.println("Exchange Rates: ");
        System.out.println((Arrays.toString(dollarExchangeRates)));
        System.out.println("Best exchange rate(" + bestRate + ") in bank №" + (bestRatePosition + 1) + ".");
    }





    /**
     * Найти сумму всех элементов массива вещественных чисел, больших заданного числа.
     */
    private static void task2() {
        //init
        float[] realNumbersArray = new float[((int) ((Math.random() * 6) + 10))];
        float valueBoundary = ((float) (Math.random() * 10));
        float afterBoundarySum = 0;

        //fill array + count sum
        for (int i = 0; i < realNumbersArray.length; i++) {
            realNumbersArray[i] = ((float) (Math.random() * 10));
            if (realNumbersArray[i] > valueBoundary)
                afterBoundarySum += realNumbersArray[i];
        }

        //print results
        System.out.println("Source array -> " + (Arrays.toString(realNumbersArray)));
        System.out.println("Sum of elements that are greater than " + valueBoundary + " -> " + afterBoundarySum);
    }





    /**
     * Удалить элемент массива целых чисел C(25), кратный 5.
     * Если таких элементов нет, выдать сообщение «элементы для удаления не найдены».
     * Если таких элементов несколько, удалить последний из найденных.
     */
    private static void task3() {
        //init
        byte checkMultiplicity = 0;
        int removedElementPosition = 0;
        final int lengthOfSource = 25;
        int[] sourceArray = new int[lengthOfSource];

        //fill source array
        for (int i = 0; i < lengthOfSource; i++)
            sourceArray[i] = ((int) (Math.random() * 19));

        //print array source
        System.out.println("Source array -> " + Arrays.toString(sourceArray));

        //search elements(%5 == 0) + remove
        for (int i = 0; i < sourceArray.length; i++) {
            if ((sourceArray[i] % 5) == 0) {
                removedElementPosition = (i + 1);
                checkMultiplicity = 1;
            }
        }

        //remove element
        if ((checkMultiplicity == 1)) {
            removeElement(sourceArray, removedElementPosition);
            System.out.println("Output array -> " + (Arrays.toString(sourceArray)));
        } else {
            System.out.println("No elements multiple of 5");
        }
    }

    /**
     * @param sourceArray            source array
     * @param removedElementPosition position of removed element
     */
    private static void removeElement(int[] sourceArray, int removedElementPosition) {
        java.lang.System.arraycopy(sourceArray, removedElementPosition, sourceArray, (removedElementPosition - 1), ((sourceArray.length) - removedElementPosition));
        sourceArray[(sourceArray.length) - 1] = 0;
    }





    /**
     * Заданы два массива. Создать один массив, в котором вначале идут четные элементы, затем нечетные.
     */
    private static void task4() {
        //init
        int[] firstSourceArray = new int[((int) ((Math.random() * 20) + 1))];
        int[] secondSourceArray = new int[((int) ((Math.random() * 20) + 1))];
        int[] outputArray = new int[((secondSourceArray.length) + (firstSourceArray.length))];
        int outPairIndexCounter = 0;
        int outUnpairIndexCounter = ((outputArray.length) - 1);

        //fill arrays + add values to output array
        for (int i = 0; i < (firstSourceArray.length); i++) {
            firstSourceArray[i] = ((int) ((Math.random() * 20) + 1));
            if ((firstSourceArray[i]) % 2 == 0) {
                outputArray[outPairIndexCounter] = firstSourceArray[i];
                outPairIndexCounter++;
            } else {
                outputArray[outUnpairIndexCounter] = firstSourceArray[i];
                outUnpairIndexCounter--;
            }
        }
        for (int i = 0; i < (secondSourceArray.length); i++) {
            secondSourceArray[i] = ((int) ((Math.random() * 20) + 1));
            if ((secondSourceArray[i]) % 2 == 0) {
                outputArray[outPairIndexCounter] = secondSourceArray[i];
                outPairIndexCounter++;
            } else {
                outputArray[outUnpairIndexCounter] = secondSourceArray[i];
                outUnpairIndexCounter--;
            }
        }

        //print source arrays + output array
        System.out.println("First array -> " + Arrays.toString(firstSourceArray));
        System.out.println("Second array -> " + Arrays.toString(secondSourceArray));
        System.out.println("Output array -> " + Arrays.toString(outputArray));
    }





    /**
     * Даны координаты n точек на плоскости: (Х1, Y1), ..., (Хn, Yn) (n ≤ 30).
     * Найти номера пары точек, расстояние между которыми наибольшее (считать, что такая пара единственная).
     */
    private static void task5() {
        //init
        float[] xCoordinates = new float[((int) ((Math.random() * 29) + 3))];
        float[] yCoordinates = new float[(xCoordinates.length)];
        float maxDistance;
        float maxDistanceDotX1;
        float maxDistanceDotX2;
        float maxDistanceDotY1;
        float maxDistanceDotY2;

        //fill arrays
        for (int i = 0; i < (xCoordinates.length); i++) {
            xCoordinates[i] = ((float) ((Math.random() * 9) - 5));
            yCoordinates[i] = ((float) ((Math.random() * 9) - 5));
        }

        //search max distance
        maxDistance = (float) (Math.sqrt(((xCoordinates[1] - xCoordinates[0]) * (xCoordinates[1] - xCoordinates[0])) + ((yCoordinates[1] - yCoordinates[0]) * (yCoordinates[1] - yCoordinates[0]))));
        maxDistanceDotX1 = xCoordinates[0];
        maxDistanceDotX2 = xCoordinates[1];
        maxDistanceDotY1 = yCoordinates[0];
        maxDistanceDotY2 = yCoordinates[1];
        for (int i = 0; i < (xCoordinates.length); i++) {
            for (int j = 0; j < (xCoordinates.length); j++) {
                if (maxDistance < ((float) (Math.sqrt(((xCoordinates[j] - xCoordinates[i]) * (xCoordinates[j] - xCoordinates[i])) + ((yCoordinates[j] - yCoordinates[i]) * (yCoordinates[j] - yCoordinates[i])))))) {
                    maxDistance = ((float) (Math.sqrt(((xCoordinates[j] - xCoordinates[i]) * (xCoordinates[j] - xCoordinates[i])) + ((yCoordinates[j] - yCoordinates[i]) * (yCoordinates[j] - yCoordinates[i])))));
                    maxDistanceDotX1 = xCoordinates[i];
                    maxDistanceDotX2 = xCoordinates[j];
                    maxDistanceDotY1 = yCoordinates[i];
                    maxDistanceDotY2 = yCoordinates[j];
                }
            }
        }

        //print results
        System.out.println("X -> " + Arrays.toString(xCoordinates));
        System.out.println("Y -> " + Arrays.toString(yCoordinates));
        System.out.println("Max distance ->  -> " + String.format("%5.3f", maxDistance));
        System.out.println("Dots -> (" + maxDistanceDotX1 + "; " + maxDistanceDotY1 + ") and (" + maxDistanceDotX2 + "; " + maxDistanceDotY2 + ")");
    }
}
