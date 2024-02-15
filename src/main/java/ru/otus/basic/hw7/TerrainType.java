package ru.otus.basic.hw7;

/**
 * Перечисление, представляющее типы местности.
 */
public enum TerrainType {
    FOREST("Лес"),
    PLAIN("Равнины"),
    SWAMP("Болото");

    private final String localName;

    TerrainType(String localName) {
        this.localName = localName;
    }

    public String getLocalName() {
        return localName;
    }
}
