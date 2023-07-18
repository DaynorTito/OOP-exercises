package university.laboratoryii.hospital;

public class Person {

    private String name;
    private String lastName;
    private String address;
    private String ci;
    private int telephneNumber;

    public Person(){}
    public Person(String name, String lastName, String address, String ci, int telephneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.ci = ci;
        this.telephneNumber = telephneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getTelephneNumber() {
        return telephneNumber;
    }

    public void setTelephneNumber(int telephneNumber) {
        this.telephneNumber = telephneNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", ci='" + ci + '\'' +
                ", telephneNumber=" + telephneNumber;
    }

    public void showData(){
        System.out.println(this.toString());
    }
}
