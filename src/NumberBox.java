/**
 * Class representing a box containing a number.
 * Implements the ReturnValueProvider interface to provide the contained number as the return value.
 */
public class NumberBox implements ReturnValueProvider {
    private int value;

    /**
     * Constructor to initialize the NumberBox with a value.
     *
     * @param value the value to be contained in the NumberBox
     */
    public NumberBox(int value) {
        this.value = value;
    }

    /**
     * Returns the contained value.
     *
     * @return the contained value
     */
    @Override
    public int returnValue() {
        return value;
    }

    /**
     * Returns a string representation of the NumberBox.
     *
     * @return a string representation of the NumberBox
     */
    @Override
    public String toString() {
        return "NumberBox with value: " + value;
    }
}
