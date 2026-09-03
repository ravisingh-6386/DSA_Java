 //1
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//2
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=i;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//3
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//4
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=5;i<=n;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=5;i<=n;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//7
// import java.util.*;
// public class patternptsc{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
       
//     }
// }
//9
// import java.util.*;
// public class patternptsc{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
// //upper part
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
// //lower part
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
       
//     }
// }
//10
// import java.util.*;
// public class patternptsc{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         //number of rows.
//         for(int i=1;i<=n;i++){
//             // number print.
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             //space print.
//             for(int j=1;j<=8-2*i;j++){
//                 System.out.print(" ");
//             }
//             //reverse the number.
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//11
// import java.util.*;
// public class patternptsc{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         int num=1;
//         //number of rows.
//        for(int i=1;i<=n;i++){
//         //inner loop.
//         for(int j=1;j<=i;j++){
//             System.out.print(num+" ");
//             num++;
//         }
//         System.out.println();
//        }
//         }
//     }

//12
// import java.util.*;
// public class patternptsc{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         String A="A";
//        for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(A+" ");
//             A=(char)(A.charAt(0)+1)+"";
//         }
//         System.out.println();
//        }
//         }
//     }

//17
// import java.util.*;
// public class patternptsc{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             char s='A';
//             for(int j=1;j<=i;j++){
//                 System.out.print(s);
//                 s++; 
//             }
//             s-=2;
//             for(int j=1;j<=i-1;j++){
//                 System.out.print(s);
//                 s--;
//             }
//             System.out.println();
//         }   
//     }
// }
//18.
// public class patternptsc{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             char c=(char) ('E'-i+1);
//             for(int j=1;j<=i;j++){
//                 System.out.print(c+" ");
//                 c++; 
//             }
//             System.out.println();
//         }
       
//     }
// }

//21
// import java.util.*;
// public class patternptsc{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
       
//     }
// }
//22
// import java.util.*;
// public class patternptsc{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of n:");
//         int n=sc.nextInt();
//         for(int i=1;i<=2*n-1;i++){
//             for(int j=1;j<=2*n-1;j++){
//             int top=i;
//             int left=j;
//             int bottom=(2*n-2)-i;
//             int right=(2*n-2)-j;
//             int minDist=Math.min(Math.min(top,bottom),Math.min(left,right));
//             System.out.print((n-minDist)+" ");

//             }
//             System.out.println();
//         }
//     }
// }





