package ru.otus.basic.hw7;

/**
 * Класс, представляющий велосипед.
 */
public class Bicycle implements Transport {
    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (terrainType == TerrainType.SWAMP) {
            System.out.println("Велосипед не может переместитьсяпо " + terrainType.getLocalName());
            return false;
        }

        return true;
    }

    @Override
    public String getType() {
        return "Велосипед";
    }
}
