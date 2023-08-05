package university.functions;

import java.util.Comparator;

/**
 * university.jala.functions.Sortable.
 */
public interface Sortable<T> {
    void sort();

    void sortBy(Comparator<T> comparator);
}
