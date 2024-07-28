package Input;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InputUtils {

    public static Object[] processValues(String type, String values, String inputMethod) {
        Object[] array = new Object[0];

            if (type.equals("numero")) {
                switch (inputMethod.toLowerCase()) {
                    case "r":
                        Random rand = new Random();
                        int size = values.isEmpty() ? 10 : Integer.parseInt(values);
                        array = new Integer[size];
                        for (int i = 0; i < array.length; i++) {
                            array[i] = rand.nextInt(100); //Gerar números aleatórios entre 0 e 99
                        }
                        break;
                    case "m":
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Digite os valores separados por espaço:");
                        array = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .map(Integer::parseInt)
                                .toArray(Integer[]::new);
                        break;
                    default:
                        System.out.println("Método de entrada desconhecido: " + inputMethod);
                        break;
                }
            }


         else if (type.equals("caracteres")) {
            switch (inputMethod.toLowerCase()) {
                case "r":
                    Random rand = new Random();
                    int size = values.isEmpty() ? 10 : Integer.parseInt(values);
                    array = new Character[size];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (char) ('a' + rand.nextInt(26)); // Gerar caracteres aleatórios de 'a' a 'z'
                    }
                    break;
                case "m":
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Digite os caracteres separados por espaço:");
                    array = Arrays.stream(scanner.nextLine().split("\\s+"))
                            .map(s -> s.charAt(0))
                            .toArray(Character[]::new);
                    break;
                default:
                    System.out.println("Método de entrada desconhecido: " + inputMethod);
                    break;
            }
        }
        return array;
    }
}
