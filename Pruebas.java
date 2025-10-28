
package pruebas;

public class Pruebas {

    public static void dualPivotQuickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        // Asegurar que arr[left] <= arr[right]
        if (arr[left] > arr[right]) {
            swap(arr, left, right);
        }

        int pivot1 = arr[left];
        int pivot2 = arr[right];

        int i = left + 1;
        int lt = left + 1;   // siguiente posición para elementos < pivot1
        int gt = right - 1;  // siguiente posición para elementos > pivot2

        while (i <= gt) {
            if (arr[i] < pivot1) {
                swap(arr, i, lt);
                lt++;
            } else if (arr[i] > pivot2) {
                // Saltar elementos ya mayores que pivot2
                while (arr[gt] > pivot2 && i < gt) {
                    gt--;
                }
                swap(arr, i, gt);
                gt--;
                // Después del intercambio, revisar si el nuevo arr[i] es < pivot1
                if (arr[i] < pivot1) {
                    swap(arr, i, lt);
                    lt++;
                }
            }
            i++;
        }

        // Colocar pivotes en sus posiciones correctas
        lt--;
        gt++;
        swap(arr, left, lt);
        swap(arr, right, gt);

        // Ordenar las tres particiones
        dualPivotQuickSort(arr, left, lt - 1);      // < pivot1
        dualPivotQuickSort(arr, lt + 1, gt - 1);    // entre pivot1 y pivot2
        dualPivotQuickSort(arr, gt + 1, right);     // > pivot2
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62, 12, 77, 1, 9};
        System.out.println("Original: " + java.util.Arrays.toString(arr));
        dualPivotQuickSort(arr, 0, arr.length - 1);
        System.out.println("Ordenado: " + java.util.Arrays.toString(arr));
    }
}
