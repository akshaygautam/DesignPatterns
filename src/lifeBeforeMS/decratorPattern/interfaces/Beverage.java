package lifeBeforeMS.decratorPattern.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Beverage {
	List<String> description = new ArrayList<>();
	public List getDescription();
	public double cost();
}
