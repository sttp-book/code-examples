package tudelft.smells.sensitiveequality;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private final List<Item> items = new ArrayList<>();

	public void add(Item item) {
		items.add(item);
	}

	@Override
	public String toString() {
		return items.toString();
	}
}
