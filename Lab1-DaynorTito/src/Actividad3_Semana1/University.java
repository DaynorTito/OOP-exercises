package Actividad3_Semana1;

public class University {
    private Student[] students;
    private int quantity;

    public University(){
        students = new Student[50];
        quantity = 0;
    }
    public University(Student[] students, int quantity) {
        this.students = students;
        this.quantity = quantity;
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void addStudent(Student student){
        students[quantity] = student;
        quantity+=1;
    }
    public void filter(String course){
        for (int i = 0; i < quantity; i++) {
            if(students[i].enrolledCourse(course))
                System.out.println(students[i].getName());
        }
    }
    public void showAllStudents(){
        for (int i = 0; i <quantity ; i++) {
            System.out.print("Name: "+students[i].getName()+", Grade: "+students[i].getGrade()+", courses: ");
            int j;
            for (j = 0; j < students[i].getQuantityCourses()-1; j++) {
                System.out.print(students[i].getCourses()[j]+", ");
            }
            System.out.println(students[i].getCourses()[j]);
        }
    }
}