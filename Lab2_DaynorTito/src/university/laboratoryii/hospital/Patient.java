package university.laboratoryii.hospital;

public class Patient extends Person{

    private String dateOfBirth;
    private int historyNumber;

    public Patient(){}
    public Patient(String dateOfBirth, int historyNumber) {
        this.dateOfBirth = dateOfBirth;
        this.historyNumber = historyNumber;
    }

    public Patient(String name, String lastName, String address, String ci, int telephneNumber, String dateOfBirth, int historyNumber) {
        super(name, lastName, address, ci, telephneNumber);
        this.dateOfBirth = dateOfBirth;
        this.historyNumber = historyNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getHistoryNumber() {
        return historyNumber;
    }

    public void setHistoryNumber(int historyNumber) {
        this.historyNumber = historyNumber;
    }

    @Override
    public String toString() {
        return super.toString()+" " +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", historyNumber=" + historyNumber +
                '}';
    }
    @Override
    public void showData(){
        System.out.println(toString());
    }
}
