package sortes;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        int massiveRandom[] = new int[10];
        int  i = 15;
       /* Sort selectionSort = new SelectionSort();
        selectionSort.testSort(massiveRandom, i);

        Sort bubbleSort = new BubbleSort();
        bubbleSort.testSort(massiveRandom,i+2);

        Sort quickSort = new QuickSort();
        quickSort.testSort(massiveRandom,i+5);
        */
        Sort insertionSort = new InsertionSort();
        insertionSort.testSort(massiveRandom,i+5);

    }

    void testSort (int [] a, int i) {
        Random random = new Random(i);
        i = random.nextInt(10);
        randomize(a,i);
        printMassive(a);
        sort(a);
        printMassive(a);
    }

    void printMassive(int [] a) {
        System.out.println("Massive:");
        for (int i=0; i<10; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }

    void sort (int []a) {
        sort(a);
    }

    void randomize(int []a, int x) {
        Random random = new Random(x);
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(97);
        }
    }
}
