/*Eddie Eduardo Gomez.
 *Version 1.0.2
 *9/26/2024
*/
import java.util.ArrayList;
import java.util.Random;
public class Main {
    private static ArrayList<Integer> array = new ArrayList<Integer>();
    private static int O = 0;
    public static ArrayList<Integer> SelectionSort(ArrayList<Integer> array) {
        int minIndex;
        for (int i = 0; i < 20; i++) {
            minIndex = i;
            for (int j = i+1; j < 20; j++ ) {
                if (array.get(minIndex) > array.get(j)) {
                    minIndex = j;
                }
                O += 1;
            }
            if (minIndex != i) {
                System.out.println("Index location: " + minIndex + ", Swapping: " + array.get(minIndex) + " " + array.get(i) + ".");
                int temp = array.get(i);
                array.set(i, array.get(minIndex));
                array.set(minIndex, temp);
            } else {
                System.out.println("Index location: " + minIndex + ", No change made.");
            }
        }
        return array;
    }
    public static void printArray(ArrayList<Integer> array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Random rand = new Random(506070);
        int max = 70;
        int min = 50;
        for (int i = 0; i < 20; i++) {
            array.add(rand.nextInt((max - min) + 1) + min);
        }
        System.out.println("Unsorted array: ");
        printArray(array);
        SelectionSort(array);
        System.out.println("Sorted array");
        printArray(array);
        System.out.println("Number of iterations: " + (O) + ", which comes out as O(n^2)");
    }
}