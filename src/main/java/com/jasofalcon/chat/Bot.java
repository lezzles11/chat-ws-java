/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jasofalcon.chat;

import com.jasofalcon.message.Message;
import com.jasofalcon.message.MessageType;
import static com.jasofalcon.message.MessageType.USER_JOINED;
import com.jasofalcon.user.User;
import java.util.UUID;

/**
 *
 * @author lesleycheung
 */
public class Bot {
    private User bot; 
    private MessageType type;  
    private Message message; 
    
    public Bot() {
        this.bot = new User();
        bot.setId("bot");
        this.type = USER_JOINED;
        this.message = new Message();
        message.setData("Hello");
        message.setType(type);
        message.setUser(bot);
    }
     public Bot(String name) {
         this.bot = new User();
         bot.setName(name);
         bot.setId("bot");
         this.type = USER_JOINED;
        this.message = new Message();
        message.setData("Hello");
        message.setType(type);
        message.setUser(bot);
    }

    public User getBot() {
        return bot;
    }

    public void setBot(User bot) {
        this.bot = bot;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    
}
