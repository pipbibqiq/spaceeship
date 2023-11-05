import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Без этого мы не сможем считывать текст введённый с клавиатуры

                            // Создаём корабли и прописываем значения характеристик, которые мы обозначили в классе "Spacesship"
        Spaceship spaceship1 = new Spaceship("Корабль 1", 1000, 5, "Ионный"); //
        Spaceship spaceship2 = new Spaceship("Корабль 2", 1500, 8, "Ядерный");
        Spaceship spaceship3 = new Spaceship("Корабль 3", 7000, 16, "На дровах");

                        // Сразу добавляем все корабли в очередь
        SpaceshipQueue.addSpaceship(spaceship1);
        SpaceshipQueue.addSpaceship(spaceship2);
        SpaceshipQueue.addSpaceship(spaceship3);

        int choice; // Создаём переменную, в которую мы потом будем записывать числа (пункты меню)
        do {
                  // Выводим менюху
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
            choice = scanner.nextInt(); // Считываем число, которое ввели с клавиатуры (выбрали определённый пункт меню) и записываем его в переменную "choice"

            switch (choice) { // И в зависимости от записанного в "choice" числа начинаем выполнять определённые действия
                case 1:      // Если в переменной "choice" число 1, то...
                    System.out.print("Введите номер корабля (1, 2, 3): ");
                    int shipNumber = scanner.nextInt(); // Считываем номер корабля, который выбрал пользователь и записываем его в переменную "shipNumber"
                          // Если shipNumber = 1, то selectedShip = "Корабль 1" : shipNumber = 2, то selectedShip = "Корабль 2" :
                         // shipNumber = 3, то selectedShip = "Корабль 3" : иначе selectedShip = null
                    Spaceship selectedShip = shipNumber == 1 ? spaceship1 : (shipNumber == 2 ? spaceship2 : (shipNumber == 3 ? spaceship3 : null));
                    if (selectedShip != null) {        // Если selectedShip не равно null, то...
                        selectedShip.printShipInfo(); //передаём записанный в selectedShip корабль в метод .printShipInfo() и выполняем его
                    } else {                         // Иначе...
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break; // Нужен для завершения выполнения блока и перехода обратно в меню

                case 2:  // Если в переменной "choice" число 2, то...
                    System.out.print("Введите номер корабля (1, 2, 3) для запуска: ");
                    int launchShipNumber = scanner.nextInt();
                    Spaceship selectedLaunchShip = launchShipNumber == 1 ? spaceship1 : (launchShipNumber == 2 ? spaceship2 : (launchShipNumber == 3 ? spaceship3 : null));
                    if (selectedLaunchShip != null) {
                        selectedLaunchShip.launch();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 3: // Если в переменной "choice" число 3, то...
                    System.out.print("Введите номер корабля (1, 2, 3) для помещения на стартовую площадку: ");
                    int startShipNumber = scanner.nextInt();
                    Spaceship selectedStartShip = startShipNumber == 1 ? spaceship1 : (startShipNumber == 2 ? spaceship2 : (startShipNumber == 3 ? spaceship3 : null));
                    if (selectedStartShip != null) {
                        selectedStartShip.start();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 4: // Если в переменной "choice" число 4, то...
                    System.out.print("Введите номер корабля (1, 2, 3) для помещения в ангар: ");
                    int dockShipNumber = scanner.nextInt();
                    Spaceship selectedDockShip = dockShipNumber == 1 ? spaceship1 : (dockShipNumber == 2 ? spaceship2 : (dockShipNumber == 3 ? spaceship3 : null));
                    if (selectedDockShip != null) {
                        selectedDockShip.dock();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 5: // Если в переменной "choice" число 5, то...
                    System.out.print("Введите номер корабля (1, 2, 3) для возврата из космоса: ");
                    int returnShipNumber = scanner.nextInt();
                    Spaceship selectedReturnShip = returnShipNumber == 1 ? spaceship1 : (returnShipNumber == 2 ? spaceship2 : (returnShipNumber == 3 ? spaceship3 : null));
                    if (selectedReturnShip != null) {
                        selectedReturnShip.returnFromSpace();
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 6: // Если в переменной "choice" число 6, то...
                    SpaceshipQueue.printAllSpaceshipsInfo(); // Выводим очередь из кораблей
                    System.out.println("\n=============================================\n");
                    break;

                case 7: // Если в переменной "choice" число 7, то...
                    System.out.print("Введите номер корабля (1, 2, 3) для добавления в очередь: ");
                    int addShipNumber = scanner.nextInt();
                    Spaceship selectedAddShip = addShipNumber == 1 ? spaceship1 : (addShipNumber == 2 ? spaceship2 : (addShipNumber == 3 ? spaceship3 : null));
                    if (selectedAddShip != null) {
                        SpaceshipQueue.addSpaceship(selectedAddShip);
                        System.out.println("Успешно!");
                    } else {
                        System.out.println("Неверный номер корабля.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 8: // Если в переменной "choice" число 8, то...
                    SpaceshipQueue.removeSpaceship(); // Убираем из очереди первый элемент (корабль, который находится первый в очереди)
                    System.out.println("Успешно!");
                    System.out.println("\n=============================================\n");
                    break;

                case 0: // Если в переменной "choice" число 0, то...
                    System.out.println("Выход.");
                    System.out.println("\n=============================================\n");
                    break;

                default: // Иначе...
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
                    System.out.println("\n=============================================\n");
                    break;
            }
        } while (choice != 0);
    }
}