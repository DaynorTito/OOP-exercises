package university.laboratoryii.hospital;

public class MedicalAppointmen {
    private String date;
    private String shift;
    private int registrationDoctor;
    private int historyNumber;
    private String reason;
    private String specialty;

    public MedicalAppointmen(){}
    public MedicalAppointmen(String date, String shift, int registrationDoctor, int historyNumber, String specialty,String reason) {
        this.date = date;
        this.shift = shift;
        this.registrationDoctor = registrationDoctor;
        this.historyNumber = historyNumber;
        this.reason = reason;
        this.specialty =specialty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getRegistrationDoctor() {
        return registrationDoctor;
    }

    public void setRegistrationDoctor(int registrationDoctor) {
        this.registrationDoctor = registrationDoctor;
    }

    public int getHistoryNumber() {
        return historyNumber;
    }

    public void setHistoryNumber(int historyNumber) {
        this.historyNumber = historyNumber;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "MedicalAppointmen{" +
                "date='" + date + '\'' +
                ", shift='" + shift + '\'' +
                ", registrationDoctor=" + registrationDoctor +
                ", historyNumber=" + historyNumber +
                ", reason='" + reason + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public void showData(){
        System.out.println(toString());
    }
}