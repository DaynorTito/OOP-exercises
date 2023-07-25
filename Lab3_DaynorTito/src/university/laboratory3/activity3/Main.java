package university.laboratory3.activity3;

public class Main {
    public static void main(String[] args) {

        Professor titular = new Titular("Titular Professor", Subject.SCIENCE);
        titular.introduce();
        ((Teach) titular).teach();

        Professor substitute = new Substitute("Substitute Professor");
        substitute.introduce();
        ((Substitute) substitute).assign(Subject.SCIENCE);
        ((Substitute) substitute).assign(Subject.PHYSICAL_EDUCATION);
        ((Substitute) substitute).assign(Subject.MUSIC);

        ((Teach) substitute).teach();
        ((Teach) substitute).teach();
        ((Teach) substitute).teach();
        ((Teach) substitute).teach();
    }
}
