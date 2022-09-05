package lifeBeforeMS.iteratorPattern.iterator;

import lifeBeforeMS.iteratorPattern.differentCollections.MenuItem;

public interface Iterator extends java.util.Iterator<MenuItem>{
	boolean hasNext();
	MenuItem next();
}
