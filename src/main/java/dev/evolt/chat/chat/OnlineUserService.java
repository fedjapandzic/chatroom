package dev.evolt.chat.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class OnlineUserService {

    private Set<String> onlineUsers = ConcurrentHashMap.newKeySet();

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    public void addUser(String username) {
        onlineUsers.add(username);
        sendOnlineUsers();
    }

    public void removeUser(String username) {
        onlineUsers.remove(username);
        sendOnlineUsers();
    }

    private void sendOnlineUsers() {
        messagingTemplate.convertAndSend("/topic/onlineUsers", onlineUsers);
    }

    public Set<String> getOnlineUsers() {
        return onlineUsers;
    }
}
