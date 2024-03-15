import java.util.Random;

public class App {


    private static final int menge = 10;
    private static final int groesse = 10000;

    public static void main(String[] args) {

        /************************
         *                      *
         *    Selection Sort    *
         *                      *
         ************************/

        System.out.println("SELECTION SORT");
        System.err.println("SELECTION SORT TEST");
        selectionSortTest();
    }
    
    /*
     * SelectionSortTEST
     * Vielleicht erklärung hier rein KEKW
     */
    public static void selectionSortTest() {

        int[] numbers = new int[menge];
        Random random = new Random();
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(groesse);
        }
        
        SelectionSort selectionSort = new SelectionSort(numbers);
        selectionSort.selectionSort();
        System.out.println(selectionSort.toString());
    }

    /*
     * BubbleSortTEST
     * Vielleicht erklärung hier rein KEKW
     */
    public static void bubbleSortTest() {
        int[] numbers = new int[menge];
        Random random = new Random();
        BubbleSort bubbleSort = new BubbleSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            random.nextInt(groesse);
        }
    }
}
