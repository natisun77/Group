package homework.seventh.singleton;

public final class Singleton {
    private static Singleton example;
    private String value;

    public String getValue() {
        return value;
    }

    private Singleton() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        value = "V5";
    }

    public static Singleton getInstance() {
        if (example == null) {
            example = new Singleton();
        }
        return example;
    }

}
