package ru.gb.lesson6;

public class Cat extends Animal{

    public static final int MAX_RUN_DISTANCE = 200;
    private static int catsCount;

    public Cat(){
        catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    @Override
    public void run(int distance) {
        if(distance > MAX_RUN_DISTANCE){
            System.out.printf("Кот не сможет пробежать %s м. Максимальная дистанция %s m.%n", distance, MAX_RUN_DISTANCE);
            return;
        }
        System.out.printf("Кот пробежал %s м.%n", distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }
}
