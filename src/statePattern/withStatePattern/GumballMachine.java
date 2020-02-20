package statePattern.withStatePattern;

import statePattern.withStatePattern.states.HasQuarterState;
import statePattern.withStatePattern.states.NoQuarterState;
import statePattern.withStatePattern.states.SoldOutState;
import statePattern.withStatePattern.states.SoldState;
import statePattern.withStatePattern.states.State;
import statePattern.withStatePattern.states.WinnerState;

public class GumballMachine {

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;

	private State state = soldOutState;
	private int count = 0;

	public GumballMachine(int numberOfGumballs) {
		this.count = numberOfGumballs;
		this.hasQuarterState = new HasQuarterState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		if(numberOfGumballs > 0) {
			state = noQuarterState;
		}else {
			state = soldOutState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes out rolling out the slot.....");
		if(count != 0) {
			count = count-1;
		}
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
}
