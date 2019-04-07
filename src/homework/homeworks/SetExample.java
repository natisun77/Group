package homework.homeworks;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> combinedSetFirst = new HashSet<>();
        combinedSetFirst.addAll(set1);
        combinedSetFirst.addAll(set2);
        Set<T> combinedSetSecond = new HashSet<>(combinedSetFirst);
        combinedSetFirst.removeAll(set1);
        combinedSetSecond.removeAll(set2);
        combinedSetFirst.addAll(combinedSetSecond);
        return combinedSetFirst;
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
