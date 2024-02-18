package ru.otus.basic.hw7;

/**
 * Класс, представляющий человека.
 */
public class Person {
    private final String name;
    private Transport currentTransport;

    /**
     * Конструктор класса Person.
     *
     * @param name имя человека
     */
    public Person(String name) {
        this.name = name;
        this.currentTransport = null;
    }

    /**
     * Устанавливает текущий транспорт для человека.
     *
     * @param transport текущий транспорт
     */
    public void setCurrentTransport(Transport transport) {
        this.currentTransport = transport;
    }

    /**
     * Снимает текущий транспорт с человека.
     */
    public void unsetCurrentTransport() {
        this.currentTransport = null;
    }

    /**
     * Перемещает человека на указанное расстояние по указанному типу местности.
     *
     * @param distance    расстояние
     * @param terrainType тип местности
     */
    public void move(int distance, TerrainType terrainType) {
        if (currentTransport != null) {
            boolean success = currentTransport.move(distance, terrainType);
            if (success) {
                System.out.println(name + " переместился на " + distance + " километров на "
                        + currentTransport.getType() + " по " + terrainType.getLocalName());
            } else {
                System.out.println("Не удалось переместиться на " + distance + " километров на "
                        + currentTransport.getType() + " по " + terrainType.getLocalName());
            }
        } else {
            System.out.println(name + " переместился на " + distance + " километров пешком по " + terrainType);
        }
    }
}