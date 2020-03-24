package tudelft.invoicestubbed;

import java.util.Objects;

public class Invoice {
    public final String customer;
    public final int value;


    public Invoice(String customer, int value) {
        this.customer = customer;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return value == invoice.value &&
                customer.equals(invoice.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, value);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer='" + customer + '\'' +
                ", value=" + value +
                '}';
    }
}