public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Array sorted using Quick Sort");
    }

    private void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            // Partition the array around pivot
            int pi = partition(numbers, low, high);

            // Recursively sort the subarrays
            quickSort(numbers, low, pi - 1);
            quickSort(numbers, pi + 1, high);
        }
    }

    private int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];  // Choose the last element as pivot
        int i = (low - 1);  // Index of smaller element
        for (int j = low; j < high; j++) {
            if (numbers[j] < pivot) {
                i++;

                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;

        return i + 1;
    }
}
