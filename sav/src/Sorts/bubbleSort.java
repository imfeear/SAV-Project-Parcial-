package Sorts;

public class bubbleSort implements SortUtils {

    @Override
    public void sort(Object[] array, String order) {
        boolean ascending = order.equalsIgnoreCase("AZ");
        int n = array.length;
        System.out.println("Bubble Sort:");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((ascending && Comparator.compare(array[j], array[j + 1]) > 0) ||
                        (!ascending && Comparator.compare(array[j], array[j + 1]) < 0)) {
                    Object temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                printArray(array);
            }
            System.out.println("Passo " + (i + 1) + ":");
        }
    }
}
