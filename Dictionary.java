package cse214homework4;

//Jack Smith 110366081
/**
 * The Dictionary is an interface that provides the overall structure for
 * dynamic sets that support insert, delete and search.
 *
 * @author Ritwik Banerjee
 */
public interface Dictionary<V extends Hashable> {

    /**
     * Checks whether or not the dictionary is empty.
     *
     * @return true if the dictionary has no items, false otherwise.
     */
    boolean isEmpty();

    /**
     * The dictionary insert operation.
     *
     * @param value the value to be inserted into the dictionary.
     * @throws java.lang.NullPointerException if the value is null .
     */
    void insert(V value);

    /**
     * The dictionary delete operation.
     *
     * @param value the value to be removed from the dictionary.
     * @return the given value, if it was actually deleted from the dictionary,
     * and null otherwise.
     * @throws java.lang.NullPointerException if the value to be deleted is null
     */
    V delete(V value);

    /**
     * The dictionary search operation.
     *
     * @param key the key so search for.
     * @return the value associated with the given key, or null if the key is
     * not present in the dictionary.
     */
    V find(int key);

}
