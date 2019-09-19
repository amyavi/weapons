package pw.kaboom.weapons;

import org.bukkit.Material;

import org.bukkit.entity.Player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

class PlayerUseWeapon implements Listener {
	@EventHandler
	void onPlayerInteract(PlayerInteractEvent event) {
		if (event.hasItem() == true &&
			event.getItem().getItemMeta().hasDisplayName() == true) {
			final Action action = event.getAction();
			final Material item = event.getMaterial();
			final String name = event.getItem().getItemMeta().getDisplayName();

			if (action == Action.LEFT_CLICK_AIR ||
				action == Action.LEFT_CLICK_BLOCK) {
				WeaponAnvilDropper.leftClick(item, name, event);
				WeaponArcher.leftClick(item, name, event);
				WeaponArmageddon.leftClick(item, name, event);
				WeaponBlobinator.leftClick(item, name, event);
				WeaponLightningStick.leftClick(item, name, event);
				WeaponNuker.leftClick(item, name, event);
				WeaponSniper.leftClick(item, name, event);
			} else if (action == Action.RIGHT_CLICK_AIR ||
				action == Action.RIGHT_CLICK_BLOCK) {
				WeaponGrenade.rightClick(item, name, event);
				WeaponLaser.rightClick(item, name, event);
				WeaponMachineGun.rightClick(item, name, event);
				WeaponSniper.rightClick(item, name, event);
			}
		}
	}
}
