import java.util.Random;

public class TestSearchAndSort {

    public static void main(String[] args) {

        // create array and populate and array with random numbers
        int[] size = { 100, 1000, 10000 };
        // int[] testData = new int[size];
        // Random rndm = new Random(); // use a Random object to generate data
        for (int idx = 0; idx < size.length; idx++) {
            int[] testData = createArray(size[idx]);
            SortReturn sr = Sort.bubble(testData);
            System.out.println(sr.toString());
        }
        for (int idx = 0; idx < size.length; idx++) {
            int[] testData = createArray(size[idx]);
            SortReturn sr = Sort.selection(testData);
            System.out.println(sr.toString());
        }
        for (int idx = 0; idx < size.length; idx++) {
            int[] testData = createArray(size[idx]);
            SortReturn sr = Sort.Insertion(testData);
            System.out.println(sr.toString());
        }
        for (int idx = 0; idx < size.length; idx++) {
            // Declare a SearchReturn variable to use below
            SearchReturn srchReturn;
            int[] testData = createArray(size[idx]);
            // Search for an element that is known to be in the 10% position
            srchReturn = Search.linear(testData, testData[size[idx] / 10]);
            System.out.println("10% " + srchReturn.toString()); // display the performance info

            // Search for an element that is known to be in the 50% position
            srchReturn = Search.linear(testData, testData[size[idx] / 2]);
            System.out.println("50% " + srchReturn.toString()); // display the performance info

            // Search for an element that is known to be in the 90% position
            srchReturn = Search.linear(testData, testData[(int) (size[idx] * 0.9)]);
            System.out.println("90% " + srchReturn.toString()); // display the performance info

            // Search for an element that is known not to exist (
            srchReturn = Search.linear(testData, 9999);
            System.out.println("No element " + srchReturn.toString());
        }
        for (int idx = 0; idx < size.length; idx++) {
            // Declare a SearchReturn variable to use below
            SearchReturn srchReturn;
            int[] testData = createArray(size[idx]);
            // Search for an element that is known to be in the 10% position
            srchReturn = Search.Binary(testData, testData[size[idx] / 10]);
            System.out.println("10% " + srchReturn.toString()); // display the performance info

            // Search for an element that is known to be in the 50% position
            srchReturn = Search.Binary(testData, testData[size[idx] / 2]);
            System.out.println("50% " + srchReturn.toString()); // display the performance info

            // Search for an element that is known to be in the 90% position
            srchReturn = Search.Binary(testData, testData[(int) (size[idx] * 0.9)]);
            System.out.println("90% " + srchReturn.toString()); // display the performance info

            // Search for an element that is known not to exist (
            srchReturn = Search.Binary(testData, 9999);
            System.out.println("No element " + srchReturn.toString());
        }

        // insertion

        // Searches -- pull an element out of the array (e.g. testData[position])
        // so that it's known to exist in the array

        // Search for an element that is known to be in the 10% position

        // Binary search on a SORTED copy (don’t time the sorting here)

    }

    // this method will display the array contents if you want to view them
   /*  private static void displayArray(int[] testData) {
        for (int theInt : testData) {
            System.out.print(theInt + ",");
        }
        System.out.println();
    }*/

    public static int[] createArray(int size) {
        int[] testData = new int[size];
        Random rdm = new Random();
        for (int i = 0; i < size; i++) {
            testData[i] = rdm.nextInt(10000);

        }
        return testData;

    }

}
