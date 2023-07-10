package Actividad3_Semana1;

public class Main {

    public static void main(String[] args) {
        University university = new University();
        university.addStudent(new Student("Gery", 1, new String[]{"DataBaseI"},1));
        university.addStudent(new Student("Ana", 1, new String[]{"Programming2"},1));
        university.addStudent(new Student("Joss", 1, new String[]{"DataBaseI"},1));

        university.getStudents()[0].addCourse("DataBaseI");
        university.getStudents()[1].addCourse("OperatingSystems2");

        university.getStudents()[0].setGrade(2);

        System.out.println("Students enrolled in DataBaseI");
        university.filter("DataBaseI");
        System.out.println("\nAll students");
        university.showAllStudents();

    }
}
