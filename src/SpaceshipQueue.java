import java.util.Queue;
import java.util.LinkedList;

public class SpaceshipQueue {
    private static final Queue<Spaceship> spaceshipQueue = new LinkedList<>();

    // Метод для добавления корабля в очередь
    public static void addSpaceship(Spaceship spaceship) {
        spaceshipQueue.add(spaceship);
    }

    // Метод для удаления корабля из очереди
    public static void removeSpaceship() {
        spaceshipQueue.poll();
    }

    // Метод для вывода информации о всех кораблях в очереди
    public static void printAllSpaceshipsInfo() {
        for (Spaceship spaceship : spaceshipQueue) {
            spaceship.printShipInfo();
            System.out.println("===========");
        }
    }
}