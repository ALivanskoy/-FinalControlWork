package Controller;

import Model.Animals.*;
import Model.Logic.AnimalList;
import Model.Logic.Counter;
import Model.Logic.NameRandomizer;

import java.util.Random;
import java.util.Scanner;

public class Controller {
    private AnimalList animalList;
    private Scanner scanner;

    public Controller(AnimalList animalList) {
        this.animalList = animalList;
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        try (Counter counter = new Counter()) {
            try {
                while (true) {
                    System.out.println("Меню:");
                    System.out.println("1. Просмотреть список животных");
                    System.out.println("2. Добавить животное");
                    System.out.println("3. Удалить животное");
                    System.out.println("4. Выход");
                    System.out.print("Выберите действие: ");

                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            printAnimalList();
                            break;
                        case 2:
                            addAnimal();
                            counter.add();
                            break;
                        case 3:
                            removeAnimal();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("Неверный выбор");
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void printAnimalList() {
        System.out.println("Список животных:");
        for (int i = 0; i < animalList.getAnimalRegistry().size(); i++) {
            System.out.println((i + 1) + ". " + animalList.getAnimalRegistry().get(i) + "\n");
        }
        System.out.println();
    }

    private void addAnimal() throws RuntimeException {
        System.out.println("Введите номер животного для добавления:");
        System.out.println("1. Кот");
        System.out.println("2. Пёс");
        System.out.println("3. Хомяк");
        System.out.println("4. Осёл");
        System.out.println("5. Лошадь");
        System.out.println("6. Верблюд");
        System.out.println("Ввод: ");

        try {
            int choise = Integer.parseInt(scanner.nextLine());
            Random r = new Random();

            switch (choise) {
                case 1:
                    animalList.getAnimalRegistry().add(new Cat(NameRandomizer.getRandomName(), r.nextInt(1, 10), false));
                    break;
                case 2:
                    animalList.getAnimalRegistry().add(new Dog(NameRandomizer.getRandomName(), r.nextInt(1, 10), true));
                    break;
                case 3:
                    animalList.getAnimalRegistry().add(new Hamster(NameRandomizer.getRandomName(), r.nextInt(1, 10), true));
                    break;
                case 4:
                    animalList.getAnimalRegistry().add(new Donkey(NameRandomizer.getRandomName(), r.nextInt(1, 10), 10));
                    break;
                case 5:
                    animalList.getAnimalRegistry().add(new Horse(NameRandomizer.getRandomName(), r.nextInt(1, 10), 20));
                    break;
                case 6:
                    animalList.getAnimalRegistry().add(new Camel(NameRandomizer.getRandomName(), r.nextInt(1, 10), 30));
                    break;
                default:
                    throw new RuntimeException("Неверный ввод");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private void removeAnimal() throws RuntimeException {

        System.out.print("Введите номер животного, которое нужно удалить: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > animalList.getAnimalRegistry().size()) {
            throw new RuntimeException("Неверный номер животного");
        }

        Animal animal = animalList.getAnimalRegistry().get(index - 1);
        animalList.getAnimalRegistry().remove(animal);
        System.out.println("Животное удалено из списка");
        System.out.println();
    }
}
