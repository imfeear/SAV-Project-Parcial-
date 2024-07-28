package Sorts;

public interface SortUtils {
    void sort(Object[] array, String order);

    default void printArray(Object[] array) {
        for (Object o : array) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
