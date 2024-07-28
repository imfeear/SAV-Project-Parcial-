package Sorts;

public abstract class Comparator {
    public static int compare(Object o1, Object o2) {
        if (o1 instanceof Integer && o2 instanceof Integer) {
            return Integer.compare((Integer) o1, (Integer) o2);
        } else if (o1 instanceof Character && o2 instanceof Character) {
            return Character.compare((Character) o1, (Character) o2);
        }
        throw new IllegalArgumentException("Tipo de dado não suportado");
    }
}
