package web.model;

public class Car {

    private int yearModel;
    private String model;
    private int speed;

    public Car() {
    }

    public Car(int yearModel, String model, int speed) {
        this.yearModel = yearModel;
        this.model = model;
        this.speed = speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
