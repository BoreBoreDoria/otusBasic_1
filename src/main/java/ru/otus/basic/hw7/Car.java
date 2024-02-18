package ru.otus.basic.hw7;

/**
 * Класс, представляющий машину.
 */
public class Car implements Transport {
    private int fuel;

    /**
     * Конструктор класса Car.
     *
     * @param fuel количество топлива
     */
    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (terrainType == TerrainType.FOREST || terrainType == TerrainType.SWAMP) {
            System.out.println("Машина не может переместиться по " + terrainType.getLocalName());
            return false;
        }

        if (fuel >= distance) {
            fuel -= distance;
            return true;
        } else {
            System.out.println("Машина не может переместиться на " + distance + " километров из-за нехватки топлива");
            return false;
        }
    }

    @Override
    public String getType() {
        return "Машина";
    }
}
