package templateMethodPattern.template;

public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customeWantsCondiments()) {
			addCondiments();
		}
	}

	protected boolean customeWantsCondiments() {
		return true;
	}

	protected abstract void addCondiments();
	protected abstract void brew();

	private void boilWater() {
		System.out.println("Water is boiling!");
	}

	private void pourInCup() {
		System.out.println("Pouring into the cup!!");
	}

}
