package com.company;

import java.util.Scanner;

enum Habitat { // перечисление констант.
    RIVER,
    SEA,
    LIKE,
    INDEFINED
}

public class Fish extends Animals {


    private Habitat habitatType;


    // Геттеры и сеттеры.
    public Habitat getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(Habitat habitatType) {
        this.habitatType = habitatType;
    }





    // Constructors.
    public Fish() {
        setAnimalsName("Карась");
        setHabitatType(Habitat.LIKE);
    }

    public Fish(String fishName, Habitat habitatType) {
        setAnimalsName(fishName);
        setHabitatType(habitatType);
    }



    // Methods.
    @Override
    public void changeData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите новое название рыбы: ");
        String languageName = input.nextLine();
        Habitat habitat = Habitat.valueOf(InputClass.inputString("Введие место проживания рыбы большими буквами (RIVER/SEA/LIKE) : "));

        this.setAnimalsName(languageName);

        this.setHabitatType(habitat);
        System.out.println("Изменения сохранены.\n");
    }

    @Override
    public String info() {
        return "Рыба:\n  - Название: " + getAnimalsName() + "\n  - Место проживания: " + habitatType + "\n";
    }




    @Override
    public Animals inputAnimals() {
        String fishName = InputClass.inputString("Введите название рыбы: ");
        Habitat habitat = InputClass.inputInheritance("Введие место проживания рыбы большими буквами (RIVER/SEA/LIKE) : ");
        Animals language = new Fish(fishName, habitat );
        return language;
    }
}
