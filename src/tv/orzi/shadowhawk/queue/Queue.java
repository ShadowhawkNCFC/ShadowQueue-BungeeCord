package tv.orzi.shadowhawk.queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import tv.orzi.shadowhawk.queue.utils.CMS;

/**
 * Upcoming features:
 * <p>
 * <p>
 * - Multiple server targets
 * 
 * @param queueName
 */
public class Queue {

	public static List<Queue> allQueues = new ArrayList<Queue>();
	public static Map<UUID, Queue> queueing = new HashMap<UUID, Queue>();

	public String queueName;
	public List<UUID> members;
	public List<UUID> priorityMembers; // Permission: "shadowqueue.priority.<queueName>", joining picks 1 member from
										// normal, 1 from priority, flip-flopping
	public String priorityPermission;
	public ServerInfo target;
	public int tsCapacity;

	/**
	 * Tethering to be added soon
	 * 
	 * @param queueName
	 * @param targetServer
	 */
	public Queue(String queueName, ServerInfo targetServer, int targetServerCapacity) {
		this.queueName = queueName;
		priorityPermission = "shadowqueue.priority." + queueName;
		target = targetServer;
	}

	public boolean joinQueue(ProxiedPlayer p) {
		if (queueing.containsKey(p.getUniqueId()) && queueing.get(p.getUniqueId()) != this) {
			CMS.msg(p,
					ChatColor.BLUE + "Queue > " + ChatColor.RED + "You can't join the queue for " + queueName
							+ ", you're still queuing for " + queueing.get(p.getUniqueId()).queueName + "! "
							+ ChatColor.DARK_GREEN + "To join this queue, /leavequeue first!");
			return false;
		}
		if(target.)
	}

}
