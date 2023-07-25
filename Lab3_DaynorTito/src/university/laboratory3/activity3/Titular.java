package university.laboratory3.activity3;

public class Titular extends Professor implements Teach{
    private Subject subject;

    public Titular(String name, Subject subject) {
        super(name);
        this.subject = subject;
    }

    public Titular(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("I am the titular professor " + name);
    }

    @Override
    public void teach() {
        System.out.println("Teaching " + subject);
    }
}
