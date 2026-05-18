/*Question-4)Sliding Window Maximum
Maximum of all Subarrays of Size K

1, 2, 3, 4, 5, 6, 7, 8, 9, 10

K=3

ans = 3, 4, 5, 6, 7, 8, 9, 10 */
import java.util.*;
public class heaps{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int k=3;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        System.out.print(pq.peek()+" ");
        for(int i=k;i<arr.length;i++){
            pq.remove(arr[i-k]);
            pq.add(arr[i]);
            System.out.print(pq.peek()+" ");
        }
    }
}
//// answer-3,4,5,6,7,8,9,10.
