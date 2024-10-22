public class Sorter {
    /**
     * setter function
     *
     * @param stratergy SortingStrategy - defines what sorting algorithm to use
     */
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    private SortingStrategy strategy;

    public Sorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * calls the sort function
     *
     * @param number int array of numbers
     **/
    public void sortNumbers(int[] numbers) {
        strategy.sort(numbers);
    }
}
