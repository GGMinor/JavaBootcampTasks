package Tasks_Day_3.T5;

public class Vehicle {
    int speed;
    int maxSpeed;

    Vehicle(int speed, int maxSpeed){
        this.speed=speed;
        this.maxSpeed=maxSpeed;
    }

    public void speedUp(int speed){
        if(this.speed+speed>maxSpeed){
            System.out.println("Above speed limit!");
        }else if(speed<0){
            System.out.println("Incorrect speed value!");
        }else{
            this.speed=this.speed+speed;
        }
    }

    public void slowDown(int speed){
        if(this.speed-speed<0){
            System.out.println("Speed can't go above 0!");
        }else if(speed<0){
            System.out.println("Incorrect speed value!");
        }else{
            this.speed=this.speed-speed;
        }
    }
}
