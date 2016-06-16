package cse214homework4;

//Jack Smith 110366081
/**
 * The Hashable interface provides the basic structure for any data type that
 * can be hashed. This means that any instance of the data type should be
 * interpretable as an integer. The hash() method of this interface achieves
 * this. For example, for a String data type, the key of a string instance s
 * should be an integer value achieved by calling s.hash().
 *
 * @author Ritwik Banerjee
 */
public interface Hashable {

    /**
     * Converts an instance of a hashable data type to a non-negative integer.
     *
     * @return the integer value.
     */
    int hash();

}
