import java.util.Random;

public class ListData {

    private String[] args;
    private String type;

    private Parameter parameters;

    public ListData() {

    }

    public ListData(String[] args) {
        parameters = new Parameter(args);
        this.args = args;
        this.type = parameters.getTypeData();
    }

    public String getAlgorithm(){
        if(args[3].charAt(0)!='o')
            return parameters.getAlgorithm();
        else
            return  "B";
    }
    public Integer[] getArrayInteger() {
        String numbersString = args[4].substring(2, args[4].length() - 1);
        String[] listNumbers = numbersString.split(",");
        ListDataValidator.validateArrayInteger(listNumbers);
        Integer[] numbers = new Integer[listNumbers.length];
        for (int i = 0; i < listNumbers.length; i++)
            numbers[i] = Integer.parseInt(listNumbers[i]);
        printArrayN(numbers);
        return numbers;
    }
    public Integer[] getArrayIntegerRandom(){
        Random random = new Random();
        int minRange = -100;
        int maxRange = 100;
        Integer[] numbers = new Integer[parameters.getNumberValuesRandom()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(maxRange - minRange + 1) + minRange;
        }
        printArrayN(numbers);
        return numbers;
    }
    public void printType(){
        System.out.print("Type ");
        if(type.equalsIgnoreCase("n"))
            System.out.println("[integer]");
        else
            System.out.println("[character]");
        System.out.print("Values: [");
    }

    public Character[] getArrayCharacter() {
        String charString = args[4].substring(2, args[4].length());
        String[] listChar = charString.split(",");
        ListDataValidator.validateArrayCharacter(listChar);
        Character[] characters = new Character[listChar.length];
        for (int i = 0; i < listChar.length; i++)
            characters[i] = listChar[i].charAt(0);
        printArrayC(characters);

        return characters;
    }
    public void printArrayC(Character[] characters){
        printType();
        for (int i = 0; i < characters.length - 1; i++)
            System.out.print("'" + characters[i] + "', ");
        if (characters.length > 0)
            System.out.print("'" + characters[characters.length - 1] + "'");
        System.out.println("]");
    }
    public void printArrayN(Integer[] numbers){
        printType();
        for (int i = 0; i < numbers.length - 1; i++)
            System.out.print(numbers[i] + ", ");
        if (numbers.length > 0)
            System.out.print(numbers[numbers.length - 1]);
        System.out.println("]");
    }
    public Character[] getArrayCharacterRandom(){
        Random random = new Random();
        int arraySize = parameters.getNumberValuesRandom();
        Character[] characters = new Character[arraySize];
        for (int i = 0; i < characters.length; i++) {
            int randomCharValue = random.nextInt(122 - 65 + 1) + 65;
            if(91<=randomCharValue && randomCharValue<=96){
                randomCharValue-=10;
            }
            characters[i] = (char) randomCharValue;
        }
        printArrayC(characters);
        return characters;
    }


    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Parameter getParameters() {
        return parameters;
    }

    public void setParameters(Parameter parameters) {
        this.parameters = parameters;
    }

}
