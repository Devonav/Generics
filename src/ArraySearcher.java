/**
 * Utility class for searching arrays.
 */
public class ArraySearcher {

    /**
     * Finds the index of a value in a generic array.
     *
     * @param <T> the type of the elements in the array and the value
     * @param array the array to search
     * @param value the value to find
     * @return the index of the value in the array, or -1 if not found
     */
    public static <T> int findIndex(T[] array, T value) {
        // Loop through the array to find the value
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;  // Value not found in the array
    }
}


