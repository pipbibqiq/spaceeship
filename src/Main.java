import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SpaceshipQueue spaceshipQueue = new SpaceshipQueue();

        Spaceship spaceship1 = new Spaceship("Корабль 1", 1000, 5, "Ионный");
        Spaceship spaceship2 = new Spaceship("Корабль 2", 1500, 8, "Ядерный");

        spaceshipQueue.addSpaceship(spaceship1);
        spaceshipQueue.addSpaceship(spaceship2);

        int choice;
        do {
            System.out.println("Меню:");
            System.out.println("1. Информация о корабле");
            System.out.println("2. Запустить корабль");
            System.out.println("3. Пришвартовать корабль");
            System.out.println("4. Вернуть корабль из космоса");
            System.out.println("5. Список кораблей");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите номер корабля (1 или 2): ");
                    int shipNumber = scanner.nextInt();
                    if (shipNumber == 1 || shipNumber == 2) {
                        Spaceship selectedShip = shipNumber == 1 ? spaceship1 : spaceship2;
                        selectedShip.printShipInfo();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    break;
                case 2:
                    System.out.print("Введите номер корабля (1 или 2) для запуска: ");
                    int launchShipNumber = scanner.nextInt();
                    if (launchShipNumber == 1 || launchShipNumber == 2) {
                        Spaceship selectedShip = launchShipNumber == 1 ? spaceship1 : spaceship2;
                        selectedShip.launch();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    break;
                case 3:
                    System.out.print("Введите номер корабля (1 или 2) для пришвартовки: ");
                    int dockShipNumber = scanner.nextInt();
                    if (dockShipNumber == 1 || dockShipNumber == 2) {
                        Spaceship selectedShip = dockShipNumber == 1 ? spaceship1 : spaceship2;
                        selectedShip.dock();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    break;
                case 4:
                    System.out.print("Введите номер корабля (1 или 2) для возврата из космоса: ");
                    int returnShipNumber = scanner.nextInt();
                    if (returnShipNumber == 1 || returnShipNumber == 2) {
                        Spaceship selectedShip = returnShipNumber == 1 ? spaceship1 : spaceship2;
                        selectedShip.returnFromSpace();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    break;
                case 5:
                    spaceshipQueue.printAllSpaceshipsInfo();
                    break;
                case 0:
                    System.out.println("Выход.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        } while (choice != 0);
    }
}