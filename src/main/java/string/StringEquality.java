package string;
/*
* author Arti 25/0/2023
*/
public class StringEquality {

    public static void main(String[] args) {
        String name ="john";
        String anotherName ="john";
        String john ="jo"+"hn"; // Two literal are resolve at compile time therefore line 14 return true
        String newName = new String("jhon");

        System.out.println("name == anotherName -> " + (name == anotherName)); // == for reference check in string
        System.out.println("name == john -> " + (name == john));
        System.out.println("name == newName -> " + (name == newName));

        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));// .equals is for content
        System.out.println("name.equals(john) -> " + name.equals(john));
        System.out.println("name.equals(newName) -> " + name.equals(newName));

        System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
        System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
        System.out.println("john - identityHashCode -> " + System.identityHashCode(john));
        System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));


        String str1 = "abc";
        String str2 = "ab";
//        String str3 = "ab" + "c";
        String str3 = str2 + "c";// if literal + variable then at runtime therefore str3 hashcode is different

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

    }
}
