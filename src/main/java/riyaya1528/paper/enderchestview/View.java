package riyaya1528.paper.enderchestview;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class View {
    public static void ViewEnderChest(Player FromPlayer, Player ToPlayer) {
        Inventory EnderChest = FromPlayer.getEnderChest();

        ToPlayer.openInventory(EnderChest);
    }
}
