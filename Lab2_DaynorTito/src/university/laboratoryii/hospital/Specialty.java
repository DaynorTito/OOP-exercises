package university.laboratoryii.hospital;

import java.util.Arrays;

public class Specialty {
    private String name;
    private String description;
    private String[] services;

    public Specialty(){}

    public Specialty(String name, String description, String[] services) {
        this.name = name;
        this.description = description;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", services=" + Arrays.toString(services) +
                '}';
    }

    public void showData(){
        System.out.println(toString());
    }


}
