package homework.homeworks.buildingclasses;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        T[] objects = (T[]) stream.sorted(order).toArray();

        if (objects.length == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(objects[0], objects[objects.length - 1]);
        }
    }
}
