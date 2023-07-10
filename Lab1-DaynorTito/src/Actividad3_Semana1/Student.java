package Actividad3_Semana1;

public class Student {

    private String name;
    private int grade;
    private String[] courses;
    private int quantityCourses;

    public Student(){
        courses = new String[50];
        quantityCourses = 0;
    }
    public Student(String name, int grade, String[] courses, int quantityCourses) {
        this.name = name;
        this.grade = grade;
        this.courses = new String[50];
        for (int i = 0; i < courses.length; i++) {
            this.courses[i] = courses[i];
        }
        this.quantityCourses = quantityCourses;
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

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public void addCourse(String courseName){
        courses[quantityCourses] = courseName;
        quantityCourses+=1;
    }

    public int getQuantityCourses() {
        return quantityCourses;
    }

    public void setQuantityCourses(int quantityCourses) {
        this.quantityCourses = quantityCourses;
    }

    public boolean enrolledCourse(String nameCourse){
        for (int i = 0; i < quantityCourses; i++) {
            if(courses[i].equalsIgnoreCase(nameCourse))
                return true;
        }
        return false;
    }
}
