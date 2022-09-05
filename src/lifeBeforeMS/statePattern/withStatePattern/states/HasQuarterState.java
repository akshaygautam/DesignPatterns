package lifeBeforeMS.statePattern.withStatePattern.states;

import java.util.Random;

import lifeBeforeMS.statePattern.withStatePattern.GumballMachine;

public class HasQuarterState implements State {
	
	private static final long serialVersionUID = 2L;
	private Random randomWinner = new Random(System.currentTimeMillis());
	transient private GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		 System.out.println("You can not insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		 System.out.println("Quarter Returned");
		 this.gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		 System.out.println("You turned");
		 int winner = randomWinner.nextInt(10);
		 if(winner == 0 && gumballMachine.getCount() > 1) {
			 this.gumballMachine.setState(gumballMachine.getWinnerState());
		 }else {
			 this.gumballMachine.setState(gumballMachine.getSoldState());
		 }
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	@Override
	public String toString() {
		return "HasQuarterState";
	}
	
}
