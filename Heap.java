import java.util.*;
public class heaps {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student (String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override///using mehtod of comparable interface to compare the rank of students.
        public int compareTo(Student s2) {
            return Integer.compare(this.rank, s2.rank);
            /// we can use this also return this.rank-s2.rank; but it may-or-not cause overflow if the rank is very large.
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Adeed", 85));
        pq.add(new Student("shravan", 90));
        pq.add(new Student("kavya", 78));
        pq.add(new Student("Ravi", 95));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name );
            pq.poll();
        }
    }
    }

// insert in the heap.
import java.util.*;

public class heaps {
    static class Heaps {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;// x is child index.
            int par = (x - 1) / 2;
            while (arr.get(x) > arr.get(par)) {// t.c=O(log n).
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }
/// min get in the heap.
        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);
            //Step 1: swap the first and last element.
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));

            // Step 2: remove the last element.
            arr.remove(arr.size() - 1);
            
             
            int i = 0;
            while (i < arr.size()) {
                int left = 2 * i + 1;
                int right = 2 * i + 2;
                int max = i;
                if (left < arr.size() && arr.get(max) < arr.get(left)) {
                    max = left;
                }

                if (right < arr.size() && arr.get(max) < arr.get(right)) {
                    max = right;
                }

                if (max == i) {
                    break;
                }

                int temp1 = arr.get(i);
                arr.set(i, arr.get(max));
                arr.set(max, temp1);
                i = max;
            }
            return data;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 10 };
        for (int i = 0; i < arr.length; i++) {
            insert(arr, i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insert(int arr[], int i) {
        int parent = (i - 1) / 2;
        if (arr[parent] < arr[i]) {
            int temp = arr[parent];
            arr[parent] = arr[i];
            arr[i] = temp;
            insert(arr, parent);
        }
    }
}
