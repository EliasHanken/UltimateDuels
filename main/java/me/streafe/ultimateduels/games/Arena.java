package me.streafe.ultimateduels.games;

import me.streafe.ultimateduels.Main;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Arena {

    private Location spawn1;
    private Location spawn2;
    private int task_id;
    private Player winner;
    private Player loser;
    private Player player1;
    private Player player2;
    private Main main;
    private boolean duel_started = false;
    private boolean is_available = true;
    private String name;

    public Arena(String name, Location spawn1, Location spawn2){
        if(name == ""){
            return;
        }
    }
}
