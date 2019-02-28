package homework.third;

import java.util.ArrayList;

public class Car {

    private final int yearOfProduction;
    private String engine;
    private int maxSpeed;
    private int accelerationTime;
    private int paxCapacity;
    private int paxInCar;
    private int currentSpeed;
    private ArrayList<CarWheel> wheels;
    private ArrayList<CarDoor> doors;

    public Car(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Car(int yearOfProduction, String engine, int maxSpeed, int accelerationTime, int paxCapacity, int paxInCar, int currentSpeed) {
        this(yearOfProduction);
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = paxCapacity;
        this.paxCapacity = paxCapacity;
        this.paxInCar = paxInCar;
        this.currentSpeed = currentSpeed;
        wheels = new ArrayList<CarWheel>();
        doors = new ArrayList<CarDoor>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new CarWheel());
            doors.add(new CarDoor());
        }
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed < getCurrentPossibleMaxSpeed()) {
            this.currentSpeed = currentSpeed;
        }
    }

    public void getPax() {
        if (paxInCar < paxCapacity) {
            paxInCar++;
        }
    }

    public void dropPax() {
        if (paxInCar >= 1) {
            paxInCar--;
        }
    }

    public void dropAllPax() {
        paxInCar = 0;
        currentSpeed = 0;
    }

    public CarWheel receiveWheel(int numberOfWheel) {
        if (numberOfWheel < wheels.size() && numberOfWheel > 0) {
            return wheels.get(numberOfWheel - 1);
        }
        System.out.println("This wheel does not exist. Try again");
        return null;
    }

    public CarDoor receiveDoor(int numberOfDoor) {
        if (numberOfDoor < wheels.size() && numberOfDoor > 0) {
            return doors.get(numberOfDoor - 1);
        }
        System.out.println("This door does not exist. Try again");
        return null;
    }

    public void takeAwayAllWhels() {
        wheels.clear();
    }

    public void addWheels(int numberOfWheels) {
        for (int i = 1; i <= numberOfWheels; i++) {
            wheels.add(new CarWheel());
        }
    }

    public float getCurrentPossibleMaxSpeed() {
        float currentMaxSpeed = 0;
        if (paxInCar != 0 && wheels.size() > 0) {
            float minWheelStatus = Float.MAX_VALUE;
            for (int i = 0; i < wheels.size(); i++) {
                if (wheels.get(i).getTireStatus() < minWheelStatus) {
                    minWheelStatus = wheels.get(i).getTireStatus();
                }
                currentMaxSpeed = maxSpeed * minWheelStatus;
            }
        }
        return currentMaxSpeed;
    }

    public void carInfo() {
        System.out.println("Car was made in: " + yearOfProduction + ".");
        System.out.println("Car's engine is " + engine + ".");
        System.out.println("The max speed of the car is:  " + maxSpeed + ". Acceleration time for 100km per hour is " + accelerationTime + " sec.");
        System.out.println("Passanger capacity is " + paxCapacity + ". Now we have " + paxInCar + " passangers in car.");
        System.out.println("Current speed is " + currentSpeed + ".");
        System.out.println("Current possible max speed is " + getCurrentPossibleMaxSpeed());
        System.out.println("Car has " + wheels.size() + " wheels and " + doors.size() + " doors.");
        System.out.println();
    }
}
