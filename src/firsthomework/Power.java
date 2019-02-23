package firsthomework;
//1.3
public class Power {
    public Power() {
    }

    public void makeDegree(int number, int power) {
        System.out.println("Квадрат числа " + number + " равен " + number * number);
        System.out.println("Куб числа " + number + " равен " + number * number * number);
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        System.out.println("Результат возведения числа " + number + " в степень " + power + " равен " + result);
    }


    public static void main(String[] arg) {
        Power myPower = new Power();
        myPower.makeDegree(10, 4);


    }

}
