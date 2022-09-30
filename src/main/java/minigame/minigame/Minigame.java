package minigame.minigame;

import minigame.minigame.manager.ArenaManager;
import minigame.minigame.manager.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Minigame extends JavaPlugin {

    private ArenaManager arenaManager;

    @Override
    public void onEnable() {
        ConfigManager.setupConfig(this);

        arenaManager = new ArenaManager(this);
    }

    public ArenaManager getArenaManager() { return arenaManager; }
}
