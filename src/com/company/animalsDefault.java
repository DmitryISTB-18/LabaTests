package com.company;

import java.util.ArrayList;

public class animalsDefault {

    public static final ArrayList<Animals> BirdsAndFish = new ArrayList<Animals>();

    protected static void addBirds() {
        BirdsAndFish.add(new Birds().inputAnimals());
        System.out.println("Птица добавлена!\n");
    }

    protected static void addFish() {
        BirdsAndFish.add(new Fish().inputAnimals());
        System.out.println("Рыба добавлена!\n");
    }

    protected static Animals locateAnimals(String nameAnimals) throws NullPointerException {
        Animals mammal = null;
        for (int i = 0; i < BirdsAndFish.size(); i++) {
            if (BirdsAndFish.get(i).getAnimalsName().equals(nameAnimals)) { // получение итого элемента, его имени, сравнение с введённым именем.
                mammal = BirdsAndFish.get(i);
                break;
            }
        }
        if (mammal == null) {
            throw new NullPointerException();
        }
        return mammal;
    }

    public static void setDefaultValues() {
        Animals mammol = new Birds("Синица", false);
        Animals mammol2 = new Birds("Орёл", false);
        Animals mammol3 = new Birds("Зарянка", true);
        Animals mammol4 = new Fish("Карась", Habitat.LIKE);
        Animals mammol5 = new Fish("Акула", Habitat.SEA);

        BirdsAndFish.add(mammol);
        BirdsAndFish.add(mammol2);
        BirdsAndFish.add(mammol3);
        BirdsAndFish.add(mammol4);
        BirdsAndFish.add(mammol5);
    }
}


