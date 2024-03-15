import java.util.Arrays;

public class SelectionSort {

    int[] numbs;
    int length;
    SortEnum getNameOfEnum;

    public SelectionSort(int[] numbers) {

        this.numbs = numbers;
        this.length = numbers.length;
    }

    public void selectionSort() {

        for (int i = 0; i < this.length; i++) {
            int min = this.numbs[i];
            int indexOfMin = i;

            for (int j = 0; j < length - 1; j++) {
                if (this.numbs[j] > min) {
                    min = this.numbs[j];
                    indexOfMin = j;
                }
            }
            swap(this.numbs, i, indexOfMin);
        }
        int time = 0;

        System.out.println("Test for Selection Sort");
        System.out.println("TIME: " + time);
    }

    private void swap(int[] numbers, int i, int indexOfMin) {
        int temp = numbers[i];
        numbers[i] = numbers[indexOfMin];
        numbers[indexOfMin] = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.numbs);
    }

}
