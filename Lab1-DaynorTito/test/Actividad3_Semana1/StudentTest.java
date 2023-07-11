package Actividad3_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testStudentQuantityCourses(){
        Student student1 = new Student("Gery", 1, new String[]{"DataBaseI"});
        Student student2 = new Student("Ana", 1, new String[]{"Programming2"});
        Student student3 = new Student("Joss", 1, new String[]{"DataBaseI"});
        assertEquals(1,student1.getQuantityCourses(),"The quantity courses doesn't match");
        assertEquals(1,student2.getQuantityCourses(),"The quantity courses doesn't match");
        assertEquals(1,student3.getQuantityCourses(),"The quantity courses doesn't match");
    }

}