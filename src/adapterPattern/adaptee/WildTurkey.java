package adapterPattern.adaptee;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("Am I flying, or jumping long distances? :p ");
	}

}
