package university.laboratoryii.hospital;

public class Schedule {
    private String day;
    private String time;

    public Schedule(){ }
    public Schedule(String day, String time) {
        this.day = day;
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public void showSchedule(){
        System.out.println("Day: "+day+" Time: "+time);
    }
}
