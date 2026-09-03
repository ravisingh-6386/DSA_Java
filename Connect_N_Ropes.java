/* Connect N Ropes//using heaps .
Question-2)Given are N ropes of different lengths, the task is to connect these ropes into one rope with
minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.

ropes = (4, 3, 2, 6}
ans = 29

connect 2 & 3 [5]
connect 5 & 4 [9]
connect 9 & 6 [15]
 */
import java.util.*;
public class heaps {
    public static void main(String[] args) {
        int ropes[]={4,3,2,6};
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
             cost=cost+first+second;
           
            pq.add(first+second);
        }
        System.out.println("Minimum cost to connect ropes: " + cost);
    }
}
