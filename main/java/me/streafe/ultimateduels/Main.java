package me.streafe.ultimateduels;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){

        getConfig().options().copyDefaults(true);
        saveConfig();

        getCommands();
        getListeners();

    }

    public void getCommands(){

    }

    public void getListeners(){

    }
}
