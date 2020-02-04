package commandPattern.commands.concreteCommands;

import commandPattern.CommandTargets.Sterio;
import commandPattern.commands.Command;

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
