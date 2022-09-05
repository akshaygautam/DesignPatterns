package lifeBeforeMS.commandPattern;

import lifeBeforeMS.commandPattern.CommandTargets.CeilingFan;
import lifeBeforeMS.commandPattern.CommandTargets.Light;
import lifeBeforeMS.commandPattern.CommandTargets.Sterio;
import lifeBeforeMS.commandPattern.commands.Command;
import lifeBeforeMS.commandPattern.commands.concreteCommands.CeilingFanHighCommand;
import lifeBeforeMS.commandPattern.commands.concreteCommands.CeilingFanLowCommand;
import lifeBeforeMS.commandPattern.commands.concreteCommands.CeilingFanMediumCommand;
import lifeBeforeMS.commandPattern.commands.concreteCommands.CeilingFanOffCommand;
import lifeBeforeMS.commandPattern.commands.concreteCommands.LightOffCommand;
import lifeBeforeMS.commandPattern.commands.concreteCommands.LightsOnCommand;
import lifeBeforeMS.commandPattern.commands.concreteCommands.MacroCommand;
import lifeBeforeMS.commandPattern.commands.concreteCommands.SterioOffCommand;
import lifeBeforeMS.commandPattern.commands.concreteCommands.SterioOnCommand;

public class RemoteLoader {
	
	public static RemoteControl getRemoteController() {
		RemoteControl remoteControl = new RemoteControl();
		loadRemoteControl(remoteControl);
		return remoteControl;
		
	}

	private static void loadRemoteControl(RemoteControl remoteControl) {
		loadCeilingFanCommands(remoteControl);
		loadLightCommand(remoteControl);
		loadSterioCommand(remoteControl);
		loadPartyModeMacroCommand(remoteControl);
	}

	private static void loadCeilingFanCommands(RemoteControl remoteControl) {
		CeilingFan ceilingFan = new CeilingFan("living room");
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControl.setCommand(2, ceilingFanLowCommand, ceilingFanOffCommand);
	}
	
	private static void loadLightCommand(RemoteControl remoteControl) {
		Light light = new Light("Bed room light");
		remoteControl.setCommand(3, new LightsOnCommand(light), new LightOffCommand(light));
	}
	private static void loadSterioCommand(RemoteControl remoteControl) {
		Sterio sterio = new Sterio();
		remoteControl.setCommand(4, new SterioOnCommand(sterio), new SterioOffCommand(sterio));
	}
	
	private static void loadPartyModeMacroCommand(RemoteControl remoteControl) {
		Command[] onCommands = new Command[2]; 
		Command[] offCommands = new Command[2]; 
		Light light = new Light("Party lights");
		Sterio sterio = new Sterio();
		onCommands[0] = new LightsOnCommand(light);
		onCommands[1] = new SterioOnCommand(sterio);
		offCommands[0] = new LightOffCommand(light);
		offCommands[1] = new SterioOffCommand(sterio);
		
		remoteControl.setCommand(5, new MacroCommand(onCommands), new MacroCommand(offCommands));
	}
	
}
