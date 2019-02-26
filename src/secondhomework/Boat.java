package secondhomework;
// 2.1 builder
public class Boat {
    String name;
    String color;
    int seats;
    int speed;
    boolean isEngine;

    private Boat(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.seats = builder.seats;
        this.speed = builder.speed;
        this.isEngine = builder.isEngine;
    }

    static class Builder {

        private String name;
        private String color;
        private int seats;
        private int speed;
        private boolean isEngine;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setIsRngine(boolean isEngine) {
            this.isEngine = isEngine;
            return this;
        }

        public Boat build() {
            return new Boat(this);
        }
    }

    public static void main(String[] args) {
        Boat firstBoat = new Boat.Builder("Raketa").setColor("blue").setSeats(12).setSpeed(250).setIsRngine(true).build();
        System.out.println(firstBoat.name);
        System.out.println(firstBoat.color);
        System.out.println(firstBoat.seats);
        System.out.println(firstBoat.speed);
        System.out.println(firstBoat.isEngine);

    }


}
