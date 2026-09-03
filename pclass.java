// 1
// Write a Java program to print 'Hello' on screen and then print your name on a separate line.
/*public class pclass{
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("Ravi Singh");
    }
}*/
// 2
// Write a Java program to print the sum(addition),multiply, subtract, divide and remainder of two numbers.
/*public class pclass{
    public static void main(String[] args) {
        int n=100;
        int m=200;
        System.out.println("Addition:"+(n+m));
        System.out.println("multiply:"+(n*m));
        System.out.println("subtract:"+(n-m));
        System.out.println("Divide:"+(n/m));
        System.out.println("Remainder:"+(n%m));

    }
}*/
// 3
// Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd./import java.util.*;
/*import java.util.*;
public class pclass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}*/
// 4
// Write a Java program that accepts three integers from the user and return true if these seccond number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number.
// import java.util.*;
// public class pclass{
//     public static boolean check(int a,int b,int c,boolean abc){
//         if(abc)
//             return c>b;
//         return (b>a && c>b);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of a:");
//         int a=sc.nextInt();
//         System.out.print("Enter the value of b:");
//         int b=sc.nextInt();
//         System.out.print("Enter the value of c:");
//         int c=sc.nextInt();
//         System.out.print("Enter the value of boolean true/false:");
//         boolean abc=sc.nextBoolean();
//         System.out.println(check(a,b,c,abc));
//     }
// }
// 5
// Write a Java program to find the maximum occurring character in a string.
// import java.util.*;
// public class pclass{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of str:");
//         String str=sc.nextLine();
//         int[] freq=new int[256];
//         for(char c:str.toCharArray())
//             freq[c]++;
//         int max=-1;
//         char result=' ';
//         for(int i=0;i<256;i++){
//             if(freq[i]>max){
//                 max=freq[i];
//                 result=(char) i;
//             }
//         }
//         System.out.println("Maximum occuring character:"+result);


//     }
// }

// 6)Write a Java program to find first non repeating character in a string.
// import java.util.*;
// public class pclass {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENter the value of str:");
//         String str=sc.nextLine();
//         int[] freq=new int[256];
//         for(char c:str.toCharArray())
//             freq[c]++;
//         for(char c:str.toCharArray()){
//             if(freq[c]==1){
//                 System.out.println("first non repeating character:"+c);
//                 return ;
//             }
//         }
//         System.out.println("no non repeating character found.");

//     }}

// 7
// Write a program in java to demonstrate method overloading.
// class pclass{
//     void show(int a){
//         System.out.println("Integer value:"+a);
//     }
//     void show(double a){
//         System.out.println("double:"+a);
//     }
//     void show(String a){
//         System.out.println("string:"+a);
//     }
//     public static void main(String[] args) {
//         pclass obj=new pclass();
//         obj.show(10);
//        // obj.show("Hello");
//         obj.show(12.5);
//         obj.show("Hello");
//     }
//}
// // 8)Write a program in java to demonstrate multilevel inheritance in java.
// class Animal{
//     void eat(){
//         System.out.println("Eating...");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Barking..");
//     }
// } 
// class Puppy extends Dog{
//     void weep(){
//         System.out.println("Weeping..");
//     }
//     public static void main(String[] args){
//         Puppy p=new Puppy();
//         p.eat();
//         p.bark();
//         p.weep();
//     }
// } 


// 9
// Write a java program to create an abstract class named Shape that contains two integers and an empty method named print Area (). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape .Each one of the classes contains only the method print Area () that prints the area of the given shape.
// abstract class Shape{
//     int a,b;
//     abstract void printArea();
// }
// class Rectangle extends Shape{
//     Rectangle(int x,int y){
//         a=x;
//         b=y;
//     }
//     void printArea(){
//         SYstem.out.println("Area of rectangle:"+(a*b));
//     }
// }
// class Triangle extends Shape{
//     Triangle(int x,int y){
//         a=x;
//         b=y;
//     }
//     void printArea(){
//         System.out.println("Triangle area:"+(0.5*a*b));
//     }
// }
// class Circle extends Shape{
//     Circle(int r){
//         a=r;
//     }
//     void printArea(){
//         System.out.println("Area of circle:"+(3.14*a*a));
//     }
//     public static void main(String[] args) {
//         Rectangle rect=new Rectangle(10,20);
//         rect.printArea();
//         Triangle tri=new Triangle(10,20);
//         tri.printArea();
//         Circle cir=new Circle(10);
//         cir.printArea();
// 10
// 10)Write a program that creates a user interface to per form integer division. The user enters two numbers in the textfields,Num1and Num2.The division of Num1 and Num2 is displayed in the Result field when the Divide button is   clicked. If Num1 and Num2 were not integers, the program would throw a Number Format Exception. If Num2 were zero, the program would throw an Arithmetic Exception Display the exception in a message dialog box.

// 11
// Write a java program that implements a multi-thread application that has three threads. First thread generates random integer every 1 second and if the value is even, second thread computes the square of the number and prints .If the value is odd, the third thread will print the value of cube of the number

// import java.util.*;
// public class pclass{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the string:");
//         String str=sc.nextLine();
//         int count=0;
//         str=str.toLowerCase();
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//             if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
//                 count++;
//             }
//         }
//         System.out.println("number of vowels:"+count);
        
//     }
// }
// public class pclass{
//     public static void main(String[] args) {
//         String str="Hello World";
//         String result="";
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//             if(c>='a' && c<='z'){
//                 c=(char)(c-32);
//             }
//             result+=c;
//         }
//         System.out.println("Converted string:"+result);
//     }
// }
// public class pclass{
//     public static void main(String[] args) {
//         String str="HELLO WORLD";
//         String result="";
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//             if(c>='A' && c<='Z'){
//                 c=(char)(c+32);
//             }
//             result+=c;
//         }
//         System.out.println("Converted string:"+result);
//     }
// }
// public class pclass{
//     public static void main(String[] args){
//         Integer a1=90;
//         Integer a2=90;
//         Integer a3=172;
//         Integer a4=172;
//         System.out.println(a1==a2);
//         System.out.println(a3==a4);
//     }
// }
// 36=valid sudoku.
//  public class pclass {
//   public static void main(String[] args) {
// //    String s=null;
// //    System.out.println(s.length());

// // "What is the output?
// //  int a = 5 * 4 / 2 + 10;
// //  System.out.println(a);"
//     int a = 5 * 4 / 2 + 10;
//     System.out.println(a);  
 
//   }
//  }
public class pclass{
    public static void main(String[] args) {
        System.out.println("Hello Ravi");
    }
}


