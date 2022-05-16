package Tasks_Day_3.T5;

public class SpecificCar extends Car {

    String carName;
    String color;

    SpecificCar(int speed, int maxSpeed, int gear, int maxGear, String carName, String color) {
        super(speed, maxSpeed, gear, maxGear);
        this.carName=carName;
        this.color=color;
    }

    public void printCarName(){
        System.out.println("Your car is - " + this.carName);
    }

    public void printColor(){
        System.out.println("Your cars color is - " + this.color);
    }
}
