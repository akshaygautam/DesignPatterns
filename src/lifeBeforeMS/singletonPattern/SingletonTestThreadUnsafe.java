package lifeBeforeMS.singletonPattern;

import lifeBeforeMS.singletonPattern.threadUnsafe.SingletonChocolateBoiler;

public class SingletonTestThreadUnsafe {

	public static void main(String[] args) {
//		SingletonChocolateBoiler boiler = new  => will not work as we don't have public constructor.
		SingletonChocolateBoiler boiler = SingletonChocolateBoiler.getBoiler();
		SingletonChocolateBoiler boiler1 = SingletonChocolateBoiler.getBoiler();
		System.out.println("Boiler == Boiler1:\t"+(boiler == boiler1));
		System.out.println("Boiler equals Boiler1:\t"+(boiler.equals(boiler1)));
	}

}
