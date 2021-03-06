package pl.zajaczek.thymleafHelloWorld;

public class Car {

    private String model;
    private String mark;

    public Car() {
    }

    public Car(String mark, String model) {
        this.model = model;
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("Car: mark: %s, model %s", getMark(), getModel());
    }
}
