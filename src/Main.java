import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer[] customers = {
                new Customer("Ivanov", "Kyiv", 4444555566667777L, "UA12345"),
                new Customer("Avramenko", "Lviv", 1111222233334444L, "UA67890"),
                new Customer("Petrov", "Odesa", 5555666677778888L, "UA11223"),
                new Customer("Bondar", "Kharkiv", 2222333344445555L, "UA44556"),
                new Customer("Zinchenko", "Dnipro", 9999888877776666L, "UA77889")
        };

        System.out.println("\n--- List of customers in alphabetical order ---");
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName));
        printTable(customers);

        try {
            System.out.print("\nEnter the start of the card range: ");
            long start = scanner.nextLong();
            System.out.print("Enter the end of the card range: ");
            long end = scanner.nextLong();

            System.out.println("\n--- Search result ---");

            boolean found = false;
            for (Customer c : customers) {
                if (c.getCreditCardNumber() >= start && c.getCreditCardNumber() <= end) {
                    System.out.println(c);
                    found = true;
                }
            }

            if (!found) System.out.println("No customers found.");

        } catch (InputMismatchException e) {
            System.out.println("Error: incorrect number format entered!");
        }
    }

    public static void printTable(Customer[] customers) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("| Last Name    | Address        | Card Number      | Account         |");
        System.out.println("----------------------------------------------------------------------");
        for (Customer c : customers) System.out.println(c);
        System.out.println("----------------------------------------------------------------------");
    }
}