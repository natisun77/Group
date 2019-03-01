package homework.third;

public class CarDoor {
    private boolean isDoorOpen;
    private boolean isWindowOpen;

    public CarDoor() {
    }

    public CarDoor(boolean isDoorOpen, boolean isWindowOpen) {
        this.isDoorOpen = isDoorOpen;
        this.isWindowOpen = isWindowOpen;
    }

    public void openDoor() {
        if (!isDoorOpen) {
            isDoorOpen = true;
        }
    }

    public void closeDoor() {
        if (isDoorOpen) {
            isDoorOpen = false;
        }
    }

    public void openOrCloseDoor() {
        if (!isDoorOpen) {
            openDoor();
        } else {
            closeDoor();
        }
    }

    public void openWindow() {
        if (!isWindowOpen) {
            isWindowOpen = true;
        }
    }

    public void closeWindow() {
        if (isWindowOpen) {
            isWindowOpen = false;
        }
    }

    public void openOrCloseWindow() {
        if (!isWindowOpen) {
            openWindow();
        } else {
            closeWindow();
        }
    }

    @Override
    public String toString() {
        return (isDoorOpen ? "The doors are open. " : "The doors are closed. ") +
                (isWindowOpen ? "The windows are open." : "The windows are closed.");
    }
}
