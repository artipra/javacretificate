package string;

public class StringMethods {

    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9 10
        // j a v a   i s   f u n
        String str = "java is fun";

        // length
        System.out.println("length= " + str.length());

        // char at
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));

        // index of
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 2));
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf("fun", 10)); // - match not found

        // substring
//        str = str.substring(8);
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(4, 4)); // empty string

//        System.out.println(str.substring(4, 2)); // out of range
//        System.out.println(str.substring(8, 14)); // out of range

        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Lucky";
//        dog.toUpperCase();
        dog = dog.toUpperCase();
        System.out.println(dog);

        String str1 = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        // startsWith / endsWith
        System.out.println(str1.startsWith("j"));
        System.out.println(str1.startsWith(str3));
        System.out.println(str1.startsWith("J".toLowerCase()));
        System.out.println(str1.endsWith("va"));

        // contains
        System.out.println(str1.contains(str3));
        System.out.println(str1.contains("av"));
        System.out.println("Java".contains("j".toUpperCase()));

        // replace
        String myString = "Java" + " " + "is" + " " + "cool";

        System.out.println(myString.replace('a', 'A'));
        System.out.println(myString.replace(" ", "_"));
        System.out.println(myString.replace("is", "_"));
        System.out.println(myString);

        // trim
        System.out.println("Java".trim());
        System.out.println(" Java is cool  ");
        System.out.println(" Java is cool  ".trim());
    }

}
