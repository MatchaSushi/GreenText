package me.matcha.greentext;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static java.lang.Character.isLetter;

public class ChatListener implements Listener {

    //Main chat listener event. Changes messages that start with > to green, excluding emotes.
    @EventHandler
    public void AsyncChatEvent(AsyncPlayerChatEvent e) {
        String pMessage = e.getMessage().toLowerCase();
        Player p = e.getPlayer();

        if (pMessage.startsWith(">")) {
            if (isLetter(pMessage.charAt(1))) {
                if (p.hasPermission("greentext.use")) {
                    e.setMessage(ChatColor.GREEN + pMessage);
                }
            }
        }
    }
}