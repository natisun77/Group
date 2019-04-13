package homework.homeworks;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set1copy = new HashSet<>(set1);
        Set<T> set2copy = new HashSet<>(set2);
        set1copy.removeAll(set2);
        set2copy.removeAll(set1);
        set1copy.addAll(set2copy);
        return set1copy;
    }

    public static void main(String[] args) {
        Set<Integer> myFirstSet = new HashSet();
        myFirstSet.add(1);
        myFirstSet.add(2);
        myFirstSet.add(3);

        Set<Integer> mySecondSet = new HashSet();
        mySecondSet.add(2);
        mySecondSet.add(3);
        mySecondSet.add(4);

        System.out.println(symmetricDifference(myFirstSet, mySecondSet));
    }
}
