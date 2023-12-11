package Strategy;

import java.util.List;

public class selectionSort implements Strategy {
    public void sort(List<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa sắp xếp
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên của mảng chưa sắp xếp
            int temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
        }
    }
}
