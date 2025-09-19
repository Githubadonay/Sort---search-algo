import java.util.Random;

public class TestSearchAndSort {

    public static void main(String[] args) {

        // create array and populate and array with random numbers
        int size = 1000;
        int[] testData = new int[size];
        Random rndm = new Random(); // use a Random object to generate data
        for (int idx = 0; idx < size; idx++) {
            testData[idx] = rndm.nextInt(1000); // Random integers between 0 & 1000
        }

        // Declare a SearchReturn variable to use below
        SearchReturn srchReturn;

        // Sort the array with bubble sort and print results
        SortReturn sr = Sort.bubble(testData);
        System.out.println(sr.toString()); // display the performance info
        // selection
        sr = Sort.selection(testData);
        System.out.println(sr.toString());
        // insertion
        sr = Sort.Insertion(testData);
        System.out.println(sr.toString());
        // Searches -- pull an element out of the array (e.g. testData[position])
        // so that it's known to exist in the array

        // Search for an element that is known to be in the 10% position
        srchReturn = Search.linear(testData, testData[size / 10]);
        System.out.println(srchReturn.toString()); // display the performance info

        // Search for an element that is known to be in the 50% position
        srchReturn = Search.linear(testData, testData[size / 2]);
        System.out.println(srchReturn.toString()); // display the performance info

        // Search for an element that is known to be in the 90% position
        srchReturn = Search.linear(testData, testData[(int) (size * 0.9)]);
        System.out.println(srchReturn.toString()); // display the performance info

        // Search for an element that is known not to exist (
        srchReturn = Search.linear(testData, 9999);
        System.out.println(srchReturn.toString()); // display the performance info

        // Binary search on a SORTED copy (don’t time the sorting here)

        srchReturn = Search.Binary(testData, testData[size / 10]);
        System.out.println(srchReturn.toString());

        srchReturn = Search.Binary(testData, testData[size / 2]);
        System.out.println(srchReturn.toString());

        srchReturn = Search.Binary(testData, testData[(int) (size * 0.9)]);
        System.out.println(srchReturn.toString());

        srchReturn = Search.Binary(testData, 9999);
        System.out.println(srchReturn.toString());

    }

    // this method will display the array contents if you want to view them
    private static void displayArray(int[] testData) {
        for (int theInt : testData) {
            System.out.print(theInt + ",");
        }
        System.out.println();
    }
}
