**Java Array Functions**

**Description**

This Java program performs various operations on arrays, including separating even and odd numbers, finding the index of the first number with the smallest distance, and converting between arrays and ArrayLists.

**Features**

User Input Handling: Accepts an array of 5 integers from the user.

Even and Odd Separation: Splits the given array into even and odd numbers and displays them.

Smallest Distance Index: Finds the index of the first element with the smallest difference between adjacent elements.

Array and ArrayList Conversion: Converts an array to an ArrayList and back to an array.

**Classes and Methods**

1. Main Class

  main(String args[]): Initializes UserInput and ArrayFunctions classes and executes operations.

2. UserInput Class

  int[] arrayInput(): Accepts 5 integer inputs from the user and returns an array.

3. ArrayFunctions Class

  void display(ArrayList<Integer> array): Prints an ArrayList.

  void evenOdd(int[] array): Separates even and odd numbers from the given array and displays them.

  int findSmallestDistanceIndex(int[] array): Finds and returns the index of the first number with the smallest absolute difference between adjacent elements.

  int[] convertArrayOperations(int[] array): Converts an array to an ArrayList and back to an array, then prints the results.
