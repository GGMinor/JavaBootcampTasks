package Tasks_Day_3.T5;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main (String[] args){
        SpecificCar Bugatti = new SpecificCar(0, 250, 0, 5, "Bugatti", "Blue");
        Bugatti.speedUp(100);
        Bugatti.speedUp(300);
        Bugatti.speedUp(-10);
        Bugatti.slowDown(50);
        Bugatti.slowDown(300);
        Bugatti.slowDown(-10);
        Bugatti.TurnLeft();
        Bugatti.TurnRight();
        Bugatti.changeGear(2);
        Bugatti.changeGear(6);
        Bugatti.changeGear(-1);
        Bugatti.printCarName();
        Bugatti.printColor();
    }


}
