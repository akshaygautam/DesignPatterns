package iteratorPattern.iterator;

import iteratorPattern.differentCollections.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
