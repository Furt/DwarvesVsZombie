package me.furt.dvz.command;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import me.furt.dvz.DwarvesVsZombies;
import me.furt.dvz.references.GUIs;
import me.furt.dvz.references.Messages;
import me.furt.dvz.references.Names;

public class CommandAdmin extends CommandDVZ {
	
	@Override
    public String getCommandName()
    {
        return Names.Commands.ADMIN_PANEL;
    }

    @Override
    public int getRequiredPermissionLevel()
    {
        return 2;
    }

    @Override
    public String getCommandUsage(ICommandSender commandSender)
    {
        return Messages.Commands.ADMIN_USAGE;
    }

    @Override
    public void processCommand(ICommandSender commandSender, String[] args)
    {
        EntityPlayer entityPlayer = (EntityPlayer) commandSender;
        entityPlayer.openGui(DwarvesVsZombies.instance, GUIs.ADMIN_PANEL.ordinal(), entityPlayer.worldObj, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
    }

}
