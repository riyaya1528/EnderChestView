package riyaya1528.paper.enderchestview;

import org.bukkit.plugin.java.JavaPlugin;

public final class EnderChestView extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("enderchest").setExecutor(new Commands());
        System.out.println("[EnderChestView]プラグインが有効になりました");
    }

    @Override
    public void onDisable() {
        System.out.println("[EnderChestView]プラグインが無効になりました");
    }
}
