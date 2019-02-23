package firsthomework;
//1.3
public class Power {
    public Power() {
    }

    public void makePower(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        System.out.println("The number "+ number + " in power " + power + " will be " + result);
    }


    public static void main(String[] arg) {
        Power myPower = new Power();
        myPower.makePower(10, 4);


    }

}
