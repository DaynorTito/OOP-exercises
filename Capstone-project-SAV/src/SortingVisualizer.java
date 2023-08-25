public class SortingVisualizer {

    private SortingAlgorithm sortingAlgorithm;

    private ListData listData;
    private String algorithm;

    public SortingVisualizer(){

    }
    public SortingVisualizer(String[] args) {
        listData = new ListData(args);
        if(listData.getParameters().getTypeData().equalsIgnoreCase("N") && listData.getParameters().getDataMode().equalsIgnoreCase("M")){
            sortingAlgorithm= new SortingAlgorithm<>(listData.getArrayInteger(),listData.getAlgorithm());
        } else if (listData.getParameters().getTypeData().equalsIgnoreCase("N")){
            sortingAlgorithm= new SortingAlgorithm<>(listData.getArrayIntegerRandom(),listData.getAlgorithm());
        } else if (listData.getParameters().getTypeData().equalsIgnoreCase("C") && listData.getParameters().getDataMode().equalsIgnoreCase("M")) {
            sortingAlgorithm = new SortingAlgorithm<>(listData.getArrayCharacter(),listData.getAlgorithm());
        } else{
            sortingAlgorithm = new SortingAlgorithm<>(listData.getArrayCharacterRandom(),listData.getAlgorithm());
        }

    }
    public SortingVisualizer(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void sort(){
        if(!listData.getParameters().isAscendant())
            this.sortingAlgorithm.setAscendingOrder(false);
        sortingAlgorithm.sort();
    }
    public void showElements(){

        sortingAlgorithm.showElements();
    }
}
