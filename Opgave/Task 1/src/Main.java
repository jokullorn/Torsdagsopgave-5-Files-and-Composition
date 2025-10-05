import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        // Create and add customers to the list
        customers.add(new Customer("Jökull Örn", "Sigurdarson", "jokullornsig"));
        customers.add(new Customer("Margrethe", "Sørensen", "nicomsor"));
        customers.add(new Customer("Jens", "Hansen", "JHansen20"));
        customers.add(new Customer("Sofie", "Christensen", "SofChris"));

        // Call the printCustomers method
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
            System.out.println("-------------------");
        }
    }
}