package lifeBeforeMS.compositePattern.differentCollections.copyIterator;

import java.util.Iterator;
import java.util.Stack;

import lifeBeforeMS.compositePattern.component.MenuComponent;

public class CompositeIterator implements Iterator {

	private Stack<java.util.Iterator<MenuComponent>> stack = new Stack<java.util.Iterator<MenuComponent>>();

	public CompositeIterator(java.util.Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty())
			return false;
		java.util.Iterator<MenuComponent> iterator = stack.peek();
		if (!iterator.hasNext()) {
			stack.pop();
			return hasNext();
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			java.util.Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			stack.push(component.createIterator());
			return component;
		}
		return null;
	}

}
