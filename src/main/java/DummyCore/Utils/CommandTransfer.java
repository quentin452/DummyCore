package DummyCore.Utils;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

public class CommandTransfer extends CommandBase {

	@Override
	public String getCommandName() {
		return "DummyCore.Transfer";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/DummyCore.Transfer <player> <dimensionID>";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
    	int var3 = parseIntWithMin(sender, args[1], Integer.MIN_VALUE);
        EntityPlayerMP player = args.length == 0 ? getCommandSenderAsPlayer(sender) : getPlayer(sender, args[0]);
        player.travelToDimension(var3);
	}

}
