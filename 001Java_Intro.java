import java.awt.*;

public class Main {
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

        byte a = 30;
        int phone = 134757928;
        long phone2 = 13573929700000003L;
        float pi = 3.14F;
        char letter ='@';
        boolean isAdult =false;

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

        String name="vishal";

        // CharAt
        System.out.println(name.charAt(0)); // 0 Based indexing

        // length
        System.out.println(name.length());

        // Replace
        String output= name.replace('a','b');
        System.out.println(output);

        // Substring
        String s="Vishal and Rai";
        System.out.println(name.substring(0,3)); // in this your 1st idx is include but second idx is exclude




    }

}
