package lifeBeforeMS.commandPattern.commands.concreteCommands;

import lifeBeforeMS.commandPattern.CommandTargets.Sterio;
import lifeBeforeMS.commandPattern.commands.Command;

public class SterioOnCommand implements Command {

private Sterio sterio;
	
	public SterioOnCommand(Sterio sterio) {
		this.sterio = sterio;
	}
	
	@Override
	public void execute() {
		this.sterio.on();

	}

	@Override
	public void undo() {
		this.sterio.off();
	}

}
