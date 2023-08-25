public class SortingAlgorithm<E extends Comparable<E>> {

    private E[] array;
    private E[] copy;
    private String algorithm;
    private boolean ascendingOrder;

    public SortingAlgorithm(E[] array, String algorithm) {
        this.array = array;
        copy = (E[]) new Comparable[array.length];
        this.algorithm = algorithm;
        ascendingOrder = true;
    }
    public SortingAlgorithm(E[] array) {
        this.array = array;
        copy = (E[]) new Comparable[array.length];
        this.algorithm = "B";
        ascendingOrder = true;
    }
    public void mergeSort(int left, int right){
        if(left == right)
            return;
        int middle = (left + right) / 2;
        mergeSort(left, middle);
        mergeSort(middle + 1, right);
        for(int i = left; i <= right; i++)
            copy[i] = array[i];
        int Left = left;
        int Right = middle + 1;
        for(int i = left; i <= right; i++){
            if(Left > middle){
                array[i] = copy[Right++];
            }else if(Right > right){
                array[i] = copy[Left++];
            }else {
                if (this.ascendingOrder){
                    if (copy[Left].compareTo(copy[Right]) < 0) {
                        array[i] = copy[Left++];
                    } else {
                        array[i] = copy[Right++];
                    }
                } else{
                    if (copy[Left].compareTo(copy[Right]) > 0) {
                        array[i] = copy[Left++];
                    } else {
                        array[i] = copy[Right++];
                    }
                }
            }
        }
    }
    public void sortingWithMergeSort(){
        mergeSort(0, array.length-1);
    }
    public void showElements(){
        System.out.print("Ordering: [");
        for (int i = 0; i <array.length-1; i++) {
            System.out.print(array[i]+", ");
        }
        String algorithm2="";
        if(algorithm.equalsIgnoreCase("B")){
            algorithm2="Bubble Sort";
        } else if(algorithm.equalsIgnoreCase("Q")){
            algorithm2="Quic kSort";
        } else if(algorithm.equalsIgnoreCase("M")){
            algorithm2="Merge Sort";
        }
        System.out.print(array[array.length-1]+"]\nAlgorithm: "+algorithm2);
        if(algorithm.equalsIgnoreCase("B")){
            System.out.print(" (Default)");
        }
        System.out.println();
    }

    public void bubbleSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(this.ascendingOrder) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        swap(j, j + 1);
                    }
                } else{
                    if (array[j].compareTo(array[j + 1]) < 0) {
                        swap(j, j + 1);
                    }
                }
            }
        }
    }
    public void swap(int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }
    public int partition(int low, int high) {
        E pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if(this.ascendingOrder) {
                if (array[j].compareTo(pivot) < 0) {
                    i++;
                    swap(i, j);
                }
            } else{
                if (array[j].compareTo(pivot) > 0) {
                    i++;
                    swap(i, j);
                }
            }
        }
        swap(i + 1, high);
        return i + 1;
    }
    public void sort(){
        if(algorithm.equalsIgnoreCase("B")){
            bubbleSort();
        } else if(algorithm.equalsIgnoreCase("M")){
            sortingWithMergeSort();
        } else if (algorithm.equalsIgnoreCase("Q")) {
            quickSort(0, array.length-1);
        } else{
            try {
                throw new InvalidParameterException("The entered algorithm does not exist.");
            } catch (InvalidParameterException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public E[] getCopy() {
        return copy;
    }

    public void setCopy(E[] copy) {
        this.copy = copy;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public boolean isAscendingOrder() {
        return ascendingOrder;
    }

    public void setAscendingOrder(boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }
}
