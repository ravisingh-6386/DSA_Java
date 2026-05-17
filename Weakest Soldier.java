/*Weakest Soldier
Question-3) We are given an mxn binary matrix of 1's (soldiers) and 0's (civilians). The soldiers are
positioned in front of the civilians. That is, all the 1's will appear to the left of all the O's
in each row.

A row i is weaker than a row j if one of the following is true:
. The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Find the K weakest rows.

m=4, n=4, k=2
1000
1111
1000
1000
ans = row0 & row2
 */
import java.util.*;
public class heaps{
    public static void main(String[] args) {
        int matrix[][]={{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};
                        int k=2;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        for(int i=0;i<matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            pq.add(new int[]{count,i});
        }
        for(int i=0;i<k;i++){
            int[] row=pq.remove();
            System.out.println("Row " + row[1] + " has " + row[0] + " soldiers.");
        }
    }
}
