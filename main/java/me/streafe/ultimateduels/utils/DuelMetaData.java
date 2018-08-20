package me.streafe.ultimateduels.utils;

import me.streafe.ultimateduels.Main;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;

public enum DuelMetaData {



    IN_ARENA ("in_arena");

    private static Main main;

    private String meta_name;

    DuelMetaData(String name){
        this.meta_name = name;

    }

    public static void assignTo(Player player, DuelMetaData value){
        player.setMetadata(value.toString(), new FixedMetadataValue(main, true));
    }
}
