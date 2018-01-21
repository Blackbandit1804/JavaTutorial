public class Main {

    /*
    *   1. Datentypen
    *   2. Keywords, Access Types
    *   3. Methods
    * */

    // -> https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

    short myShort = 1;
    int myInt = 123123;
    long myLong = 12312;
    float myFLoat = 3.1415f;

    // String -> Klasse
    String myString = "Hey was geht!";

    // -> https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
    public int myPublicInt;
    private int myPrivateInt;
    static int myStaticInt;
    final int myFinalInt = 3;
    public static final int myPSFInt = 0;


    private static void myMethod(String myArg) {
        System.out.printf("This is my void!\nAnd this is my Arg: " + myArg);
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("This is my first Java Program!");

        myMethod("Hey this is an argument!");
    }

}
