package commandPattern.commands.concreteCommands;

import commandPattern.CommandTargets.CeilingFan;
import commandPattern.commands.Command;

public class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.off();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH)
			this.ceilingFan.high();

		if (prevSpeed == CeilingFan.MEDIUM)
			this.ceilingFan.medium();

		if (prevSpeed == CeilingFan.LOW)
			this.ceilingFan.low();

		if (prevSpeed == CeilingFan.OFF)
			this.ceilingFan.off();
	}

}
