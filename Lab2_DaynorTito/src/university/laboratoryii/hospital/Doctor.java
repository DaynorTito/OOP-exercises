package university.laboratoryii.hospital;

public class Doctor extends Person{

    private String specialty;
    private boolean available;
    private Schedule schedules[];
    private int registrationNumber;

    public Doctor(){}
    public Doctor(String specialty, boolean available, Schedule[] schedules, int registrationNumber) {
        this.specialty = specialty;
        this.available = available;
        this.schedules = schedules;
        this.registrationNumber = registrationNumber;
    }

    public Doctor(String name, String lastName, String address, String ci, int telephneNumber, String specialty, boolean available, Schedule[] schedules, int registrationNumber) {
        super(name, lastName, address, ci, telephneNumber);
        this.specialty = specialty;
        this.available = available;
        this.schedules = schedules;
        this.registrationNumber = registrationNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Schedule[] getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedule[] schedules) {
        this.schedules = schedules;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void showSchedules(Schedule[] schedules){
        for (int i = 0; i < schedules.length; i++) {
            schedules[i].showSchedule();
        }
    }
    @Override
    public String toString() {
        return super.toString()+" " +
                "specialty='" + specialty + '\'' +
                ", available=" + available +
                ", registrationNumber=" + registrationNumber +
                '}';
    }
    @Override
    public void showData(){
        System.out.println(toString());
        System.out.println("schedules=");
        showSchedules(schedules);
    }
}
