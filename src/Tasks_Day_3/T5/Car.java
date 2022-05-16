package Tasks_Day_3.T5;

public class Car extends Vehicle {
    int gear;
    int maxGear;

    Car(int speed, int maxSpeed, int gear, int maxGear) {
        super(speed, maxSpeed);
        this.gear=gear;
        this.maxGear=maxGear;
    }

    public void changeGear(int gear){
        if(gear<0 || gear>this.maxGear){
            System.out.println("Incorrect gear value!");
        } else{
            this.gear=gear;
        }
    }

    public void TurnLeft(){
        System.out.println("Turning Left!");
    }

    public void TurnRight(){
        System.out.println("Turning Right!");
    }
}
