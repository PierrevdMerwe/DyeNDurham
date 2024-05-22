# Name Sorter

This program sorts a list of names by last name and then by given names.

## Building

To compile the program and test class, navigate to the `src` directory and run:

```javac *.java```

This will create `NameSorter.class, NameSorter$1.class, NameSorterTest.class` files in the same directory.

## Usage

To run the sorting program, use the following command:

```name-sorter ./unsorted-names-list.txt```

Replace `./unsorted-names-list.txt` with the path to your textfile, if you wish to use another textfile other than the one I have added.

The program will print the sorted list of names to the console and write the sorted list to a file called `sorted-names-list.txt` in the working directory.

## Testing

The `NameSorterTest` class is used to test the functionality of the `NameSorter` class:

1. Navigate to the `src` directory.
2. Compile your Java file if you have not yet previously with the `Building` step
3. Run your test class with: `java NameSorterTest`

The `NameSorterTest` class includes the test case:

- **Sorting Test**: This test checks if the names are sorted correctly. The expected first name in the sorted list is set to "Marin Alvarez" (This is held in a variable `name` and can be changed if you wish to use other text files). If the first name in the sorted list matches this, the test passes.
