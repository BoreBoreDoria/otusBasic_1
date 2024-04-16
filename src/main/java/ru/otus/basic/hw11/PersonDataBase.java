package ru.otus.basic.hw11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    private final Map<Long, Person> persons = new HashMap<>();

    /**
     * Находит и возвращает объект Person по его идентификатору.
     *
     * @param id Идентификатор человека.
     * @return Объект Person, если он найден, иначе возвращает null.
     */
    public Person findById(Long id) {
        return persons.get(id);
    }

    /**
     * Добавляет объект Person в базу данных.
     *
     * @param person Объект Person для добавления.
     */
    public void add(Person person) {
        persons.put(person.getId(), person);
    }


    /**
     * Проверяет, является ли указанный объект Person менеджером.
     * Менеджером считается объект Person, занимающий одну из управленческих должностей.
     *
     * @param person Объект Person для проверки.
     * @return true, если объект Person является менеджером, иначе false.
     */
    public boolean isManager(Person person) {
        return switch (person.getPosition()) {
            case MANAGER, DIRECTOR, BRANCH_DIRECTOR, SENIOR_MANAGER -> true;
            default -> false;
        };
    }

    /**
     * Проверяет, является ли сотрудник с указанным идентификатором обычным сотрудником, не менеджером.
     *
     * @param id Идентификатор человека для проверки.
     * @return true, если сотрудник не является менеджером, иначе false.
     */
    public boolean isEmployee(Long id) {
        Person person = findById(id);
        if (person != null) {
            return !isManager(person);
        }
        return false;
    }
}