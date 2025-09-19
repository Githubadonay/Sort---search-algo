public class Sort {

    // Bubble sort is O(?)
    public static SortReturn bubble(int[] data) {
        long elements = data.length;
        long comparisons = 0; // track number of comparisons made while sorting
        long swaps = 0; // track number of element swaps made while sorting

        boolean sorted = false;// assume that its not sorted yet
        long startTime = System.nanoTime(); // track processing time while sorting
        while (!sorted) {
            sorted = true; // could be sorted
            for (int idx = 1; idx < data.length; idx++) { // starts count from index 1
                comparisons++; // if statement below represents a comparison
                if (data[idx] < data[idx - 1]) {// compares first index with the index before it
                    swaps++; // this block is a swap
                    int tmpData = data[idx - 1];
                    data[idx - 1] = data[idx];
                    data[idx] = tmpData;
                    sorted = false;
                }
            }
        }
        long totalTime = (System.nanoTime() - startTime); // capture final processing time

        // create return object to pass back all collected information
        SortReturn sr = new SortReturn("Bubble Sort", comparisons, swaps, totalTime, elements);
        return sr;
    }

    public static SortReturn selection(int[] data) {
        long elements = data.length;
        long comparisons = 0; // track number of comparisons made while sorting
        long swaps = 0; // track number of element swaps made while sorting

        long startTime = System.nanoTime(); // track processing time while sorting

        for (int j = 0; j < data.length; j++) {
            int smallest = j;
            for (int i = j + 1; i < data.length; i++) {
                comparisons++;
                if (data[i] < data[smallest]) {
                    smallest = i;
                }
            }
            if (smallest != j) {
                int exchange = data[j];
                data[j] = data[smallest];
                data[smallest] = exchange;
                swaps++;
            }
        }
        long totalTime = (System.nanoTime() - startTime); // capture final processing time

        // create return object to pass back all collected information
        SortReturn sr = new SortReturn("Select Sort", comparisons, swaps, totalTime, elements);
        return sr;
    }

    public static SortReturn Insertion(int[] data) {
        long elements = data.length;
        long comparisons = 0; // track number of comparisons made while sorting
        long swaps = 0; // track number of element swaps made while sorting

        long startTime = System.nanoTime(); // track processing time while sorting
        for (int j = 2; j < data.length; j++) {
            int key = data[j];
            int i = j - 1;
            while (i > 0 && data[i] > key) {
                comparisons++;
                if (data[i] > key) {
                    data[i + 1] = data[i];
                    swaps++;
                    i = i - 1;
                } else {
                    break;
                }
            }
            data[i + 1] = key;
        }
        long totalTime = (System.nanoTime() - startTime); // capture final processing time

        // create return object to pass back all collected information
        SortReturn sr = new SortReturn("Insertion Sort", comparisons, swaps, totalTime, elements);
        return sr;
    }

}
