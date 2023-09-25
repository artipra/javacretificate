package string;

public class StringImmutability {

    public static void main(String[] args) {
        String hello = "hello";
        String hi = hello +"world";
        hi = hello;

        System.out.println(hi+hello);// confusing code in exam
        //every method on string return a new string.

        String s1= "1";
        String s2= s1.concat("2");
       // s2 = s2.concat("3"); // if not assign then 12

        System.out.println(s1 == s2);




    }
}
