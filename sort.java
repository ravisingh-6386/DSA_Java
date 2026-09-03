
// import java.util.*;

// public class sort{
//     public static void main(String[] args){
//         // int[] arr={5, 2, 9, 1, 5, 6};
//         // Integer[] array={5, 2, 9, 1, 5, 6};
//         // Arrays.sort(arr);
//         // System.out.println(Arrays.toString(arr));

//         // Arrays.sort(array,Collections.reverseOrder());
//         // System.out.println(Arrays.toString(array));
//         List<Integer>list= Arrays.asList(5, 2, 9, 1, 5, 6);
//         list.sort((a,b)->a-b);
//         System.out.println(list);

//         list.sort((a,b)->b-a);
//         System.out.println(list);
//     }
// }
// heap sort.
import java.util.*;

public class sort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;       // root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2; // right child

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        // swap if needed
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // heapify subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        heapSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}