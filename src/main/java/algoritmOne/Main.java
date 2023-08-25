package algoritmOne;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(6, 4, 6, 8, 1, 100, -100);
        List<Integer> arrayTwo = Arrays.asList(3, 8, 76544, -42, 100, 1);
        List<Integer> list = new ArrayList<>(sortNum(arrayTwo, array));
        System.out.println(list);
    }

    private static TreeSet<Integer> sortNum(Collection<Integer> numbers, Collection<Integer> numbersTwo) {
        TreeSet<Integer> integers = new TreeSet<>(numbersTwo);
        integers.retainAll(numbers);
        return integers;
    }
}
