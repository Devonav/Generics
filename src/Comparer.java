/**
 * Utility class to compare objects based on the returnValue method.
 */
public class Comparer {

    /**
     * Compares two objects based on their returnValue and returns the one with the greater value.
     *
     * @param <T> the type of the objects, which should implement ReturnValueProvider
     * @param obj1 the first object to compare
     * @param obj2 the second object to compare
     * @return the object with the greater return value
     */
    public static <T extends ReturnValueProvider> T greaterThan(T obj1, T obj2) {
        // Compare the return values of the two objects and return the greater one
        return obj1.returnValue() > obj2.returnValue() ? obj1 : obj2;
    }
}
