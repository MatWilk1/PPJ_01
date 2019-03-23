package pl.edu.pw.ii.javaee.ppj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Array100 {

	// Metoda sortowania bąbelkowego
	void bubbleSort(int[] x) {
		for (int j = 0; j < x.length - 1; j++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
					// swap the values
					int temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[100];
		Random randomGen = new Random();

		// Uzupełnia tablicę losowymi wartościami i wypisuje wszystkie elementy
		System.out.println("Wygenerowana tablica (w dwóch widokach):");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randomGen.nextInt(10);
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(arr)); // ładniejszy format

		// Wylicza liczbę wystąpień każdej wartości
		System.out.println("\nLiczba wystąpień każdej wartości: ");
		HashSet<Integer> uniqueArr = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			int counter = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] == arr[i]) {
					counter++;
				}
			}

			if (uniqueArr.contains(arr[i]) == false) {
				System.out.println(arr[i] + ": " + counter);
				uniqueArr.add(arr[i]);
			}
		}

		// Wylicza najmniejszą wartość tablicy
		int arrMin = arr[0];
		for (int i : arr) {
			if (i < arrMin) {
				arrMin = i;
			}
		}
		System.out.println("\nNajmniejsza wartość w tablicy: " + arrMin);

		// Wylicza największą wartość tablicy
		int arrMax = arr[0];
		for (int i : arr) {
			if (i > arrMax) {
				arrMax = i;
			}
		}
		System.out.println("\nNajwiększa wartość w tablicy: " + arrMax);

		// Wylicza sumę elementów tablicy
		int arrSum = 0;
		for (int i : arr) {
			arrSum += i;
		}
		System.out.println("\nSuma elementów tablicy: " + arrSum);

		// Sortowanie bąbelkowe
		System.out.println("\nSortowanie bąbelkowe i wynik w kolejności malejącej:");
		Array100 bbSort = new Array100();
		bbSort.bubbleSort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
