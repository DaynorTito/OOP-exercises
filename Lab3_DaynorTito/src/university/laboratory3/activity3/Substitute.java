package university.laboratory3.activity3;

public class Substitute extends Professor implements Teach{
    private Subject[] subjects;
    private int index;

    public Substitute(){
    }
    public Substitute(String name, Subject[] subjects) {
        super(name);
        this.subjects = subjects;
    }

    public Substitute(String name) {
        super(name);
        subjects = new Subject[4];
        index = 0;
    }

    public void assign(Subject subject) {
        subjects[index++] = subject;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void introduce() {
        System.out.println("I am the substitute professor " + name);
    }

    @Override
    public void teach() {
        if (index > 0) {
            System.out.println("Teaching " + subjects[--index]);
        } else {
            System.out.println("No subjects assigned.");
        }
    }
}
