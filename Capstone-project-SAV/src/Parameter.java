public class Parameter {

    private String algorithm;
    private boolean ascendant;
    private boolean random;
    private String dataMode;
    private String typeData;
    private int numberValuesRandom;
    private int pauseTime;

    public Parameter(){

    }
    //java SAV a=i t=n o=az in=r r=10 s=140
    //java SAV a=i t=c o=az in=m v="a,f,r,f,x" s=140
    public Parameter(String[] args){
        algorithm = args[0].substring(2);
        ParametersValidator.validateAlgorithm(algorithm);
        typeData = args[1].substring(2);
        ParametersValidator.validateTypeData(typeData);
        ParametersValidator.validateOrder(args[2].substring(2));
        ascendant = (args[2].substring(2).equalsIgnoreCase("az"))? true:false;

        dataMode = args[3].substring(3);
        ParametersValidator.validateDataModel(dataMode);
        if(!dataMode.equalsIgnoreCase("M") ){
            numberValuesRandom = Integer.parseInt(args[4].substring(2));
            random=true;
        } else
            random = false;
        ParametersValidator.validatePauseTime(args[5].substring(2));
        pauseTime = Integer.parseInt(args[5].substring(2));
    }

    public Parameter(String algorithm, boolean ascendant, String dataMode, int numberValuesRandom, int pauseTime) {
        this.algorithm = algorithm;
        this.ascendant = ascendant;
        this.dataMode = dataMode;
        this.numberValuesRandom = numberValuesRandom;
        this.pauseTime = pauseTime;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public boolean isAscendant() {
        return ascendant;
    }

    public void setAscendant(boolean ascendant) {
        this.ascendant = ascendant;
    }

    public String getDataMode() {
        return dataMode;
    }

    public void setDataMode(String dataMode) {
        this.dataMode = dataMode;
    }

    public int getNumberValuesRandom() {
        return numberValuesRandom;
    }

    public void setNumberValuesRandom(int numberValuesRandom) {
        this.numberValuesRandom = numberValuesRandom;
    }

    public int getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(int pauseTime) {
        this.pauseTime = pauseTime;
    }

    public boolean isRandom() {
        return random;
    }

    public void setRandom(boolean random) {
        this.random = random;
    }

    public String getTypeData() {
        return typeData;
    }

    public void setTypeData(String typeData) {
        this.typeData = typeData;
    }

}
