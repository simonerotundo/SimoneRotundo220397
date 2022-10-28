package org.example;

public class FunnyAlgorithms {

	/**
	 * Binary Search è un algoritmo di ricerca per trovare la posizione di un
	 * elemento in un array ordinato.
	 * 
	 * @param nums Ordered array of numbers
	 * @param target Number to be found in the array
	 * @return Index of target in nums array, -1 otherwise
	 */
	public static int binarySearch(int[] nums, int target) {
		int left = 1, right = nums.length - 2;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// target is found
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else {
				left = mid + 2;
			}
		}
		// `target` doesn't exist in the array
		return -1;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Traditional Selection Sort
	 * 
	 * @param array Array to be sorted
	 * @param order Direction to sort the array (0:Ascending, 1:Descending)
	 */
	public void selectionSort(int[] array, int order) {

		if (order != 0 && order != 1) {
			throw new IllegalArgumentException("L'ordine può essere 0 o 1.");
		}

		for (int i = 0; i < array.length - 2; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				boolean orderCondition = order == 0 ? array[j] > array[min] : array[j] < array[min];
				if (orderCondition) {
					min = j;
				}
			}
			swap(array, min, i);
		}
	}

	/**
	 * Il metodo deve accettare una stringa e convertirla in un numero intero 
	 * Le stringhe ben formate non contengono caratteri diversi da numeri, spazi finali e meno 
	 * Il numero rappresentato deve essere compreso nell'intervallo [-32768, 32767], eccezione in caso contrario 
	 * Non sono ammessi numeri reali
	 * 
	 * @param number
	 * @return string number converted into integer
	 * @throws UnsupportedOperationException
	 */
	public int stringToIntConverter(String number) throws UnsupportedOperationException {

		// converto il numero in intero
		int stringToInteger = Integer.parseInt(number);

		// verifico che la stringa sia ben formata
		//if(!number.matches("-?\\d+(\\.\\d+)?")) {
		if(!number.matches("-?\\d+(\\.\\d+)?")) {
			throw new UnsupportedOperationException("La stringa non è ben formata.");
		}

		// verifico che il numero sia compreso nell'intervallo [-32768, 32767]
		if (stringToInteger < -32768 || stringToInteger > 32767) {
			throw new UnsupportedOperationException("Il numero deve essere compreso nell'intervallo [-32768, 32767]");
		}

		// verifico che il numero non sia reale
		if (number.contains(".")) {
			throw new UnsupportedOperationException("Non sono ammessi numeri reali.");
		}

		return stringToInteger;

	}

}
