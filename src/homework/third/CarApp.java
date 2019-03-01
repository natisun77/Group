package homework.third;

public class CarApp {

    public static void main(String[] args) {
        CarDoor myCarDoor = new CarDoor();
        System.out.println(myCarDoor);
        myCarDoor.closeWindow();
        myCarDoor.closeDoor();
        System.out.println(myCarDoor);
        myCarDoor.openWindow();
        myCarDoor.openDoor();
        System.out.println(myCarDoor);


        CarWheel myCarWheel = new CarWheel(0.5f);
        System.out.println(myCarWheel);
        myCarWheel.changeTire();
        System.out.println(myCarWheel);
        myCarWheel.useTire(65);
        System.out.println(myCarWheel);
        myCarWheel.useTire(37);
        System.out.println(myCarWheel);

        Car myCar = new Car(2010, "V3", 210, 10, 5, 0, 0);
        System.out.println(myCar);
        myCar.setCurrentSpeed(60);
        System.out.println(myCar);
        myCar.getPax();
        myCar.getPax();
        myCar.addWheels(2);
        System.out.println(myCar);
        myCar.setCurrentSpeed(60);
        System.out.println(myCar);
        myCar.dropPax();
        System.out.println(myCar);
        myCar.dropAllPax();
        System.out.println(myCar);
        myCar.getPax();
        myCar.getPax();
        myCar.getPax();
        myCar.getPax();
        myCar.getPax();
        myCar.getPax();
        System.out.println(myCar);
        myCar.setCurrentSpeed(90);
        System.out.println(myCar);
    }
}