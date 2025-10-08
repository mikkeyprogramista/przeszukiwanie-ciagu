package pl.gornik.search;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = getSize();
        int element = getElement();
        int[] numbers = getNumbers(size);
        find(size, element, numbers);
    }

    public static int getSize() {
        System.out.println("Podaj rozmair tablicy: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int getElement() {
        System.out.println("Podaj poszukiwany element: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int[] getNumbers(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj " + i + " element tablicy: ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        return numbers;
    }

    public static void find(
            int size,
            int element,
            int[] numbers) {
        int i = 0;
        while (i < size && numbers[i] != element) {
            i++;
        }

        if (i == size) {
            System.out.println("NIE");
        } else {
            System.out.println("TAK");
        }
    }
}
