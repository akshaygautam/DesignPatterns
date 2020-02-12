package iteratorPattern.iterator;

import iteratorPattern.differentCollections.MenuItem;

public class DinerMenuIterator implements Iterator {
	private MenuItem[] items;
	private int position;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
		this.position = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null)
			return false;
		else
			return true;
	}

	@Override
	public MenuItem next() {
		MenuItem item = items[position];
		position++;
		return item;
	}

}
