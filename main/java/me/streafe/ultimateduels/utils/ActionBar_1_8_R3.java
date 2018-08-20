package me.streafe.ultimateduels.utils;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ActionBar_1_8_R3 implements ActionBar{

    public void sendActionBar(Player player, String message) {
        IChatBaseComponent ICBC = IChatBaseComponent.ChatSerializer.a("{\"text\":" + message + "\"}");

        PacketPlayOutChat bar = new PacketPlayOutChat(ICBC, (byte) 2);

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(bar);
    }
}
