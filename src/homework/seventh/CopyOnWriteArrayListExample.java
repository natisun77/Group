package homework.seventh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    List<String> list;

    public CopyOnWriteArrayListExample() {
        List<String> lst = Arrays.asList("Red", "Green", "Yellow", "White", "Grey");

        list = new CopyOnWriteArrayList<String>(lst);

        printCollection(true);

        System.out.println();

        printCollection(false);

    }

    private void printCollection(boolean change) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.printf(" " + element + ",");
            if (change) {
                if (element.equals("White")) {
                    list.add("Black");
                    list.remove(element);
                }
            }
        }
    }

    public static void main(String args[]) {
        new CopyOnWriteArrayListExample();
    }
}
