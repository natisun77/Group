package homework.seventh.singleton;

public final class Singleton {
    private static volatile Singleton example;
    private String value;

    private Singleton() {
        value = "V5";
    }

    public static Singleton getInstance() {
        Singleton localExp = example;
        if (localExp == null) {
            synchronized (Singleton.class) {
                localExp = example;
                if (localExp == null) {
                    example = localExp = new Singleton();
                }
            }
        }
        return localExp;
    }

    public String getValue() {
        return value;
    }

}
