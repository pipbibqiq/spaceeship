import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Spaceship spaceship1 = new Spaceship("Корабль 1", 1000, 5, "Ионный");
        Spaceship spaceship2 = new Spaceship("Корабль 2", 1500, 8, "Ядерный");

        SpaceshipQueue.addSpaceship(spaceship1);
        SpaceshipQueue.addSpaceship(spaceship2);

        int choice;
        do {
            System.out.println("Меню:");
            System.out.println("1. Информация о корабле");
            System.out.println("2. Запустить корабль");
            System.out.println("3. Поместить корабль на старт");
            System.out.println("4. Поместить корабль в ангар");
            System.out.println("5. Вернуть корабль из космоса");
            System.out.println("6. Список кораблей в очереди");
            System.out.println("7. Добавить корабль в очередь");
            System.out.println("8. Удлить корабль из очереди");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите номер корабля (1 или 2): ");
                    int shipNumber = scanner.nextInt();
                    Spaceship selectedShip = shipNumber == 1 ? spaceship1 : (shipNumber == 2 ? spaceship2 : null);
                    if (selectedShip != null) {
                        selectedShip.printShipInfo();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 2:
                    System.out.print("Введите номер корабля (1 или 2) для запуска: ");
                    int launchShipNumber = scanner.nextInt();
                    Spaceship selectedLaunchShip = launchShipNumber == 1 ? spaceship1 : (launchShipNumber == 2 ? spaceship2 : null);
                    if (selectedLaunchShip != null) {
                        selectedLaunchShip.launch();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 3:
                    System.out.print("Введите номер корабля (1 или 2) для помещения на стартовую площадку: ");
                    int startShipNumber = scanner.nextInt();
                    Spaceship selectedStartShip = startShipNumber == 1 ? spaceship1 : (startShipNumber == 2 ? spaceship2 : null);
                    if (selectedStartShip != null) {
                        selectedStartShip.start();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 4:
                    System.out.print("Введите номер корабля (1 или 2) для помещения в ангар: ");
                    int dockShipNumber = scanner.nextInt();
                    Spaceship selectedDockShip = dockShipNumber == 1 ? spaceship1 : (dockShipNumber == 2 ? spaceship2 : null);
                    if (selectedDockShip != null) {
                        selectedDockShip.dock();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 5:
                    System.out.print("Введите номер корабля (1 или 2) для возврата из космоса: ");
                    int returnShipNumber = scanner.nextInt();
                    Spaceship selectedReturnShip = returnShipNumber == 1 ? spaceship1 : (returnShipNumber == 2 ? spaceship2 : null);
                    if (selectedReturnShip != null) {
                        selectedReturnShip.returnFromSpace();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 6:
                    SpaceshipQueue.printAllSpaceshipsInfo();
                    System.out.println("\n=============================================\n");
                    break;

                case 7:
                    System.out.print("Введите номер корабля (1 или 2) для добавления в очередь: ");
                    int addShipNumber = scanner.nextInt();
                    Spaceship selectedAddShip = addShipNumber == 1 ? spaceship1 : (addShipNumber == 2 ? spaceship2 : null);
                    if (selectedAddShip != null) {
                        SpaceshipQueue.addSpaceship(selectedAddShip);
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 8:
                    SpaceshipQueue.removeSpaceship();
                    System.out.println("\n=============================================\n");
                    break;

                case 0:
                    System.out.println("Выход.");
                    System.out.println("\n=============================================\n");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
                    System.out.println("\n=============================================\n");
                    break;
            }
        } while (choice != 0);
    }
}