// Класс, представляющий космический корабль
public class Spaceship {
    private final String name;         // Название корабля
    private final int maxSpeed;        // Максимальная скорость корабля
    private final int crewSize;        // Размер экипажа корабля
    private boolean isDocked;    // Статус корабля (пришвартован или нет)
    private boolean isInSpace;   // Статус корабля в космосе
    private boolean isStart;
    private final String propulsionType;  // Тип двигателя корабля

    // Конструктор класса для создания корабля с начальными характеристиками
    public Spaceship(String name, int maxSpeed, int crewSize, String propulsionType) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.crewSize = crewSize;
        this.isDocked = true; // При создании корабль всегда в ангаре
        this.isStart = false;
        this.isInSpace = false; // При создании корабль не находится в космосе
        this.propulsionType = propulsionType;
    }

    // Метод для помещения корабля на старт
    public void start() {
        if (isDocked && !isInSpace) {
            isDocked = false;
            isStart = true;
            System.out.println("\n" + name + " на старте.\n");
        } else {
            System.out.println("\n" + name + " не может быть помещён на стартовую площадку, так как он либо уже там, либо он в космосе.\n");
        }
    }
    // Метод для помещения корабля в ангар
    public void dock() {
        if (!isDocked && !isInSpace) {
            isDocked = true;
            isStart = false;
            System.out.println("\n" + name + " в ангаре.\n");
        } else {
            System.out.println("\n" + name + " не может быть помещён в ангар, так как он либо уже там, либо он в космосе.\n");
        }
    }

    // Метод для отправки корабля в космос
    public void launch() {
        if (isStart) {
            isDocked = false;
            isStart = false;
            isInSpace = true;
            System.out.println("\n" + name + " отправляется в космос.\n");
        } else {
            System.out.println("\n" + name + " не может отправиться в космос, так как не помещён на стартовую площадку.\n");
        }
    }

    // Метод для возвращения корабля из космоса
    public void returnFromSpace() {
        if (isInSpace) {
            isDocked = true;
            isInSpace = false;
            System.out.println("\n" + name + " Возвращается из космоса.\n");
        } else {
            System.out.println("\n" + name + " Не может вернуться из космоса, так как не находится там.\n");
        }
    }

    // Метод для вывода информации о корабле
    public void printShipInfo() {
        System.out.println("\nКосмический корабль: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed);
        System.out.println("Размер экипажа: " + crewSize);
        System.out.println("Статус: " + (isInSpace ? "В космосе" : (isStart ? "На стартовой площадке" : "В ангаре")));
        System.out.println("Тип двигателя: " + propulsionType);
    }
}