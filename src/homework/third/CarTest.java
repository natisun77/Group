package homework.third;

public class CarTest {

    public static void main(String[] args) {
     /*   CarDoor myCarDoor = new CarDoor();
        myCarDoor.carDoorInfo();
        myCarDoor.closeWindow();
        myCarDoor.closeDoor();
        myCarDoor.carDoorInfo();
        myCarDoor.openWindow();
        myCarDoor.openDoor();
        myCarDoor.carDoorInfo(); */


     /*   CarWheel myCarWheel = new CarWheel(0.5f);
        myCarWheel.tireStatusInfo();
        myCarWheel.changeTire();
        myCarWheel.tireStatusInfo();
        myCarWheel.useTire(65);
        myCarWheel.tireStatusInfo();
        myCarWheel.useTire(37);
        myCarWheel.tireStatusInfo();*/

        Car myCar = new Car(2010, "V3", 210, 10, 5, 0, 0);
        myCar.carInfo();
        myCar.setCurrentSpeed(60);
        myCar.carInfo();
        myCar.getPax();
        myCar.getPax();
        myCar.addWheels(2);
        myCar.carInfo();
        myCar.setCurrentSpeed(60);
        myCar.carInfo();
        myCar.dropPax();
        myCar.carInfo();
        myCar.dropAllPax();
        myCar.carInfo();
        myCar.getPax();
        myCar.getPax();
        myCar.getPax();
        myCar.getPax();
        myCar.getPax();
        myCar.getPax();
        myCar.carInfo();





    }
}