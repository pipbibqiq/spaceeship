import java.util.Queue;
import java.util.LinkedList;

// Queue - это интерфейс в языке программирования Java, представляющий собой
// абстракцию для структуры данных, предназначенной для хранения элементов в
// порядке, соответствующем очереди (первый вошел, первый вышел).

// LinkedList - это один из классов структур данных в языке программирования Java,
// который представляет собой двусвязный список. Каждый элемент в LinkedList
// называется узлом, и каждый узел содержит данные и ссылки на предыдущий и следующий узлы в списке.

public class SpaceshipQueue {
    private static final Queue<Spaceship> spaceshipQueue = new LinkedList<>(); // Создаём пустую очередь, в которую мы позже сможем добавить корабли

    // Метод для добавления корабля в очередь
    public static void addSpaceship(Spaceship spaceship) { // Метод, который принимает в себя определённый корабль
        spaceshipQueue.add(spaceship);                    // И добавляет его в конец очереди (если очередь пуста, то: конец = начало)
    }

    // Метод для удаления корабля из очереди
    public static void removeSpaceship() { // Этому методу не нужно ничего в себя принимать (не нужно в него ничего передовать)
        spaceshipQueue.poll();            // Так как он просто удаляет первый элемент очереди (корабль, который первый в очереди)
    }

    // Метод для вывода информации о всех кораблях в очереди
    public static void printAllSpaceshipsInfo() {
        for (Spaceship spaceship : spaceshipQueue) {
            spaceship.printShipInfo();
            System.out.println("===========");
        }
    }
}