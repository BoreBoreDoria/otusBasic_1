package ru.otus.basic.hw7;

/**
 * Класс, представляющий вездеход.
 */
public class OffRoadVehicle implements Transport {
    @Override
    public boolean move(int distance, TerrainType terrainType) {
        return true;
    }

    @Override
    public String getType() {
        return "Вездеход";
    }
}
