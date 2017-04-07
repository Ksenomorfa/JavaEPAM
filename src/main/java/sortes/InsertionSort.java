package sortes;

import java.util.Random;

public class InsertionSort extends Sort{

    void sort(int [] a) {

        System.out.println("Insertion - сортировка вставками");

        int value;
        int i,j;

        for(i=1; i<a.length;i++) {
            //запоминаем значение текущего элемента
            value = a[i];
            // заменяем значение справа значением слева, если значение слева
            // больше минимального
            for(j=i-1; j>=0 && a[j]>value; j--) {
                a[j+1] = a[j];
            }
            //заменяем самое левое значение минимальным
            a[j+1] = value;
        }
    }
}




