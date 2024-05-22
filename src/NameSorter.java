import java.io.*;
import java.util.*;

public class NameSorter {
    public static void main(String[] args) throws IOException {
        // Check if the correct arguments are provided
        if (args.length != 1) {
            System.out.println("Please use: 'name-sorter ./<file name inside src directory>'");
            System.exit(1);
        }

        // Read names from the file
        List<String> names = readNamesFromFile(args[0]);

        // Sort the names
        sortNames(names);

        // Write the sorted names to a new file and print them
        writeNamesToFile(names);
    }

    // Method to read names from a file
    static List<String> readNamesFromFile(String fileName) throws IOException {
        List<String> names = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return names;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        }
        if (names.isEmpty()) {
            System.out.println("File is empty.");
        }
        return names;
    }

    // Method to sort names
    static void sortNames(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            public int compare(String name1, String name2) {
                String lastName1 = name1.substring(name1.lastIndexOf(" "));
                String lastName2 = name2.substring(name2.lastIndexOf(" "));
                int lastNameCompare = lastName1.compareTo(lastName2);
                return lastNameCompare != 0 ? lastNameCompare : name1.compareTo(name2);
            }
        });
    }

    // Method to write names to a file
    private static void writeNamesToFile(List<String> names) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("sorted-names-list.txt"))) {
            for (String name : names) {
                System.out.println(name);
                writer.println(name);
            }
        }
    }
}
