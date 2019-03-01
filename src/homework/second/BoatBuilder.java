package homework.second;
// 2.1 builder
public class BoatBuilder {

    private final String name;
    private final String color;
    private final int seats;
    private final int speed;
    private final boolean isEngine;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngine() {
        return isEngine;
    }

    private BoatBuilder(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.seats = builder.seats;
        this.speed = builder.speed;
        this.isEngine = builder.isEngine;
    }

   public static class Builder {

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

        public BoatBuilder build() {
            return new BoatBuilder(this);
        }
    }
}
