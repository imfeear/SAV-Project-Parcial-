package SortProcessor;

import Sorts.SortUtils;
import Sorts.bubbleSort;
import Sorts.insertionSort;
import Sorts.selectionSort;



public class SortingProcessor {
    public static void processAndSort(String algorithm, Object[] array, String order, int pause){

                SortUtils sortAlgorithm;

                switch (algorithm.toLowerCase()) {
                    case "bubble":
                        sortAlgorithm = new bubbleSort();
                        break;
                    case "insertion":
                        sortAlgorithm = new insertionSort();
                        break;
                    case "selection":
                        sortAlgorithm = new selectionSort();
                        break;
                    default:
                        System.out.println("Algoritmo desconhecido: " + algorithm);
                        return;
                }

                sortAlgorithm.sort(array, order);

        //Pausa
        try {
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Imprimir resultado
        System.out.println("\nResultado:");
        sortAlgorithm.printArray(array);
    }

    }


