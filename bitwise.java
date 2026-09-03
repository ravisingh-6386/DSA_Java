// given a array in which  all elements are repeating even number of times except for 1 element (odd).
// public class bitwise{
//     public static void main(String[] args){
//     int arr[]={5,1,3,5,1,1,5,5,2,2};
//         int res=0;
//         for(int i=0;i<arr.length;i++){
//             res=res^arr[i];
//         }
//         System.out.println(res);

//     }
// }
/*count the set-bit in binary representation of a number */
/*public class bitwise{
    public static void main(String[] args){
        int n=5;
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("the number of set-bit is:"+count);
    }
}*/
/*give an array of size 8 and elements in the array is 1 to 8 and 1 element is repeates and 1 missing element find out using xor. */
/*public class bitwise{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,8};
        int n=arr.length;
        int xor1=0;
        for(int i=0;i<n;i++){
            xor1=xor1^arr[i];
        }
        for(int i=1;i<=n-1;i++){
            xor1=xor1^i;
        }
        System.out.println("the missing and repeating element is:"+xor1);
    }
}*/
/*Given an integer n, return the number of prime numbers that are strictly less than. */
/*public class bitwise{
    public static void main(String[] args){
        int n=10;
        int count=0;
        for(int i=2;i<n;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println("the number of prime numbers less than "+n+" is:"+count);
    }
}*/

/* add two binary number. */
// public class bitwise{
//     public static void main(String[] args){
//         String a="1011";
//         String b="1101";
//         StringBuilder sb=new StringBuilder();
//         int i=a.length()-1;
//         int j=b.length()-1;
//         int carry=0;
//         while(i>=0 || j>=0 || carry>0){// ans-11000.
//            // while(i>=0 || j>=0){// return only the four bit values only. ans=1000.
//             int sum=carry;
//             if(i>=0){
//                 sum+=a.charAt(i)-'0';
//                 i--;
//             }
//             if(j>=0){
//                 sum+=b.charAt(j)-'0';
//                 j--;
//             }
//             sb.append(sum%2);
//             carry=sum/2;
//         }
//         System.out.println("the sum of two binary numbers is:"+sb.reverse().toString());
//         //System.out.println(sb);
//     }
// }


// /*for example n=11 convert this in binary number and count how many 1's are there */
// /*public class bitwise{
//     public static void main(String[] args){
//         int n=11;
//         int count=0;
//         while(n>0){
//             if((n&1)==1){
//                 count++;
//             }
//             n=n>>1;
//         }
//         System.out.println("the number of 1's in binary representation of "+n+" is:"+count);
//     }
// }*/
/*Given a positive integer n, count all possible distinct binary strings of length n such that there are no consecutive 1’s. */
public class bitwise{
    public static void main(String[] args){
        int n=3;
        int a=1;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(n+" is:"+c);
    }
}