import java.io.*;
import java.util.*;

public class NameSorterTest {
    public static void main(String[] args) throws IOException {
        testSorting();
    }

    private static void testSorting() throws IOException {
        List<String> names = NameSorter.readNamesFromFile("./unsorted-names-list.txt");
        NameSorter.sortNames(names);

        // Change the name that will be first when sorted here (if testing using different text files.)
        String name = "Marin Alvarez";

        // Test: The first name in the sorted list should be "Marin Alvarez" from the unsorted-names-list.txt file
        if (!names.get(0).equals(name)) {
            System.out.println("Test failed: The first name was " + names.get(0) + ", but expected " + name);
        } else {
            System.out.println("Test passed: The first name was correctly sorted.");
        }

    }
}

