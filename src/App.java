import java.util.Arrays;
import java.util.Random;

public class App {

    static int[] numbers = new int[10];
    static Random random = new Random();


    public static void main(String[] args) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println();
        selectionSortTest();
    }
    
    /*
     * SelectionSortTEST
     * Vielleicht erklärung hier rein KEKW
     */
    public static void selectionSortTest() {
        SelectionSort selectionSort = new SelectionSort(numbers);
        selectionSort.selectionSort();
        System.out.println(selectionSort.toString());
    }

}
