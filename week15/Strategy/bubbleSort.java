package Strategy;

import java.util.List;

public class bubbleSort implements Strategy {
    public void sort(List<Integer> arr) {
        int n = arr.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Hoán đổi phần tử nếu nó lớn hơn phần tử kế bên
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);

                    swapped = true;
                }
            }

            // Nếu không có sự hoán đổi trong một lần lặp, mảng đã được sắp xếp
            if (!swapped) {
                break;
            }
        }
    }
}
