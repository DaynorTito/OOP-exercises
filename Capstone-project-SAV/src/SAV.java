public class SAV {
    public static void main(String[] args) {
        /*ListData argsData = new ListData(args);
        if (argsData.getType().equals("n")){
            SortingAlgorithm<Integer> algorithmInteger = new SortingAlgorithm<>(argsData.getArrayInteger(),argsData.getAlgorithm());
            algorithmInteger.sort();
            algorithmInteger.showElements();
        } else if (argsData.getType().equals("c")){
            SortingAlgorithm<Character> algorithmInteger = new SortingAlgorithm<>(argsData.getArrayCharacter(),argsData.getAlgorithm());
            algorithmInteger.sort();
            algorithmInteger.showElements();
        } else{
            System.out.println("Wrong data type");
        }*/
        SortingVisualizer sortingVisualizer = new SortingVisualizer(args);
        sortingVisualizer.sort();
        sortingVisualizer.showElements();
    }
}