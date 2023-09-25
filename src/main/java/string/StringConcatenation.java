package string;

// ch 1 Rules fo concatenation, remember for exam
// 1 If both operands are numeric , it is numeric addition
//2 If one of the operand is string, means string concatenation
//3 expression is always evaluated from left to right.
public class StringConcatenation {


    public static void main(String[] args) {
        String text = "hello";
        String anotherText = new String("hello");

        System.out.println(2+3);//5 numeric addition
        System.out.println("a"+"b");//ab string concatenation with + sign
        System.out.println(1+2+"d");//  first numeric addition then string concatenation


        //likely in exam
        int three = 3;
        String four = "4";
        System.out.println(1+2+three+four);// first numeric addition then string concatenation


        int number =10;
        int anotherNumber = 20;
        System.out.println("result = "+number + anotherNumber); // string concatenation as first is string left-->right
        System.out.println("result = "+(number + anotherNumber));// in order to do addition


        String str = "";
        for(int i=0; i<10; i++)str +=i; // print number from 0 to 9 , not good because everytime creating new string

        String hello = "hello";
        String world = "world";
        String helloWorld = hello+world;// string always creates new variable
//        hello+world// in exam to confusion as no assignment


        System.out.println(hello);






    }

}
