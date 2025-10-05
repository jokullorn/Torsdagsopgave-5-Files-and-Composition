import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        File file = new File("coffees.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                coffeeMenu.add(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}