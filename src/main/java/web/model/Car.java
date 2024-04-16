package web.model;

public class Car {
    public int id;
    public int year;
    public String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(int id, int year, String model) {
        this.id = id;
        this.year = year;
        this.model = model;
    }
}
