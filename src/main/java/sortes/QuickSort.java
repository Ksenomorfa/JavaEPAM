package sortes;

public class QuickSort extends Sort {
    void sort(int [] a) {
        System.out.println("Quick - быстрая сортировка");
        int startIndex = 0;
        int endIndex = a.length - 1;
        doSort(startIndex, endIndex,a);
    }

    private void doSort(int start, int end, int []a) {
        // 2 индекса присваиваем мин. и макс.индексу разд. массива
        int i = start;
        int j = end;
        //опорный элемент вычисляем
        int cur = a[i - (i-j)/2];
        while(i<=j) {
            // увеличиваем индекс слева, пока i-тый элемент не станет больше
            // либо равен опорному
            while (a[i] < cur) i++;
            // уменьшаем индекс справа, пока j-тый элемент не станет меньше
            // либо равен опорному
            while (a[j] > cur) j--;
            // меняем местами пару, если i=j, значит найдены середина массива, не меняем,
            //просто увеличиваем и уменьшаем
            if (i <= j) {
                if(i<j) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                i++;
                j--;
            }
        }
        //рекурсирвно упорядочиваем элементы слева и справа от опорного с достигнутых
        //значений i и j
        if(i<end) doSort(i,end,a);
        if(start<j) doSort(start,j,a);
    }
}

