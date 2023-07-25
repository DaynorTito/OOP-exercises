package university.laboratory3.activity3;

public abstract class Professor {
    protected String name;


    public Professor(String name) {
        this.name = name;
    }
    public Professor(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void introduce();
}
