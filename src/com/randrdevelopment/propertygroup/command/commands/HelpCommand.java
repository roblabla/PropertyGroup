package com.randrdevelopment.propertygroup.command.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.randrdevelopment.propertygroup.command.BaseCommand;
import com.randrdevelopment.propertygroup.PropertyGroup;

public class HelpCommand extends BaseCommand{
	public HelpCommand(PropertyGroup plugin) {
		super(plugin);
		name = "Help";
		description = "Plugin Help.";
		usage = "/property help";
		minArgs = 0;
		maxArgs = 0;
		identifiers.add("property help");
	}
		
	@Override
	public void execute(CommandSender sender, String[] args) {
		sender.sendMessage(plugin.getTag() + "Plugin Help");
		sender.sendMessage(plugin.getTag() + "/property creategroup <groupname>");
		sender.sendMessage(plugin.getTag() + "/property setstartpoint");
		sender.sendMessage(plugin.getTag() + "/property setsize <rows> <cols>");
		sender.sendMessage(plugin.getTag() + "/property set <option> <value>");
		sender.sendMessage(plugin.getTag() + "/property savegroup");
		sender.sendMessage(plugin.getTag() + "/property listgroups");
		sender.sendMessage(plugin.getTag() + "/property createproperty <groupname> [user]");
		sender.sendMessage(plugin.getTag() + "/property deleteproperty <property>");
		sender.sendMessage(plugin.getTag() + "/property addtoproperty <player> [property]");
		sender.sendMessage(plugin.getTag() + "/property tp");
		sender.sendMessage(plugin.getTag() + "/property showregion");
		sender.sendMessage(plugin.getTag() + "/property hideregion");		
		sender.sendMessage(plugin.getTag() + "/property reload");
		//TODO: Create Help
	}
}
