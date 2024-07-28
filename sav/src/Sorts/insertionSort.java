package Sorts;

public class insertionSort implements SortUtils {

    @Override
    public void sort(Object[] array, String order) {
        boolean ascending = order.equalsIgnoreCase("AZ");
        System.out.println("Insertion Sort:");

        for (int i = 1; i < array.length; i++) {
            Object key = array[i];
            int j = i - 1;
            while (j >= 0 && ((ascending && Comparator.compare(array[j], key) > 0) ||
                    (!ascending && Comparator.compare(array[j], key) < 0))) {
                array[j + 1] = array[j];
                j--;
                printArray(array);
            }
            array[j + 1] = key;
            printArray(array);
            System.out.println("Passo " + i + ":");
        }
    }
}
