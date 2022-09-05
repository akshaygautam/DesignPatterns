package lifeBeforeMS.singletonPattern.threadUnsafe;

public class SingletonClass {
	private static SingletonClass uniqueInstance;
	private SingletonClass() {}
	public static SingletonClass getInstance() {
		if(null == uniqueInstance) {
			uniqueInstance = new SingletonClass();
		}
		return uniqueInstance;
	}
}
