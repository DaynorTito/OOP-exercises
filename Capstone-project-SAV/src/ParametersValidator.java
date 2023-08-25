public class ParametersValidator {

    public static void validateTypeData(String type){
        if(!type.equalsIgnoreCase("N") && !type.equalsIgnoreCase("C")){
            try {
                throw new InvalidParameterException("Invalid data type specified.");
            } catch (InvalidParameterException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void validateAlgorithm(String type){
        if(!type.equalsIgnoreCase("B") && !type.equalsIgnoreCase("Q") && !type.equalsIgnoreCase("M")){
            try {
                throw new InvalidParameterException("The entered algorithm does not exist.");
            } catch (InvalidParameterException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void validateOrder(String substr) {
        if(!substr.equalsIgnoreCase("AZ") && !substr.equalsIgnoreCase("ZA")){
            try {
                throw new InvalidParameterException("Tnvalid order specification.");
            } catch (InvalidParameterException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void validateDataModel(String dataMode) {
        if(!dataMode.equalsIgnoreCase("M") && !dataMode.equalsIgnoreCase("R")){
            try {
                throw new InvalidParameterException("Invalid random data parameter.");
            } catch (InvalidParameterException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void validatePauseTime(String pauseTime) {
        try {
            Integer.parseInt(pauseTime);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Pause parameter in milliseconds invalid");
        }
    }
}
