package lifeBeforeMS.statePattern.withStatePattern.states;

import lifeBeforeMS.statePattern.withStatePattern.GumballMachine;

public class NoQuarterState implements State {

	private static final long serialVersionUID = 2L;
	transient private GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		this.gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there is no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}
	
	@Override
	public String toString() {
		return "NoQuarterState";
	}

}
