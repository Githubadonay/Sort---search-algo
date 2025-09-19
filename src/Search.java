public class Search {

    // linear sort is O(n)
    public static SearchReturn linear(int[] theArray, int searchValue) {
        long comparisons = 0; // track number of comparisons made while searching
        long elements = theArray.length;
        long endTime = 0;

        long startTime = System.nanoTime(); // track processing time while searching
        for (int idx = 0; idx < elements; idx++) {
            comparisons++;
            if (theArray[idx] == searchValue) {
                endTime = System.nanoTime() - startTime;
                return new SearchReturn("Linear Search", comparisons, endTime, elements, idx);
            }
        }
        endTime = System.nanoTime() - startTime; // capture final processing time

        // create return object to pass back all collected information
        return new SearchReturn("Linear Search", comparisons, endTime, elements, -1);
    }

    public static SearchReturn Binary(int[] A, int key) {
        long comparisons = 0; // track number of comparisons made while searching
        long elements = A.length;
        long endTime = 0;

        long startTime = System.nanoTime(); // track processing time while searching
        boolean found = false;
        int low = 0;
        int high = A.length - 1;
        while (!found && low <= high) {
            int floor = (low + high) / 2;
            comparisons++;
            if (A[floor] < key) {
                low = floor + 1;
            } else if (A[floor] > key) {
                high = floor - 1;
            } else {
                endTime = System.nanoTime() - startTime;
                return new SearchReturn("Binary Search", comparisons, endTime, elements, floor);
            }
        }
        

        endTime = System.nanoTime() - startTime; // capture final processing time

        // create return object to pass back all collected information
        return new SearchReturn("Binary Search", comparisons, endTime, elements, -1);
    }
}
