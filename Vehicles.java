package mypack;

public class Vehicles {
    private String make;
    private String model;
    private  int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start(){
        System.out.println("Start");
    }
    public void stop(){
        System.out.println("Stop");
    }
}
