package lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository {
    public ArrayList<String> list = new ArrayList<>(10);

    public void addChatMessage(String message)
    {
        list.add(message);
    }
    public List<String> getLastTenMessages()
    {
        if (list.size() > 11) {
            list.remove(0);
        }
        return list.subList(Math.max(list.size() - 10, 0), list.size());
    }
}
