package tudelft.mocks.invoice;

public class InvoiceBuilder {

    private String customer;
    private int value;

    public InvoiceBuilder() {
        this.customer = "John Doe";
        this.value = 123;
    }

    public InvoiceBuilder withNegativeValue() {
        this.value *= -1;
        return this;
    }

    public Invoice build() {
        return new Invoice(customer, value);
    }

    public InvoiceBuilder withValue(int value) {
        this.value = value;
        return this;
    }
}
