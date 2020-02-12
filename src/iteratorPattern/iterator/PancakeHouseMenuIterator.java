package iteratorPattern.iterator;

import java.util.ArrayList;

import iteratorPattern.differentCollections.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
	private ArrayList<MenuItem> items;
	private int position;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
		this.position = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.size() || items.get(position) == null)
			return false;
		else
			return true;
	}

	@Override
	public MenuItem next() {
		MenuItem item = items.get(position);
		position++;
		return item;
	}
}
