package lifeBeforeMS.templateMethodPattern.template;

import java.util.Arrays;

public class RealLifeTemplate {

	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("Daffy",8),
				new Duck("Manny", 7),
				new Duck("Quacker",10),
				new Duck("Huey", 3)
		};
		System.out.println("Before sorting");
		display(ducks);
		Arrays.sort(ducks);
		System.out.println("-------- After Sort ---------");
		display(ducks);
	}

	private static void display(Duck[] ducks) {
		for(Duck d: ducks) {
			System.out.println(d);
		}
	}

}
class Duck implements Comparable<Duck>{
	String name;
	int weight;
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}
	
	/**
	 * Compare to method is a part of algo that this subclass defines, 
	 * this is how template pattern looks like
	 */
	@Override
	public int compareTo(Duck duck) {
		if(this.weight < duck.weight) return -1;
		if(this.weight > duck.weight) return 1;
		return 0;
	}
}
