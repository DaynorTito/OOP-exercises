package university.jala.objects;
import university.functions.Sortable;
import university.functions.Unique;

import java.util.Comparator;

/**
 * university.jala.objects.Student.
 */
public class Student implements Unique<Student>, Sortable<Student>, Comparable<Student>{
    private String name;
    private int grade;

    public Student(){

    }

    public boolean equals(Student e){
        if(name.equals(e.getName()) && grade==e.getGrade())
            return true;
        return false;
    }
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public static Comparator<Student> byGrade() {
        return Comparator.comparingInt(Student::getGrade);
    }

    @Override
    public String toString() {
        return "{" + name + "," + grade + "}";
    }

    @Override
    public int compareTo(Student other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(this.grade, other.grade);
    }

    @Override
    public void sort() {

    }

    @Override
    public void sortBy(Comparator<Student> comparator) {

    }

    @Override
    public void unique() {

    }
}
