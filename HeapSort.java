public class heapSort {

    public static void heapify(int arr[],int n,int i, boolean ascending){
        int selected=i;
        int left=2*i+1;
        int right=2*i+2;
        if(ascending){
            if(left<n && arr[left]>arr[selected]){
                selected=left;
            }
            if(right<n && arr[right]>arr[selected]){
                selected=right;
            }
        }else{
            if(left<n && arr[left]<arr[selected]){
                selected=left;
            }
            if(right<n && arr[right]<arr[selected]){
                selected=right;
            }
        }
        if(selected!=i){
            int temp=arr[i];
            arr[i]=arr[selected];
            arr[selected]=temp;
             
            heapify(arr, n, selected, ascending);
        }
    }
   public static void heapsort(int arr[], boolean ascending){
    int n=arr.length;
    for(int i=n/2;i>=0;i--){
        heapify(arr,n,i, ascending);
    }
    for(int i=n-1;i>0;i--){
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        heapify(arr,i,0, ascending);

    }
   }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 3 };
        int arr2[] = { 1, 2, 4, 5, 3 };

       heapsort(arr1, true);
       for(int i=0;i<arr1.length;i++){
        //System.out.print("Ascending order:");
        System.out.print(arr1[i]+" ");// ascending order output.
       }
       System.out.println();

       heapsort(arr2, false);
       for(int i=0;i<arr2.length;i++){
        //System.out.print("Descending order:");
        System.out.print(arr2[i]+" ");// descending order output.
       }
       System.out.println();
        }
    }


