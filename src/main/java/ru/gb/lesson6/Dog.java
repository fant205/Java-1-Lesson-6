package ru.gb.lesson6;

public class Dog extends Animal {

    public static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;
    private static int dogsCount;

    public Dog() {
        dogsCount++;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    @Override
    public void run(int distance) {
        if (distance > MAX_RUN_DISTANCE) {
            System.out.printf("Бобик не сможет пробежать %s м. Максимальная дистанция %s m.%n", distance, MAX_RUN_DISTANCE);
            return;
        }
        System.out.println("Бобик пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance > MAX_SWIM_DISTANCE) {
            System.out.println("Бобик не сможет проплыть " + distance + " м. Максимальная дистанция " + MAX_SWIM_DISTANCE + " м.");
            return;
        }
        System.out.printf("Бобик проплыл %s м.%n", distance);
    }
}
