package Actividad3_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {

    @Test
    public void testUniversityData(){
        University university = new University();
        university.addStudent(new Student("Gery", 1, new String[]{"DataBaseI"}));
        university.addStudent(new Student("Ana", 1, new String[]{"Programming2"}));
        university.addStudent(new Student("Joss", 1, new String[]{"DataBaseI"}));

        university.getStudents()[0].addCourse("DataBaseI");
        university.getStudents()[1].addCourse("OperatingSystems2");

        university.getStudents()[0].setGrade(2);

        assertEquals(2,university.getStudents()[0].getQuantityCourses(),"The quantity courses doesn't match");
        assertEquals(2,university.getStudents()[1].getQuantityCourses(),"The quantity courses doesn't match");
        assertEquals(2,university.getStudents()[0].getGrade(),"Student's grade doesn't match");
    }

}