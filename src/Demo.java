/**
 * Name: Devon Villalona
 * Course: COP3330.CRN12565
 * Date: 10/28/2023
 *
 * Program Objective:
 * This program demonstrates the use of generics, specifically in searching arrays and comparing objects based on a specific method.
 *
 * User Inputs:
 * No direct user input is required as the program runs predefined test cases.
 *
 * Outputs:
 * The program outputs the index of a searched value in various arrays and the object with the greater return value among two objects.
 */

/**
 * Demonstrates the functionality of ArraySearcher and Comparer classes.
 */
public class Demo {

    public static void main(String[] args) {
        // Part 1: Demonstrate the findIndex method

        Integer[] intArray = {2, 4, 6, 8};
        int intIndex = ArraySearcher.findIndex(intArray, 6);
        System.out.println("Index of 6 in intArray: " + intIndex);

        String[] strArray = {"apple", "banana", "cherry", "date"};
        int strIndex = ArraySearcher.findIndex(strArray, "cherry");
        System.out.println("Index of 'cherry' in strArray: " + strIndex);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        int doubleIndex = ArraySearcher.findIndex(doubleArray, 3.3);
        System.out.println("Index of 3.3 in doubleArray: " + doubleIndex);

        // Part 2: Demonstrate the "greater than" method

        NumberBox box1 = new NumberBox(5);
        ValueContainer container1 = new ValueContainer(7);

        ReturnValueProvider greaterObject = Comparer.greaterThan(box1, container1);
        System.out.println("The greater object is: " + greaterObject);
    }
}
