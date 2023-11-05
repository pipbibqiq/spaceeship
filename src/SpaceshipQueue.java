import java.util.Queue;
import java.util.LinkedList;

// Класс для управления очередью космических кораблей
public class SpaceshipQueue {
    private final Queue<Spaceship> spaceshipQueue = new LinkedList<>();

    // Метод для добавления корабля в очередь
    public void addSpaceship(Spaceship spaceship) {
        spaceshipQueue.add(spaceship);
    }

    // Метод для вывода информации о всех кораблях в очереди
    public void printAllSpaceshipsInfo() {
        for (Spaceship spaceship : spaceshipQueue) {
            spaceship.printShipInfo();
            System.out.println("===========");
        }
    }
}