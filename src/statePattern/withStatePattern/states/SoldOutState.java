package statePattern.withStatePattern.states;

import statePattern.withStatePattern.GumballMachine;

public class SoldOutState implements State {

	private static final long serialVersionUID = 2L;
	transient private GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can not insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can not eject, You haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there is no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	@Override
	public String toString() {
		return "SoldOutState";
	}
}
