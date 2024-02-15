package ru.otus.basic.hw7;

/**
 * Класс, представляющий лошадь.
 */
public class Horse implements Transport {
    private int energy;

    /**
     * Конструктор класса Horse.
     *
     * @param energy количество энергии
     */
    public Horse(int energy) {
        this.energy = energy;
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (terrainType == TerrainType.SWAMP) {
            System.out.println("Лошадь не может переместиться по " + terrainType.getLocalName());
            return false;
        }

        if (energy >= distance) {
            energy -= distance;
            return true;
        } else {
            System.out.println("Лошадь не может переместиться на " + distance + " километров из-за усталости");
            return false;
        }
    }

    @Override
    public String getType() {
        return "Лошадь";
    }
}
