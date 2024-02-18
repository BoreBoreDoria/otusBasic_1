package ru.otus.basic.hw7;

/**
 * Интерфейс, представляющий транспорт.
 */
public interface Transport {

    /**
     * Перемещает транспорт на указанное расстояние по указанному типу местности.
     *
     * @param distance    расстояние
     * @param terrainType тип местности
     * @return true, если перемещение выполнено успешно, false в противном случае
     */
    boolean move(int distance, TerrainType terrainType);

    /**
     * Возвращает тип транспорта.
     *
     * @return тип транспорта
     */
    String getType();
}
