import java.util.*;
public class arrayset {
    public static void main(String[] args) {
        int arr[][]={{1,3,3},{4,5,5},{7,8,8}};

        Set<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               set.add(arr[i][j]);
            }
        }
        for(int value:set){
            System.out.print(value+" ");
        }
    }
}
    

