package Interfaces;

public class Car implements Vehicle {
    // Since we defined methods in the interface, we have to define them in the class since there's no content in the interface methods
    
    private int gear =  0;
    private int speed = 0;

    public void changeGear(int gear) {
        this.gear = gear;        
    }

    public void speedUp(int change) {
        this.speed += change;
    }

    public void slowDown(int change) {
        this.speed -= change;
    }

    public void display() {
        System.out.println("I am a car going " + this.speed + "mph and I am in gear " + this.gear);
        out();
    }

}
