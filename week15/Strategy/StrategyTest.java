package Strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 3, 6, 8, 0, 1, 89, 54, 7, 4,2,0));
        Context context = new Context(new bubbleSort());
        // Context context = new Context(new selectionSort());
        context.sortStrategy(list);
        System.out.println(list);
    }
}
