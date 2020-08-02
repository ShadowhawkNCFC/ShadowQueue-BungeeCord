package tv.orzi.shadowhawk.queue;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Plugin;
import tv.orzi.shadowhawk.queue.utils.CMS;

//Commands: /leavequeue, /joinqueue <gamemode>, /queuestatus / /qs, 
//ADMIN CMD: /queuecontrol
public class QueueMain extends Plugin {
	
	@Override
	public void onEnable() {
		CommandSender ccs = getProxy().getConsole();
		CMS.msg(ccs, ChatColor.BLUE + "Queue > " + ChatColor.GOLD + "Queues starting up!");
	}
	
	

}
