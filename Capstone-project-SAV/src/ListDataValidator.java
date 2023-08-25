public class ListDataValidator {

    public static void validateArrayInteger(String[] listNumbers) {
        for (int i = 0; i < listNumbers.length; i++) {
            try {
                Integer.parseInt(listNumbers[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid values");
            }
        }
    }

    public static void validateArrayCharacter(String[] listChar) {
        for (int i = 0; i < listChar.length; i++) {
            if (listChar[i].length() != 1) {
                throw new IllegalArgumentException("Invalid character at index " + i + ": " + listChar[i]);
            }
            char character = listChar[i].charAt(0);
            if (Character.isDigit(character)) {
                throw new IllegalArgumentException("The Character '" + character + "' cannot be a number. Invalid values");
            }
        }
    }
}
