public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++;
        this.id = counter;
    }
    public String toString() {
        return "Customer ID: " + id + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Username: " + username;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }
}