package sortes;

public class BubbleSort extends Sort{

    void sort (int a []) {
        System.out.println("Bubble - сортировка пузырьком");
        int i, j, tmp;
        // изменение во время прохода
        boolean flip = false;
        for (i = 0; i < a.length -1; i++) {
            for (j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                    flip = true;
                }
            }
            // если не было изменений во время прохода - выходим из цикла
            if (!flip) break;
        }
    }
}
