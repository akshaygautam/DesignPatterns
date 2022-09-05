package lifeBeforeMS.commandPattern;

import lifeBeforeMS.commandPattern.commands.Command;
import lifeBeforeMS.commandPattern.commands.concreteCommands.NoCommand;

public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand; 
	}
	
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonPressed() {
		undoCommand.undo();
	}
	
	@Override
	public String toString() {
		StringBuffer stringbuff = new StringBuffer();
		stringbuff.append("\n------------ Remote Control -----------------\n");
		for(int i=0; i < onCommands.length; i++) {
			stringbuff.append("[slot "+i+"]" + onCommands[i].getClass().getSimpleName()
					+"\t\t\t"+ offCommands[i].getClass().getSimpleName()+"\n");
		}
		return stringbuff.toString();
	}
}
