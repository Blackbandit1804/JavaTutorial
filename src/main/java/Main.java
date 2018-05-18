import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;


public class Main {

    static Student table[] = {
        new Student("Lukas", 0),
        new Student("Hannes", 1),
        new Student("Alex", 2)
    };


    static String readInpt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {

        // TEIL A ------------------------------------

        if (table[0].getName() == "Lukas") {
            System.out.println("This is Lukas!");
        }
        else {
            System.out.println("This is not Lukas.");
        }


        // TEIL B ------------------------------------

        System.out.print("Who you are searching for?\n> ");
        String target = readInpt();
        boolean foundTarget = false;

        // --------------------
        // While Loop Method

        int counter = 0;
        while (counter < table.length) {
            // table[counter].getName() == target -> DOES NOT WORK
            if (table[counter].getName().equals(target)) {
                System.out.println("Found " + target + " at position " + counter);
                foundTarget = true;
            }
            counter++;
        }

        // --------------------
        // For Loop Method

        for (int i = 0; i < table.length; i++) {
            if (table[i].getName().equals(target)) {
                System.out.println("Found " + target + " at position " + i);
                foundTarget = true;
            }
        }

        // --------------------
        // ForEach Loop Method

        for (Student student : table) {
            if (student.getName().equals(target)) {
                System.out.println("Found " + target);
                foundTarget = true;
            }
        }

        // --------------------
        // Lambda Loop Method

        if (Arrays.stream(table).filter(u -> u.getName().equals(target)).count() > 0) {
            System.out.println("Found " + target);
            foundTarget = true;
        }

        // --------------------

        if (!foundTarget)
            System.out.println(target + " could not be found!");
    }
}
