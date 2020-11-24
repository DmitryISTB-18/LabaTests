package com.company;

import java.util.Scanner;

public class Birds extends Animals {

    // Fields.
    private boolean relationshipFlight;

    public void setRelationshipFlight(boolean relationshipFlight) {

        this.relationshipFlight = relationshipFlight;
    }

    // Constructors.
    public Birds() {
        super.setAnimalsName("Синица");
        setRelationshipFlight(false);

    }

    public Birds(String birdsName, boolean relationshipFlight) {
        setAnimalsName(birdsName);
        setRelationshipFlight(relationshipFlight);
    }

    // Methods.
    @Override
    public String info() {
            return "Птица:\n - Название: " + getAnimalsName() + "\n - Перелётные(true) или оставшиеся на зимовку(false) : " + relationshipFlight + "\n" ;
    }


    @Override
    public void changeData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите новое название птицы: ");
        String animalsName = input.nextLine();
        System.out.print("Отношение к перелёту: перелётные(true), остающиеся на зимовку(false)? (true/false) : ");
        boolean abstractDataTypes = input.nextBoolean();

        this.setAnimalsName(animalsName);
        this.setRelationshipFlight(abstractDataTypes);
        System.out.println("Изменения сохранены\n");
    }

    @Override
    public Animals inputAnimals() {
        String birdsName = InputClass.inputString("Введите название птицы: ");
        boolean relationshipFlight = InputClass.inputBoolean("Отношение к перелёту: перелётные(true), остающиеся на зимовку(false)? (true/false) : ");
        Animals mammol = new Birds(birdsName, relationshipFlight);
        return mammol;
    }
}
