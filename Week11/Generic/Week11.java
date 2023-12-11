import java.util.ArrayList;
import java.util.List;

class Week11 {
    /**
     * Sort.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        List<T> sortedList = new ArrayList<T>();
        while (!list.isEmpty()) {
            T rand = list.get(0);
            for (T item : list) {
                if (rand.compareTo(item) > 0) {
                    rand = item;
                }
            }
            list.remove(rand);
            sortedList.add(rand);
        }
        return sortedList;
    }
}