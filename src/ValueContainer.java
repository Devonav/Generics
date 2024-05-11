/**
 * Class representing a container that holds a value.
 * Implements the ReturnValueProvider interface to provide the contained value as the return value.
 */
public class ValueContainer implements ReturnValueProvider {
    private int containedValue;

    /**
     * Constructor to initialize the ValueContainer with a value.
     *
     * @param containedValue the value to be contained
     */
    public ValueContainer(int containedValue) {
        this.containedValue = containedValue;
    }

    /**
     * Returns the contained value.
     *
     * @return the contained value
     */
    @Override
    public int returnValue() {
        return containedValue;
    }

    /**
     * Returns a string representation of the ValueContainer.
     *
     * @return a string representation of the ValueContainer
     */
    @Override
    public String toString() {
        return "ValueContainer with value: " + containedValue;
    }
}
