public class Main {

    /*
    *   1. Datentypen
    *   2. Keywords, Access Types
    *   3. Methods
    * */

    /*
        <--[ Variablen Typen ]-->
        Mehr Infos zu Variablentypen gibts hier:
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */
    short myShort = 2;
    static int myInt = 123;
    long myLong = 123123123123l;

    float myFloat = 1.3456f;
    double myDouble = 1.2346;

    String myString = "Hey! This is my string!";

    /*
        <--[ Arrays ]-->
     */
    float myFloatArray[] = {1, 2, 3, 1.3456f};
    String myStringArray[] = {"hey!", "ho!"};
    int myIntArray;

    /*
        <--[ Methoden / Getter & Setter ]-->
     */

    private static int myPrivateInt;

    public static int getMyPrivateInt() {
        return myPrivateInt;
    }

    public static void setMyPrivateInt(int setter) {
        myPrivateInt = setter;
    }


    public int myPublicInt;

    /*
        <--[ Access Type: 'final' ]-->
        Mehr Infos zu Access Types:
        https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */

    private static final String MYSTATICFINASTRING = "Hey ho";


    /*
        Static Voids
     */

    public static void hello(String name, String secondname) {
        System.out.println("Hello, " + name + " and " + secondname);
    }

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // System.out.print("This is my first Java Program!");

        hello("Ringo", "Martin");

        // MYSTATICFINASTRING = "asd"; -> ERROR

        System.out.println(Integer.toString(myInt));

        setMyPrivateInt(17);

        System.out.println(getMyPrivateInt());

        int myNewInt = getMyPrivateInt();
    }

}

