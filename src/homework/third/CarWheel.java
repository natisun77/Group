package homework.third;

public class CarWheel {
    private float tireStatus;

    public CarWheel() {
        tireStatus = 0.85f;
    }

    public float getTireStatus() {
        return tireStatus;
    }

    public CarWheel(float tireStatus) {
        if (tireStatus > 0 && tireStatus <= 1) {
            this.tireStatus = tireStatus;
        }
    }

    public void changeTire() {
        tireStatus = 1f;
    }

    public void useTire(int tirePartUsed) {
        if (tirePartUsed > 0 && tirePartUsed <= 100) {
            float tireUsed = tirePartUsed * 0.01f;
            if (tireStatus - tireUsed > 0) {
                tireStatus = tireStatus - tireUsed;
            } else {
                System.out.println("Rejected");
            }
        } else {
            System.out.println("Rejected");
        }
    }

    public void tireStatusInfo() {
        System.out.println("The status of tire is " + tireStatus);
    }
}
