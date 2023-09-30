package javabasics;

/**
 * Arti 30
 */
public class MainMethod {

    //main method is entry point of your class

    public static void main(String[] args) {
        System.out.println("args = "+args.length);

        for(int i=0;i<args.length; i++){
            System.out.println(args[i]);
        }
        long s = 12_3L;
        new MainMethod().sum(1,2);
    }

    /**
     * return sum of 2 numbers
     * @param a int
     * @param b int
     * @return sum
     */
 int sum( int a , int b){return a+b;}
}
