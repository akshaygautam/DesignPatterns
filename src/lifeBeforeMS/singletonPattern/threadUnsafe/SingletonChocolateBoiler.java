package lifeBeforeMS.singletonPattern.threadUnsafe;

public class SingletonChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static SingletonChocolateBoiler uniqueInstance;
//	For thread safe
//	private static volatile SingletonChocolateBoiler uniqueInstance2;
	private SingletonChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static SingletonChocolateBoiler getBoiler() {
		if(null == uniqueInstance) {
			synchronized(SingletonChocolateBoiler.class) {
				if(null == uniqueInstance)
					uniqueInstance = new SingletonChocolateBoiler();
			}
			
		}
		return uniqueInstance;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("Fill boiler");
		}else {
			System.out.println("Boiler already filled");
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			System.out.println("Emptying boiler");
			empty = true;
		}else {
			System.out.println("Boiler already empty");
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
			System.out.println("Boiling done");
		}else {
			System.out.println("already boiled");
		}
	}
	
	public boolean isEmpty() {
		return this.empty;
	}
	
	public boolean isBoiled() {
		return this.boiled;
	}
}
