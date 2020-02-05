package adapterPattern;

import adapterPattern.adaptee.Turkey;
import adapterPattern.adaptee.WildTurkey;
import adapterPattern.adapters.DuckAdapter;
import adapterPattern.adapters.TurkeyAdapter;
import strategyPattern.Duck;
import strategyPattern.concreteDucks.MallardDuck;

public class AdapterTest {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		Turkey duckAdapter = new DuckAdapter(duck);
		
		System.out.println("The turkey says....");
		testTurkey(turkey);
		
		System.out.println("And a duck says");
		testDuck(duck);
		
		System.out.println("\n----------Turkey adapter works----------");
		testDuck(turkeyAdapter);
		System.out.println("\n---------Duck adapter works------------");
		testTurkey(duckAdapter);
		
	}

	//Client only sees target interface
	private static void testDuck(Duck duck) {
		duck.display();
		duck.performQuack();
		duck.performFly();
	}
	//Client only sees target interface
	private static void testTurkey(Turkey turkey) {
		turkey.fly();
		turkey.gobble();
	}
}
