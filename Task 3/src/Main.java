import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>(Arrays.asList(
                new Room(3, 2), new Room(5, 3), new Room(2, 1)
        ));
        Building normal = new Building(rooms, 3);

        System.out.println("Lamps: " + countLampsInBuilding(normal));
        System.out.println("Windows: " + countWindowsInBuilding(normal));
        System.out.println("Rooms: " + countRoomsInBuilding(normal));
        System.out.println("Normal: " + isNormal(normal));

        Building abnormal = new Building(new ArrayList<>(Arrays.asList(
                new Room(2, 1), new Room(3, 2)
        )), 5);
        System.out.println("Abnormal: " + isNormal(abnormal));
    }

    public static int countLampsInBuilding(Building b) {
        int total = 0;
        for (Room r : b.getRooms()) total += r.getNumberOfLamps();
        return total;
    }

    public static int countWindowsInBuilding(Building b) {
        int total = 0;
        for (Room r : b.getRooms()) total += r.getNumberOfWindows();
        return total;
    }

    public static int countRoomsInBuilding(Building b) {
        return b.getRooms().size();
    }

    public static boolean isNormal(Building b) {
        return b.getNumberOfFloors() <= b.getRooms().size();
    }
}