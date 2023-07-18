package university.laboratoryii.hospital;

public class Main {
    public static void main(String[] args) {
        Specialty specialty1 = new Specialty("General Medicine", "Comprehensive medical care for all ages.", new String []{"General Check-up", "Vaccinations", "Blood Tests"});
        Specialty specialty2 = new Specialty("Dentistry", "Oral health and dental treatments.", new String []{"Cavity Filling", "Root Canal", "Teeth Cleaning"});
        Specialty specialty3 = new Specialty("Physical Therapy", "Rehabilitation and therapeutic services.", new String []{"Physical Therapy", "Massage Therapy", "Exercise Programs"});
        Specialty specialty4 = new Specialty("Radiology", "Medical imaging and diagnostic procedures.", new String []{"X-rays", "MRI", "Ultrasound"});
        Specialty specialty5 = new Specialty("Ophthalmology", "Eye care and vision correction.", new String []{"Eye Exams", "Glasses and Contact Lenses", "Eye Surgeries"});
        Doctor doc1 = new Doctor("John", "Smith", "123 Main St", "123456789", 5551234,
                "Radiology", true, new Schedule[]{
                new Schedule("Monday", "8:00 AM - 12:00 PM"),
                new Schedule("Tuesday", "2:00 PM - 6:00 PM"),
                new Schedule("Friday", "10:00 AM - 4:00 PM")
        }, 4567);
        Doctor doc2 = new Doctor("Jane", "Doe", "456 Oak St", "987654321", 5559873,
                "Pediatrician", false, new Schedule[] {
                new Schedule("Wednesday", "9:00 AM - 1:00 PM"),
                new Schedule("Thursday", "3:00 PM - 7:00 PM")
        }, 6789);
        Patient pat1 = new Patient("Alice", "Johnson", "123 Main St", "123456789", 5551234,
                "1990-05-15", 1001);
        Patient pat2 = new Patient("Bob", "Smith", "456 Oak St", "987654321", 5559876,
                "1985-09-30", 1002);
        Patient pat3 = new Patient("Eve", "Davis", "789 Elm St", "456789123", 5554567,
                "1998-11-22", 1003);

        Hospital hospital = new Hospital("Greenwood Hospital", new Specialty[]{specialty1, specialty2, specialty3, specialty4, specialty5},5);
        hospital.registerDoctor(doc1);
        hospital.registerDoctor(doc2);
        hospital.registerPatient(pat1);
        hospital.registerPatient(pat2);
        hospital.registerPatient(pat3);

        hospital.showSpecialties();
        System.out.println();
        hospital.showDoctors();
        System.out.println();
        hospital.showPatients();
        System.out.println();
        hospital.verifySpecialty("Dentistry");
        System.out.println();
        hospital.verifyService("X-rays");
        System.out.println();
        hospital.searchDoctor("Jane");
        System.out.println();
        hospital.scheduleAppointment(doc1,pat1,"Dentistry","07/20/2023","morning","tooth pain");
        hospital.getAppointments().showData();

    }
}