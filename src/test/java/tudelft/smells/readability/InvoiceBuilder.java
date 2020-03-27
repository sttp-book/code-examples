package tudelft.smells.readability;

import java.math.BigDecimal;

public class InvoiceBuilder {

	private String country;
	private CustomerType customerType;
	private BigDecimal value;

	public InvoiceBuilder withCountry(String country) {
		this.country = country;
		return this;
	}

	public InvoiceBuilder asCompany() {
		this.customerType = CustomerType.COMPANY;
		return this;
	}

	public InvoiceBuilder withAValueOf(String value) {
		this.value = new BigDecimal(value);
		return this;
	}

	public Invoice build() {
		return new Invoice(value, country, customerType);
	}

	public Invoice anyCompany() {
		return new Invoice(value, country, CustomerType.COMPANY);
	}

	public Invoice anyUS() {
		return new Invoice(value, "US", customerType);
	}
}
