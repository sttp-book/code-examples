# Notes
- Don't throw raw `RuntimeException`, throw something more relevant. `EnvironmentFailure` means something transient.
- Need to be much more careful about opening and closing static DB connections.
- Don't use doubles for money (implies need for deltas when comparing)
- simplify Invoice by using immutability
- more descriptive filter method name
- streaming in filter
- test example just below threshold
- Use domain terminology, rather than pattern name (`InvoiceDAO` -> `IssuedInvoices`) 
- more compact assertion using matchers