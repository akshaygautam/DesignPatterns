package lifeBeforeMS.statePattern.withoutStatePattern;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	private int state = SOLD_OUT;
	private int count = 0;

	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can not insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can not insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("Please wait, we're already giving you a gumball");
		}
	}

	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("Quarter Returned");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can not eject, You haven't inserted a quarter yet");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		}
	}

	public void turnCrank() {
		if (state == HAS_QUARTER) {
			System.out.println("You turned");
			state = SOLD;
			dispense();
		} else if (state == NO_QUARTER) {
			System.out.println("You turned but there is no quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You turned but there is no gumballs");
		} else if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball");
		}
	}

	private void dispense() {
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			this.count--;
			if (count == 0) {
				System.out.println("Oops, out of gumballs!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if (state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}
	}

	public void refill(int gumballcount) {
		this.count += gumballcount;
		System.out.println("Refilling");
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}

}
