package commandPattern.commands.concreteCommands;

import commandPattern.CommandTargets.Light;
import commandPattern.commands.Command;

public class LightOffCommand implements Command {

	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.off();
	}

	@Override
	public void undo() {
		this.light.on();
	}

}
