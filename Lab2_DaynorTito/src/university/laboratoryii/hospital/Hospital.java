package university.laboratoryii.hospital;

public class Hospital {

    private String name;
    private Patient[] patientRegistry;
    private Doctor[] doctorRegistry;
    private int numberDoctors, numberPatients, numberSpecialties;
    private Specialty[] specialties;
    private AppointmentRegistration appointments;
    private static final int MAX_PATIENTS = 200;
    private static final int MAX_DOCTORS = 100;
    private static final int MAX_SPECIALTIES = 50;


    public Hospital(){}

    public Hospital(String name, Specialty[] specialties, int numberSpecialties) {
        this.name = name;
        this.patientRegistry = new Patient[MAX_PATIENTS];
        this.numberPatients = 0;
        this.doctorRegistry = new Doctor[MAX_DOCTORS];
        this.numberDoctors = 0;
        this.specialties = specialties;
        this.numberSpecialties = numberSpecialties;
        this.appointments = new AppointmentRegistration();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Patient[] getPatientRegistry() {
        return patientRegistry;
    }

    public void setPatientRegistry(Patient[] patientRegistry) {
        this.patientRegistry = patientRegistry;
    }

    public int getNumberPatients() {
        return numberPatients;
    }

    public void setNumberPatients(int numberPatients) {
        this.numberPatients = numberPatients;
    }

    public Doctor[] getDoctorRegistry() {
        return doctorRegistry;
    }

    public void setDoctorRegistry(Doctor[] doctorRegistry) {
        this.doctorRegistry = doctorRegistry;
    }

    public int getNumberDoctors() {
        return numberDoctors;
    }

    public void setNumberDoctors(int numberDoctors) {
        this.numberDoctors = numberDoctors;
    }

    public Specialty[] getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Specialty[] specialties) {
        this.specialties = specialties;
    }

    public int getNumberSpecialties() {
        return numberSpecialties;
    }

    public void setNumberSpecialties(int numberSpecialties) {
        this.numberSpecialties = numberSpecialties;
    }

    public AppointmentRegistration getAppointments() {
        return appointments;
    }

    public void setAppointments(AppointmentRegistration appointments) {
        this.appointments = appointments;
    }

    public void showPatients(){
        System.out.println("All Patients:");
        for (int i = 0; i < this.numberPatients; i++)
            patientRegistry[i].showData();
    }

    public void showDoctors(){
        System.out.println("All Doctors:");
        for (int i = 0; i < this.numberDoctors; i++)
            doctorRegistry[i].showData();
    }

    public void showSpecialties(){
        System.out.println("All Specialties:");
        for (int i = 0; i < this.numberPatients; i++)
            specialties[i].showData();
    }

    public void registerPatient(Patient patient) {
        if (numberPatients >= MAX_PATIENTS) {
            throw new PatientRegistrationException("No more patients can be registered, the maximum limit has been reached.");
        }
        patientRegistry[numberPatients] = patient;
        numberPatients += 1;
    }

    public void registerDoctor(Doctor doctor) {
        if (numberDoctors >= MAX_DOCTORS) {
            throw new DoctorRegistrationException("No more doctors can be registered, the maximum limit has been reached.");
        }
        doctorRegistry[numberDoctors] = doctor;
        numberDoctors += 1;
    }
    public void addSpecialty(Specialty specialty) throws SpecialtyAddException {
        if (numberSpecialties >= MAX_SPECIALTIES) {
            throw new SpecialtyAddException("No se pueden agregar más especialidades, se alcanzó el límite máximo.");
        }
        specialties[numberSpecialties] = specialty;
        numberSpecialties += 1;
    }
    public boolean checkSpecialty(String name){
        for (int i = 0; i < numberSpecialties; i++) {
            if (specialties[i].getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    public void verifySpecialty(String name){
        if (checkSpecialty(name)) {
            System.out.println("The hospital DOES have a specialty in: " + name + "\nThe doctors in this specialty are:");
            for (int j = 0; j < numberDoctors; j++) {
                if (doctorRegistry[j].getSpecialty().equalsIgnoreCase(name))
                    doctorRegistry[j].showData();
            }
        }else {
            System.out.println("The hospital does not have the specialty:" + name);
        }
    }
    public boolean checkService(String name){
        for (int i = 0; i < numberSpecialties; i++) {
            for (int j = 0; j < specialties[i].getServices().length; j++) {
                if (specialties[i].getServices()[j].equalsIgnoreCase(name)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void verifyService(String name){
        boolean sw = false;
        for (int i = 0; i < numberSpecialties; i++) {
            for (int j = 0; j < specialties[i].getServices().length; j++) {
                if(specialties[i].getServices()[j].equalsIgnoreCase(name)){
                    System.out.println("The hospital does have the service of: "+name+" in the specialty of: "+specialties[i].getName()+ "\nThe doctors in this specialty are:");
                    for (int k = 0; k < numberDoctors; k++) {
                        if (doctorRegistry[k].getSpecialty().equalsIgnoreCase(specialties[i].getName()))
                            doctorRegistry[k].showData();
                    }
                    sw = true;
                    break;
                }
            }
        }
        if(!sw)
            System.out.println("The hospital does not have the specialty:"+name);
    }
    public boolean checkDoctor(String name){
        for (int i = 0; i < numberDoctors; i++) {
            if (doctorRegistry[i].getName().equalsIgnoreCase(name)) {
                return true;
            }
        } return false;
    }

    public int getNumerDoctor(String name){
        for (int i = 0; i < numberDoctors; i++) {
            if (doctorRegistry[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        } return 0;
    }
    public void searchDoctor(String name){
        if(checkDoctor(name)){
            if(doctorRegistry[getNumerDoctor(name)].isAvailable()){
                System.out.println("The doctor is available and has the schedules:");
                for (int j = 0; j < doctorRegistry[getNumerDoctor(name)].getSchedules().length; j++) {
                    System.out.println(doctorRegistry[getNumerDoctor(name)].getSchedules()[j]);
                }
            } else {
                System.out.println("The doctor is not available");
            }
        }

    }
    public void scheduleAppointment(Doctor doc, Patient pat, String specialty, String date, String shift, String reason){
        MedicalAppointmen med = new MedicalAppointmen(date,shift,doc.getRegistrationNumber(),pat.getHistoryNumber(),specialty,reason);
        appointments.addAppointment(med);
    }

}
