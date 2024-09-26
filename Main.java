// Eddie Eduardo Gomez.
import java.util.ArrayList; // Array Library utilities.
import java.util.Scanner; // Scanner Library utilities.
public class Main { 
    private static ArrayList<Integer> numberArray = new ArrayList<Integer>(); // Declare an array to hold our numbers. -- read to line 32.
    public static ArrayList<Integer> SelectionSort(ArrayList<Integer> array) { // Method SelectionSort.
        int minIndex; // Declare an object that will hold the value of the minimum nunber.
        for (int i = 0; i < array.size(); i++) { // Loop for slection sort.
            minIndex = i; // Sets minIndex as the current minimum number "i."
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j; // Sets minIndex as the current minimum number "j."
                }
            } // Doesn't stop until the end as we need to look for the next minimun number to give to minIndex.
            if (minIndex != i) { // Switching the numbers.
                System.out.println("Index found as: " + array.get(minIndex));
                System.out.println("Switched " + array.get(i) + " and " + array.get(minIndex));
                int temp = array.get(i);
                array.set(i, array.get(minIndex));
                array.set(minIndex, temp);
                printArray(array); // Call method "printArray" to print our array. -- read to line 26.
            } else {
                System.out.println("Index found as: " + array.get(minIndex) + ", no change was made.");
            }
        }
        return array; // end.
    }

    public static void printArray(ArrayList<Integer> array){ // Method printArray.
        for (int num : array) { // Loop for ever number in array to print.
            System.out.print(num + " ");
        }
        System.out.println();
    } // -- read to line 21
    public static void main(String[] args) { // Main code
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers into Array (type anything else to end): ");
        while (input.hasNextInt()) { // While loop that will always be true unless we input something else.
            numberArray.add(input.nextInt());
        }
        input.close(); // We close the input to prevent issues.
        System.out.println("Original Array:");
        printArray(numberArray); // Call method to print our array.
        System.out.println("Sorting Array:");
        SelectionSort(numberArray); // Call method to sort our array. -- read to line 6.
    }
} // Closing/End of code.