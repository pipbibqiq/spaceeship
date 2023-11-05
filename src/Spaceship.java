// Класс, представляющий космический корабль
public class Spaceship {
    private final String name;         // Название корабля
    private final int maxSpeed;        // Максимальная скорость корабля
    private final int crewSize;        // Размер экипажа корабля
    private boolean isDocked;    // Статус корабля (пришвартован или нет)
    private boolean isInSpace;   // Статус корабля в космосе
    private final String propulsionType;  // Тип двигателя корабля

    // Конструктор класса для создания корабля с начальными характеристиками
    public Spaceship(String name, int maxSpeed, int crewSize, String propulsionType) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.crewSize = crewSize;
        this.isDocked = false; // При создании корабль всегда не на старте
        this.isInSpace = false; // При создании корабль не находится в космосе
        this.propulsionType = propulsionType;
    }

    // Метод для помещения корабля на старт
    public void dock() {
        if (!isDocked) {
            isDocked = true;
            isInSpace = false;
            System.out.println(name + " корабль на старте.");
        } else {
            System.out.println(name + " уже на старте.");
        }
    }

    // Метод для отправки корабля в космос
    public void launch() {
        if (isDocked) {
            isDocked = false;
            isInSpace = true;
            System.out.println(name + " отправляется в космос.");
        } else {
            System.out.println(name + " не может отправиться в космос, так как не помещён на стартовую площадку.");
        }
    }

    // Метод для возвращения корабля из космоса
    public void returnFromSpace() {
        if (isInSpace) {
            isDocked = true;
            isInSpace = false;
            System.out.println(name + " возвращается из космоса.");
        } else {
            System.out.println(name + " не может вернуться из космоса, так как не находится там.");
        }
    }

    // Метод для вывода информации о корабле
    public void printShipInfo() {
        System.out.println("Космический корабль: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed);
        System.out.println("Размер экипажа: " + crewSize);
        System.out.println("Статус: " + (isInSpace ? "В космосе" : (isDocked ? "На стартовой площадке" : "Не на стартовой площадке")));
        System.out.println("Тип двигателя: " + propulsionType);
    }
}