package university.laboratoryii.hospital;

public class AppointmentRegistration {

    private MedicalAppointmen[] listAppointments;
    private int numberAppointments;

    public AppointmentRegistration(){
        listAppointments = new MedicalAppointmen[900];
        numberAppointments = 0;
    }
    public AppointmentRegistration(MedicalAppointmen[] listAppointments, int numberAppointments) {
        this.listAppointments = listAppointments;
        this.numberAppointments = numberAppointments;
    }

    public MedicalAppointmen[] getListAppointments() {
        return listAppointments;
    }

    public void setListAppointments(MedicalAppointmen[] listAppointments) {
        this.listAppointments = listAppointments;
    }

    public int getNumberAppointments() {
        return numberAppointments;
    }

    public void setNumberAppointments(int numberAppointments) {
        this.numberAppointments = numberAppointments;
    }

    public void addAppointment(MedicalAppointmen appointment){
        if (numberAppointments >= listAppointments.length) {
            throw new AppointmentException("No se pueden agregar más citas, se alcanzó el límite máximo.");
        }
        listAppointments[numberAppointments] = appointment;
        numberAppointments += 1;
    }
    public void showData(){
        for (int i = 0; i < numberAppointments; i++) {
            listAppointments[i].showData();
        }
    }

}
