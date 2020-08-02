package tv.orzi.shadowhawk.queue.utils;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class CMS {
	
	public static boolean msg(CommandSender cs, String message) {
		try {
			cs.sendMessage(TextComponent.fromLegacyText(message));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean msg(ProxiedPlayer p, String message) {
		try {
			p.sendMessage(TextComponent.fromLegacyText(message));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
