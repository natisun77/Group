package homework.second;
// 2.1 builder
public class BoatMain {
    public static void main(String[] args) {
        BoatBuilder firstBoat = new BoatBuilder.Builder("Raketa")
                .setColor("blue")
                .setSeats(12)
                .setSpeed(250)
                .setIsRngine(true)
                .build();
        System.out.println(firstBoat.getName());
        System.out.println(firstBoat.getColor());
        System.out.println(firstBoat.getSeats());
        System.out.println(firstBoat.getSpeed());
        System.out.println(firstBoat.isEngine());

    }
}
