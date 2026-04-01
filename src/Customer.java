public class Customer {
    private String lastName;
    private String address;
    private long creditCardNumber;
    private String bankAccountNumber;

    public Customer(String lastName, String address, long creditCardNumber, String bankAccountNumber) {
        this.lastName = lastName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getLastName() { return lastName; }
    public long getCreditCardNumber() { return creditCardNumber; }

    @Override
    public String toString() {
        return String.format("| %-12s | %-15s | %-16d | %-15s |",
                lastName, address, creditCardNumber, bankAccountNumber);
    }
}