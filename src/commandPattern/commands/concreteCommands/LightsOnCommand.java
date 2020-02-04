package commandPattern.commands.concreteCommands;

import commandPattern.CommandTargets.Light;
import commandPattern.commands.Command;

public class LightsOnCommand implements Command {
	private Light light;
	public LightsOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
