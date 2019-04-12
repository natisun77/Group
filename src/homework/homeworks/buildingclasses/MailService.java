package homework.homeworks.buildingclasses;

import homework.homeworks.buildingclasses.entity.Message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message<T>> {

    private Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                if (!containsKey(key)) {
                    return Collections.emptyList();
                }
                return super.get(key);
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Message<T> message) {
        if (!mailBox.containsKey(message.getTo())) {
            mailBox.put(message.getTo(), new ArrayList<>());
        }
        mailBox.get(message.getTo()).add(message.getContent());
    }
}
