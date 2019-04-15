package homework.homeworks.buildingclasses.entity;

public class MailMessage extends Message<String> {

    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}
