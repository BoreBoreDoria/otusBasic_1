package ru.otus.basic.hw7;

public class HomeWork7 {
    public static void main(String[] args) {
        Person person = new Person("Иван");

        Car car = new Car(50);
        Horse horse = new Horse(100);
        Bicycle bicycle = new Bicycle();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();

        person.setCurrentTransport(car);
        person.move(20, TerrainType.PLAIN);

        person.setCurrentTransport(horse);
        person.move(30, TerrainType.SWAMP);

        person.setCurrentTransport(bicycle);
        person.move(10, TerrainType.PLAIN);

        person.setCurrentTransport(offRoadVehicle);
        person.move(50, TerrainType.FOREST);

        person.unsetCurrentTransport();
        person.move(5, TerrainType.PLAIN);
    }
}