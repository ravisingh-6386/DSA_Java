//  import java.util.*;
// public class dp {
//     public static int fib(int n,int dp[]){
//         if(n==0 || n==1){
//             return n;
//         }
//         if(dp[n]!=0){
//             return dp[n];
//         }
//         dp[n]=fib(n-1,dp)+fib(n-2,dp);
//         return dp[n];
//     }
//     public static int fibTab(int n){
//         int dp[]=new int[n+1];
//         dp[0]=0;
//         dp[1]=1;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the n:");
//         int n=sc.nextInt();
//         int dp[]=new int[n+1];
//        // System.out.println("Hello Dp");
//        System.out.println(fib(n,dp));
//        System.out.println(fibTab(n));
//     }

// }

import java.util.*;
public class dp {
    public static int countWays(int n, int dp[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = countWays(n - 1, dp) + countWays(n - 2, dp);
        return dp[n];
    }

    public static int countwaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        countWays(n, dp);
        countwaysTab(n);
        System.out.println(countWays(n, dp));
        System.out.println(countwaysTab(n));
    }
}

/*0-1 Knapsack
val [ ] = 15, 14, 10, 45, 30

wt [ ] = 2, 5, 1, 3, 4
W (total allowed weight) = 7

ans = max Profit */
import java.util.*;
public class dp {
    // tabulation method
    public static int knapsackTab(int val[],int wt[],int W,int n){
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;  
                }else if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);// pf1 and pf2 max value.

                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int knapsack(int val[],int wt[],int W,int n,int dp[][]){
        if(n==0 || W==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            dp[n][W]=Math.max(val[n-1]+knapsack(val,wt,W-wt[n-1],n-1,dp),knapsack(val,wt,W,n-1,dp));
            return dp[n][W];
        }else{
            dp[n][W]=knapsack(val,wt,W,n-1,dp);
            return dp[n][W];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of items:");
        int n=sc.nextInt();
        int val[]=new int[n];
        int wt[]=new int[n];
        System.out.println("Enter the values of items:");
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        System.out.println("Enter the weights of items:");
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        System.out.print("Enter the total allowed weight:");
        int W=sc.nextInt();
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
       System.out.println(knapsack(val,wt,W,n,dp));
       print(dp);
       System.out.println(knapsackTab(val,wt,W,n));
    }
}

public class dp{
public static int knapsack(int val[], int wt[], int W, int n) {
if(W == 0 || n == 0) {
return 0;

if(wt[n-1] <= W) {//valid
//include
int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1);
//exclude
int ans2 = knapsack(val, wt, w, n-1);
return Math.max(ans1, ans2);
} else {//not valid
return knapsack(val, wt, W, n-1); I

public static void main(String args[]) {
int val[] = {15, 14, 10, 45, 30};
int wt[] = {2, 5, 1, 3, 4a};
int W=7;
System.out.println(knapsack);*/

/*target Sum subset */
public static boolean targetSumSubset(int arr[], int sum) {
    int n = arr.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];
    for (int i = 0; i <= n; i++) {
        dp[i][0] = true;
    }
    for (int j = 1; j <= sum; j++) {
        dp[0][j] = false;
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= sum; j++) {
            if (arr[i - 1] <= j) {
                dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }
    return dp[n][sum];
}

public static boolean tSSubset(int nums[],int sum){
    boolean dp[][]=new boolean[nums.length+1][sum+1];
    int n=nums.length;
    for(int i=0;i<=n;i++){
        dp[i][0]=true;
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=sum;j++){
            int v=nums[i-1];
          if(v<=j && dp[i-1][j-v]==true){
                dp[i][j]=true;
        }else if(dp[i-1][j]==true){
                dp[i][j]=true;  
        }
    }
}
print(dp);
    return dp[n][sum];
}
public static void print(boolean dp[][]){
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
}


public static void main(String[] args) {
    int nums[]={4,2,7,1,3};
    int target=10;
    int sum=10;
    System.out.println(tSSubset(nums,sum));
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number of elements:");
    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // System.out.println("Enter the elements:");
    // for (int i = 0; i < n; i++) {
    //     arr[i] = sc.nextInt();
    // }
    // System.out.print("Enter the target sum:");
    // int sum = sc.nextInt();

    // System.out.println(targetSumSubset(arr, sum));
}

/*unbounded knapsack */
// using tabulation method

public class  dp{
    public static int unboundedKnapsack(int val[],int wt[],int W){
        // int dp[]=new int[W+1];
        // for(int i=0;i<=W;i++){
        //     for(int j=0;j<n;j++){
        //         if(wt[j]<=i){
        //             dp[i]=Math.max(dp[i],val[j]+dp[i-wt[j]]);
        //         }
        //     }
        // }
        // return dp[W];

        // or

        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){//valid
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }else{// invalid.
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    // print the table;
    public static void print(boolean dp[][]){
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
}
    public static void main(String[] args){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(unboundedKnapsack(val,wt,W)); 
        
    }
}*/

/*Coin Change
coins [ ] € 1, 2, 3
sum =4

4

(1, 1, 1, 1), (1, 1, 2), (2, 2), (1, 3)

coins [ ] =2, 5, 3, 6
sum = 10

(2,2,2,2,2), (2,2,3,3), {2,2,6), (2,3,5) and (5,5)
ang= 5 */
import java.util.*;
public class dp{
    // public static int coinChange(int coins[],int sum){
    //     int n=coins.length;
    //     int dp[]=new int[sum+1];
    //     dp[0]=1;
    //     for(int i=0;i<coins.length;i++){
    //         for(int j=coins[i];j<=sum;j++){
    //             dp[j]+=dp[j-coins[i]];
    //         }
    //     }
    //     return dp[sum];
    // }
    public static int coinChange(int coins[],int sum){
        int n=coins.length;
        int dp[][]=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int j=1;j<sum+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1]<=j){//valid.
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of coins:");
        int n=sc.nextInt();
        int coins[]=new int[n];
        System.out.println("Enter the coins:");
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum:");
        int sum=sc.nextInt();
        System.out.println(coinChange(coins,sum));
    }
}

/*Problem->Rod Cutting.
Given a rod of length n inches and an array of prices that includes prices of all pieces of size smaller than n.
Determine the maximum value obtainable by cutting up the rod and selling the pieces
length
price
rodLength = 8
=12345678
= 1 5 8 9 10 17 17 20 */
import java.util.*;
public class dp{
    public static int rodCutting(int price[],int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int maxVal=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                maxVal=Math.max(maxVal,price[j]+dp[i-j-1]);
            }
            dp[i]=maxVal;
        }
        return dp[n];
    }

    public static int rodCutting(int length[],int price[],int totalRodLength){
        int n=price.length;
      int dp[][]=new int[n+1][totalRodLength+1];
            for(int i=0;i<=n;i++){
                for(int j=0;j<=totalRodLength;j++){
            if(i==0 || j==0){
                dp[i][j]=0;
            }else if(length[i-1]<=j){
                dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
            }else{
                dp[i][j]=dp[i-1][j];
            }
        }
      }
        return dp[n][totalRodLength];
    }
    public static void main(String[] args){
        try (Scanner sc=new Scanner(System.in)) {
        System.out.print("Enter the length of rod:");
        int n=sc.nextInt();
        int price[]=new int[n];
        System.out.println("Enter the prices of pieces:");
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        System.out.print("Enter the total length of the rod:");
        int totalRodLength=sc.nextInt();    
        int length[]=new int[n];
        for(int i=0;i<n;i++){
            length[i]=i+1;
        }
        System.out.println(rodCutting(length,price,totalRodLength));
        }
 
    }
}

/*Problem-(Longest Common Subsequence).
A subsequence of a string is a new string generated from the original string with some characters (can be none)
deleted without changing the relative order of the remaining characters.

str1 = "abcde", str2 = "ace"
ans = 3 ll"ace"

str1 = "abcdge", str2 = "abedg"
ans = 4 ll"abdg" */
import java.util.*;
public class dp{
    // recursive method.
    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return 1+lcs(str1,str2,n-1,m-1);
        }else{
            int ans1=lcs(str1,str2,n-1,m);
            int ans2=lcs(str1,str2,n,m-1);
            return Math.max(ans1,ans2);
        }
    }
// memoization method.
    public static int lcs2(String str1,String str2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];// check.
        }

        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return dp[n][m]=1+lcs2(str1,str2,n-1,m-1,dp);
        }else{
            int ans1=lcs2(str1,str2,n-1,m,dp);
            int ans2=lcs2(str1,str2,n,m-1,dp);
            return dp[n][m]=Math.max(ans1,ans2);
        }
    }
    // tabulation method.
    public static int lcsTab(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){//same character.
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String str1=sc.nextLine();
        System.out.print("Enter the second string:");
        String str2=sc.nextLine();

        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(lcs(str1,str2,n,m));
        System.out.println(lcs2(str1,str2,n,m,dp));
         System.out.println(lcsTab(str1,str2));
    }
}

/* Problem= S1 = "ABCDE", S2 = "ABGCE"
            ans = 2 // "AB"

Longest Common Substring
a substring is a contiguous sequence of characters within a string

S1 = "ABCDGH", S2 = "ACDGHR"
ans = 4 // "CDGH" */
import java.util.*;
public class dp{
     public static int lcsTab(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        int ans=0;
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
            for(int j=0;j<m+1;j++){
                dp[0][j]=0;
            }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){//same character.
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j]=0;//different character.
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s1=sc.nextLine();
        System.out.print("Enter the second string:");
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(lcsTab(s1, s2));
    }
}

/*Problem: Longest Increasing Subsequence.
arr[] = {50, 3, 10, 7, 40, 80}
Length of LIS = 4 */
import java.util.*;

public class dp{
    public static int lcs(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
            for(int j=0;j<m+1;j++){
                dp[0][j]=0;
            }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static int lis(int arr1[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int arr2[]=new int[set.size()];
        int i=0;
        for(int num:set){
            arr2[i]=num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr1,arr2);
    }
    public static void main(String[] args){
        int arr[]={50, 3, 10, 7, 40, 80};
        System.out.println(lis(arr));
    }
}

/*Leet code 72(Edit Distance).
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to
word2.
You have the following three operations permitted on a word:
. Insert a character
· Delete a character
. Replace a character
word1 = "intention", word2 = "execution"
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')

ans = 5 */
public class dp{
    public static int minDistance(String word1,String word2){
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    // dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    int add=dp[i][j-1]+1;
                    int delete=dp[i-1][j]+1;
                    int replace=dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(add,Math.min(delete,replace));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args){
        String word1="intention";
        String word2="execution";
        System.out.println(minDistance(word1,word2));
    }
}


/*Given an integer array nums, return true if you can partition the 
array into two subsets such that the sum of the elements in both subsets
is equal or false otherwise.
Example 1:
Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
 

Constraints:
1 <= nums.length <= 200
1 <= nums[i] <= 100 */
public class dp{
    // tabultation method.
    
    public static boolean canPartition(int nums[]) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        boolean dp[][]=new boolean[nums.length+1][target+1];
        for(int i=0;i<=nums.length;i++){
            dp[i][0]=true;
        }
        for(int j=1;j<=target;j++){
            dp[0][j]=false;
        }
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=target;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[nums.length][target];
    }
    public static void main(String[] args){
        int nums[]={1,5,11,5};
        System.out.println(canPartition(nums));
    }
}
/*Problem: String Conversion
Convert String1 to String2 with only insertion & deletion.
Print number of deletions & insertions.
str1 = "pear" str2 ="sea" */
public class dp{
    public static void stringConversion(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[ i-1][j],dp[i][j-1]);
                }
            }
        }
        int lcs=dp[n][m];
        int deletions=n-lcs;
        int insertions=m-lcs;
        System.out.println("Deletions: "+deletions);
        System.out.println("Insertions: "+insertions);
    }
    public static void main(String[] args){
        String str1="pear";
        String str2="sea";
        stringConversion(str1,str2);
    }
}

/*Problem: Wildcard Matching(leetcode 44).
Given a text and a wildcard pattern, implement wildcard pattern matching algorithm that finds if wildcard
pattern is matched with text. The matching should cover the entire text (not partial text). The wildcard
pattern can include the characters '?' and '*'
. '?' - matches any single character
. '*' - Matches any sequence of characters (including the empty sequence)

Text = "baaabab"
Pattern = " ***** ba ***** ab"
output : true

Text = "baaabab"
Pattern = "a*ab"
output : false
 */
public class dp{
    public static boolean isMatch(String s,String p){
        int n=s.length();
        int m=p.length();
        boolean dp[][]=new boolean[n+1][m+1];

        //initialization of dp table.
        dp[0][0]=true;

        for(int i=1;i<n+1;i++){// pattern " ".
            dp[i][0]=false;
        }
        // pattern "*****"
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }
        // bottom up approach.
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                // ith char is equal to jth char and jth char==?.
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                }else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args){
        String s="baaabab";
        String p="*****ba*****ab";
        System.out.println(isMatch(s,p));
    }
}

/*Catalan's Number

CO =1
C1=1
C2= CO.C1+ C1.CO = 2
C3=CO.C2+C1.C1+C2.CO = 5
C4 = */
import java.util.*;
public class dp{
    // recursive method.
    public static int catalan(int n){
        // base case.
        int ans=0;
        if(n==0 || n==1){
            return 1;
        }
        for(int i=0;i<=n-1;i++){
            ans+=catalan(i)*catalan(n-i-1);
        }
        return ans;
    }
    // memoization method.
    public static int catalan2(int n,int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];

        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
           ans+=catalan2(i,dp)*catalan2(n-i-1,dp);
        }
        return dp[n]=ans;
    }
    // tabulation method.
    public static int catalanTab(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n:");
        int n=sc.nextInt();
        System.out.println(catalan(n));
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
       System.out.println(catalan2(n,dp));
        System.out.println(catalanTab(n));
    }
}

/*BST
Problem-Counting Trees
Find number of all ossible BSTs/ith given n nodes.

n = 3 (10, 20, 30)
ans = 5 */
import java.util.*;
public class dp{
    public static int countTrees(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                int left=dp[j];
                int right=dp[i-j-1];
                dp[i]+=left*right;
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n:");
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countTrees(n));
    }
}

/*Problem: Mountains & Valleys

Mountain Ranges
at any moment the number of down strokes cannot be more than number of up strokes.

up stroke

down stroke
 */
import java.util.*;
public class dp{
    public static int countMountainValley(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n:");
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countMountainValley(n));
    }
}

/*Matrix chain multiplication MCM. */
 

