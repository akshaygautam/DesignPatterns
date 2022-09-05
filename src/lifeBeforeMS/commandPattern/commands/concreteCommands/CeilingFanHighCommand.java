package lifeBeforeMS.commandPattern.commands.concreteCommands;

import lifeBeforeMS.commandPattern.CommandTargets.CeilingFan;
import lifeBeforeMS.commandPattern.commands.Command;

public class CeilingFanHighCommand implements Command {
	private CeilingFan ceilingFan;
	private int prevSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.high();
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