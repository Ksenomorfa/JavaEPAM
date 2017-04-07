package sortes;

public class SelectionSort extends Sort{

    void sort(int a[]) {
        System.out.println("Selection - сортировка выбором");
        for(int i=0; i<a.length;i++)
        {
            //установка начального значения минимального индекса
            int min_i=i;
            // ищем индекс минимального значения в области больше i
            for(int j=i+1; j<a.length;j++)
            {
                if (a[j] <a[min_i])
                {
                    min_i=j;
                }
            }
            //меняем значения местами между минимальным и первым неотсортированным
            int tmp = a[i];
            a[i] = a[min_i];
            a[min_i] = tmp;
        }
    }
}
