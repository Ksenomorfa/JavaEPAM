package sortes;

public class ShellSort extends Sort {
    void sort(int[] a) {
        System.out.println("Shell - сортировка Шелла");
        int n = a.length;

        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ...
        int h = 1;
        while (h < n/3) h = 3*h + 1;
        System.out.println(h);
        while (h >= 1) {
            // h-sort the array
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && (a[j]<a[j-h]); j -= h) {
                    int temp = a[j];
                    a[j] = a[j-h];
                    a[j-h] = temp;
                }
            }
            h /= 3;
        }
    }
}
