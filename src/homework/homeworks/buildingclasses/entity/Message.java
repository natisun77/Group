package homework.homeworks.buildingclasses.entity;

public abstract class Message<T> {

    private final String FROM;
    private final String TO;
    private final T CONTENT;

    public Message(String FROM, String to, T CONTENT) {
        this.FROM = FROM;
        this.TO = to;
        this.CONTENT = CONTENT;
    }

    public String getFROM() {
        return FROM;
    }

    public String getTo() {
        return TO;
    }

    public T getCONTENT() {
        return CONTENT;
    }
}
