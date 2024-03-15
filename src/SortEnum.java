public enum SortEnum {

    SELECTIONSORT("Selection Sort"),
    MERGESORT("Merge Sort"),
    BUBBLESORT("Bubble Sort");


    private final String sortName;

    SortEnum(String sortName) {
        this.sortName = sortName;
    }

    public String getSortName() {
        return this.sortName;
    }
    
}
