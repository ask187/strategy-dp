public class main {
    public static void main(String[] args) {
       /**
        * create an instance of Sorter interface and use
        * */
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        int[] numbers = {5, 3, 8, 2};
        sorter.sortNumbers(numbers);

        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Change to QuickSort
        sorter.setStrategy(new QuickSortStrategy());
        numbers = new int[]{5, 3, 8, 2};
        sorter.sortNumbers(numbers);

        // Print sorted
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
