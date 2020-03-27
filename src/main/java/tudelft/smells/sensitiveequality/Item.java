package tudelft.smells.sensitiveequality;

import java.math.BigDecimal;

public class Item {

	private final String name;
	private final int qty;
	private final BigDecimal individualPrice;

	public Item(String name, int qty, BigDecimal individualPrice) {
		this.name = name;
		this.qty = qty;
		this.individualPrice = individualPrice;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public BigDecimal getIndividualPrice() {
		return individualPrice;
	}

	public BigDecimal finalAmount() {
		return individualPrice.multiply(new BigDecimal(qty));
	}

	@Override
	public String toString() {
		return "Product " + name.substring(0, Math.min(11, name.length())) + " times " + qty + " = " + finalAmount();
	}
}
