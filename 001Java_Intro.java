import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printjava(){
        System.out.println("hello java");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {

//        System.out.println("Hello Java !"); // If you use println the after print the word it give the line break
//        System.out.println(""); // Line Break
//        System.out.print("Hello code"); // it doesn't give linebreak after print the output
//        System.out.println("");
//        System.out.println("HI"); // write sout and then click on tab button to auto complete

        // Variables
//        String name="Vishal";
//        int age=20;
//        System.out.println(name);
//        String friend="Saksham";
//
//        String newfd=friend;

        // Primitive data Types
        // byte - 1 [-128 to 127]
        // short - 2
        // int - 4
        // long - 8
        // float - 4
        // double - 8
        // char - 2 (a,b,c,d)
        // boolean - 1 (true/false)

//        byte a = 30;
//        int phone = 134757928;
//        long phone2 = 13573929700000003L;
//        float pi = 3.14F;
//        char letter = '@';
//        boolean isAdult = false;

        // Non-Primitive data types
//        String name = "vishal";
//        String  name = new String("vishal"); // new keyword is not compulsury
//        System.out.println(name);
//        System.out.println(name.length()); // to find the name length

// String operations
//        String name1="Vishal";
//        String name2="Rai";
//        String name3=name1+" Hi "+name2; // Concatenation
//        System.out.println(name3);

//        String name="vishal";
//
//        // CharAt
//        System.out.println(name.charAt(0)); // 0 Based indexing
//
//        // length
//        System.out.println(name.length());
//
//        // Replace
//        String output= name.replace('a','b');
//        System.out.println(output);
//
//        // Substring
//        String s="Vishal and Rai";
//        System.out.println(name.substring(0,3)); // in this your 1st idx is include but second idx is exclude

        // Arrays In Java

//        int age = 30;
//        int physics = 97;
//        int chemistry = 98;
//        int math = 95;

        // Array intitlization by default by 0 and boolean by default by false

//        int[] marks = new int[3];
//        boolean[]marks=new boolean[2];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;

//        System.out.println(marks[0]);

        // print length of array -> in array length use only arr.length
//        System.out.println(marks.length);

        // Sorting in array

//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

//        int[] mark={97,98,95};

        // 2d Arrays

//        int[][] finalMarks={{97,98,95},{95,95,98}};
//        System.out.println(finalMarks[0][0]);
//        System.out.println(finalMarks[1][1]);

//        Casting one type to another type (typecasting)

        // implicit typecasting
//        double price =100.00;
//        double finalprice=price+18;
//        System.out.println(finalprice);

        // explicit typecasting
//        int p=100;
//        int fp=p+(int)18.0;
//        System.out.println(fp);

        // Constants
//        int age=50;
//        age=51;
//        age=52;

        // by using final you can't change its value further it become constants
//       final float PI = 3.14F;
//        PI = 1.1F; // Not allowed

//        Operators
//        int a=5;
//        int b=3;
//        int sum=a+b;
//        System.out.println(sum);
//
//        int diff=a-b;
//        System.out.println(diff);
//
//        int mul=a*b;
//        System.out.println(mul);
//
//        int mod=a%b;
//        System.out.println(mod);

//        int num=1;
//        num=num+1;
//        num++;
//        System.out.println(num);

//        Maths
//        System.out.println(Math.max(5,6)); // Max
//        System.out.println(Math.min(5,6)); // Min

        // Random Function
//        System.out.println(Math.random()); // without typecast it will pirnt in long long
//        System.out.println((int)(Math.random()*100)); // Every time it print the random number


        // How to take input in java
//        --> to take input in jave we have to use a scanner class we use (system.in)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input you age");
//        int age=sc.nextInt();
//        float age =sc.nextFloat();

//        System.out.print("your age is -> ");
//        System.out.println(age);

        // Taking input as a string
//        System.out.println("Input your name : ");
//        String name =sc.next();// it input only single word input
//        System.out.println(name);


//        String namefull =sc.nextLine(); // it takes the complete line input
//        System.out.println(namefull);

        // Comparison Operators
        // a=3,b=3
        // a==b true
        // a!=b false
        // a<b or <=
        // a>b or >=

        // Conditional Statement

//        boolean isSunUp=true;
//        boolean isSunUp=!true;
//        if(isSunUp){
//            System.out.println("Yes! it is true");
//        }
//        else{
//            System.out.println("It! is false");
//        }

//        int age=40;
//        if(age>=18)
//            System.out.println("Can Vote");
//        else
//            System.out.println("Can't Vote");

        // Logical Operators
        // && (both condition are true)
        // || (first or second may be true)
        // ! (Negation)

        // Program to understand conditional statement
//        Scanner sc=new Scanner(System.in);
//        pen=10,copy=40
//        System.out.println("Enter Cash :");
//        int cash=sc.nextInt();
//
//        if(cash<10) {
//            System.out.println("Can't buy anything");
//            System.out.println("get more cash");
//        } else if (cash>10 && cash<40) {
//            System.out.println("Can get 1 thing");
//        }
//        else{
//            System.out.println("Can get both");
//        }


        // Switch Statement
//        int day=1; //1-monday ,2-tuesday......
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter day :");
//        int day=sc.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            default:
//                System.out.println("Wednesday - Sunday");
//        }

        // Loops in Java
        // Write a program to print a number of series

//        for (int i=0;i<5;i++){
//            System.out.print(i);
//            System.out.print(" ");
//        }

//        int i=0;
//        while (i<=10){
//            System.out.print(i);
//            System.out.print(" ");
//            i++;
//        }

//        int k=10;
//        do{
//            System.out.print(k);
//            System.out.print(" ");
//            k--;
//        }
//        while (k>=1);

        // Program take input until user input a number which is less than 0
//        Scanner sc=new Scanner(System.in);
//        int number;
//        do {
//            System.out.println("Input a number");
//            number=sc.nextInt();
//            System.out.print("here is your number");
//            System.out.println(number);
//        }
//        while (number>=0);
//        System.out.println("The End");

        // Break and Continue
//        int i=0;
//        while (true){
//            if(i==3){
//                i++;
//                continue;
//            }
//            System.out.print(i);
//            System.out.print(" ");
//            i++;
//            if(i>5){
//                break;
//            }
//        }

        // TRY - CATCH in Exception Handling

//        int [] marks ={97,98,95};
        // If you think there was an error came in your code then you put that line
        // in try block and handle that exception in catch block
//        try {
//            System.out.println(marks[5]);
//        }
//        catch (Exception exception){
//            // do thing after catching
//
//        }
        // Now over all things are printed whether there was an exception above
//        System.out.println("Student name is Vishal");

//        Methods and Function -> you can use function if you have to do repetitive work

//        System.out.println("hello java");
//        System.out.println("hello java");
//        System.out.println("hello java");

        // calling function for print hello java
//        printjava();
//        printjava();
//        printjava();
//
//        // calling function to take user input name and print it
//        Scanner sc=new Scanner(System.in);
//        String name =sc.nextLine();
//
//        printName(name);

        // Adding two number using function and methods
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();
        System.out.println(sum(a,b));



    }


}
