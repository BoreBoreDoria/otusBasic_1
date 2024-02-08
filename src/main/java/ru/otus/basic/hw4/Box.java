package ru.otus.basic.hw4;

public class Box {
    private final int width;
    private final int height;
    private final int depth;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    public void openBox() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Коробка открыта.");
        } else {
            System.out.println("Коробка уже открыта.");
        }
    }

    public void closeBox() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Коробка закрыта.");
        } else {
            System.out.println("Коробка уже закрыта.");
        }
    }

    public void repaintBox(String newColor) {
        color = newColor;
        System.out.println("Коробка перекрашена в " + newColor + ".");
    }

    public void printBoxInfo() {
        System.out.println("Размеры коробки: " + width + "x" + height + "x" + depth);
        System.out.println("Цвет коробки: " + color);
        System.out.println("Состояние коробки: " + (isOpen ? "открыта" : "закрыта"));
        if (item != null) {
            System.out.println("В коробке находится предмет: " + item);
        } else {
            System.out.println("В коробке нет предмета.");
        }
    }

    public void addItem(String newItem) {
        if (isOpen) {
            if (item == null) {
                item = newItem;
                System.out.println("Предмет добавлен в коробку: " + newItem);
            } else {
                System.out.println("В коробке уже есть предмет.");
            }
        } else {
            System.out.println("Коробка закрыта. Нельзя добавить предмет.");
        }
    }

    public void removeItem() {
        if (isOpen) {
            if (item != null) {
                System.out.println("Предмет удален из коробки: " + item);
                item = null;
            } else {
                System.out.println("В коробке нет предмета.");
            }
        } else {
            System.out.println("Коробка закрыта. Нельзя удалить предмет.");
        }
    }
}
