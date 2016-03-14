package me.furt.dvz.command;

import java.util.ArrayList;
import java.util.List;

import me.furt.dvz.references.Messages;
import me.furt.dvz.references.Names;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class CommandDVZ extends CommandBase {
	
	private static List<CommandBase> modCommands = new ArrayList<CommandBase>();
    private static List<String> commands = new ArrayList<String>();

	@Override
	public String getCommandName() {
		
		return Names.Commands.BASE_COMMAND;
		
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {

		return Messages.Commands.BASE_COMMAND_USAGE;
		
	}

	@Override
    public void processCommand(ICommandSender commandSender, String[] args)
    {
        if (args.length >= 1)
        {
            for (CommandBase command : modCommands)
            {
                if (command.getCommandName().equalsIgnoreCase(args[0]) && command.canCommandSenderUseCommand(commandSender))
                {
                    try {
						command.processCommand(commandSender, args);
					} catch (CommandException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            }
        }
    }

    public List addTabCompletionOptions(ICommandSender commandSender, String[] args)
    {
        if (args.length == 1)
        {
            return getListOfStringsMatchingLastWord(args, commands);
        }
        else if (args.length >= 2)
        {
            for (CommandBase command : modCommands)
            {
                if (command.getCommandName().equalsIgnoreCase(args[0]))
                {
                    return command.addTabCompletionOptions(commandSender, args, null);
                }
            }
        }

        return null;
    }
    
    static {
        modCommands.add(new CommandRunTest());
        modCommands.add(new CommandDebug());
        modCommands.add(new CommandAdmin());

        for (CommandBase commandBase : modCommands) {
            commands.add(commandBase.getCommandName());
        }
    }

}
