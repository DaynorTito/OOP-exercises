import university.functions.Sortable;
import university.functions.Unique;

import java.util.*;
import java.util.function.UnaryOperator;

public class UniArrayList<E> implements java.util.List<E>, Sortable<E>, Unique<E> {

    private Object[] array;
    private int size;
    private Object[] copyArray;


    public UniArrayList() {
        array = new Object[0];
        size = 0;
    }

    public UniArrayList(E[] array) {
        this.array = new Object[array.length];
        for (int i = 0; i < array.length; i++)
            this.array[i] = array[i];
        size = array.length;
    }

    public void resize(int newCapacity) {
        Object[] newElements = new Object[newCapacity];
        for (int i = 0; i < size; i++)
            newElements[i] = array[i];
        setArray(newElements);
    }
    public void shiftElementsRight(int startIndex, int numElements) {
        for (int i = size - 1; i >= startIndex; i--)
            array[i+numElements] = array[i];
    }
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = Math.max(minCapacity, array.length+(array.length >> 1));
            resize(newCapacity);
        }
    }
    @Override
    public boolean add(E e) {
        if (size == array.length)
            ensureCapacity(size + 1);
        array[size++] = e;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index == size)
            ensureCapacity(size + 1);
        else {
            ensureCapacity(size + 1);
            shiftElementsRight(index, 1);
        }
        array[index] = element;
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    public int getIndex(E o){
        for (int i = 0; i < size; i++) {
            if(o.equals(array[i]))
                return i;
        }
        return 0;
    }
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        E removedElement = get(index);
        Object[] newArray = new Object[size - 1];
        for (int i = 0, j = 0; i < size; i++) {
            if (i != index)
                newArray[j++] = array[i];
        }
        setArray(newArray);
        size--;
        return removedElement;
    }

    @Override
    public boolean remove(Object o) {
        int index = getIndex((E) o);
        if (index == -1)
            return false;
        Object[] newArray = new Object[size - 1];
        for (int i = 0; i < index; i++)
            newArray[i] = array[i];
        for (int i = index + 1; i < size; i++)
            newArray[i - 1] = array[i];
        setArray(newArray);
        size--;
        return true;
    }
    @Override
    public Iterator<E> iterator() {
        return new UniArrayListIterator();
    }
    private class UniArrayListIterator implements Iterator<E> {
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }
        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return get(currentIndex++);
        }
    }
    @Override
    public void sort() {
        if (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    Comparable<E> element1 = (Comparable<E>) array[j];
                    E element2 = (E) array[j + 1];
                    if (element1.compareTo(element2) > 0) {
                        swap(j, j + 1);
                    }
                }
            }
        }
    }

    @Override
    public void sortBy(Comparator<E> comparator) {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (comparator.compare((E) array[j], (E) array[minIndex]) < 0)
                    minIndex = j;
            }
            if (minIndex != i)
                swap(i, minIndex);
        }
    }

    private void swap(int i, int j) {
        E temp = (E) array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public String toString() {
        String sb = "[";
        for (int i = 0; i < size; i++) {
            sb+=array[i];
            if (i < size - 1)
                sb+=", ";
        }
        sb+="]";
        return sb;
    }

    @Override
    public void unique() {
        Object[] uniqueArray = new Object[size];
        int uniqueCount = 0;
        for (int i = 0; i < size; i++) {
            Comparable<E> element = (Comparable<E>)  array[i];
            boolean sw = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (element.compareTo((E) uniqueArray[j]) == 0){
                    sw = true;
                    break;
                }
            }
            if (!sw)
                uniqueArray[uniqueCount++] = element;
        }
        setArray(Arrays.copyOf(uniqueArray, uniqueCount));
        setSize(uniqueCount);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super E> c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {

    }


    @Override
    public E get(int i) {
        return (E)this.array[i];
    }

    @Override
    public E set(int i, E e) {
        return null;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    @Override
    public List<E> subList(int i, int i1) {
        return null;
    }

    @Override
    public Spliterator<E> spliterator() {
        return List.super.spliterator();
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getCopyArray() {
        return copyArray;
    }

    public void setCopyArray(Object[] copyArray) {
        this.copyArray = copyArray;
    }
}
