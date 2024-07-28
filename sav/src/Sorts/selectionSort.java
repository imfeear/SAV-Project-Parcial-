package Sorts;

public class selectionSort implements SortUtils {

    @Override
    public void sort(Object[] array, String order) {
        boolean ascending = order.equalsIgnoreCase("AZ");
        int n = array.length;
        System.out.println("Selection Sort:");

        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if ((ascending && Comparator.compare(array[j], array[index]) < 0) ||
                        (!ascending && Comparator.compare(array[j], array[index]) > 0)) {
                    index = j;
                }
            }
            //Troca de elementos
            Object temp = array[index];
            array[index] = array[i];
            array[i] = temp;
            printArray(array);
            System.out.println("Passo " + (i + 1) + ":");
        }
    }
}