package pl.gornik.binarysearch;

import java.util.Scanner;

public class BinarySearchString {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String element = getElement();
        String[] words = getWords();
        System.out.println("Index of the number: " + search(element, words));
    }

    public static int getSize() {
        System.out.println("Podaj rozmair tablicy: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static String getElement() {
        System.out.println("Podaj poszukiwany element: ");
        return sc.nextLine();
    }

    public static String[] getWords() {
        String[] numbers = new String[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = String.valueOf(i);
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

    public static int search(String element, String[] words) {
        int min = 0;
        int max = words.length - 1;
        int middle = (min + max) / 2;

        while (min <= max) {
            int comparsion = element.compareTo(words[middle]);

            if (comparsion == 0) {
                return middle;
            } else if (comparsion > 0) {
                min = middle + 1;
            } else if (comparsion < 0) {
                max = middle - 1;
            }
            middle = (min + max) / 2;
        }

        return -1;
    }
}
