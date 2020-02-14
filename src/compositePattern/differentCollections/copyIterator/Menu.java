package compositePattern.differentCollections.copyIterator;

import java.util.ArrayList;
import java.util.Iterator;

import compositePattern.component.MenuComponent;

public class Menu extends MenuComponent{
	private ArrayList<MenuComponent> menuComponents;
	private String name;
	private String description;
	private Iterator<MenuComponent> iterator;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		this.menuComponents = new ArrayList<MenuComponent>();
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return this.menuComponents.get(i);
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}
	
	@Override
	public void print() {
		System.out.print("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("--------------------");
		
		Iterator<MenuComponent> iterator = this.menuComponents.iterator();	
		while(iterator.hasNext()) {
			iterator.next().print();
		}
	}
	
	public Iterator<MenuComponent> createIterator(){
		if(iterator == null)
			return new CompositeIterator(menuComponents.iterator());
		return iterator;
	}
	
}
