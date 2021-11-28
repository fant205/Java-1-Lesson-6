package ru.gb.lesson6;

public class Lesson6 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.run(300);
        dog.swim(5);

        Dog dog2 = new Dog();
        dog2.run(600);
        dog2.swim(15);

        Cat cat = new Cat();
        cat.run(10);
        cat.run(300);
        cat.swim(3);

        System.out.println("Количество созданных бобиков: " + Dog.getDogsCount());
        System.out.println("Количество созданных котов: " + Cat.getCatsCount());
        System.out.println("Количество созданных животных: " + Animal.getAnimalsCount());

    }
}