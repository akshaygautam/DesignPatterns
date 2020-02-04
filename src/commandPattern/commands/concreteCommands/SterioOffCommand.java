package commandPattern.commands.concreteCommands;

import commandPattern.CommandTargets.Sterio;
import commandPattern.commands.Command;

public class SterioOffCommand implements Command {

	private Sterio sterio;
	
	public SterioOffCommand(Sterio sterio) {
		this.sterio = sterio;
	}
	
	@Override
	public void execute() {
		this.sterio.off();

	}

	@Override
	public void undo() {
		this.sterio.on();
	}

}
