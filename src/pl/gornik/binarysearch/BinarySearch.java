package pl.gornik.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int element = getElement();
        int[] numbers = getNumbers();
        System.out.println("Index of the number: " + search(element, numbers));
    }

    public static int getSize() {
        System.out.println("Podaj rozmair tablicy: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int getElement() {
        System.out.println("Podaj poszukiwany element: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int[] getNumbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        return numbers;
    }

    public static int[] getNumbers(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj " + i + " element tablicy: ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        return numbers;
    }

    public static int search(int element, int[] numbers) {
        int min = 0;
        int max = numbers.length - 1;
        int middle = (min + max) / 2;

        while (min <= max) {
            if (element == numbers[middle]) {
                return middle;
            } else if (element > numbers[middle]) {
                min = middle + 1;
            } else if (element < numbers[middle]) {
                max = middle - 1;
            }
            middle = (min + max) / 2;
        }

        return -1;
    }
}
