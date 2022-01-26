package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ChatMessageRepository {
    public ArrayList<String> list ;

    public ChatMessageRepository() {
        this.list =  new ArrayList<String>(10);
    }

    public void addChatMessage(String message)
    {
        list.add(message);
    }
    public List<String> getLastTenMessages()
    {
        if (list.size() < 9)
        {
            return list.subList(0, list.size());
        }
        else
        {
            return list.subList(Math.max(list.size() - 10, 0), list.size());
        }

    }

}
