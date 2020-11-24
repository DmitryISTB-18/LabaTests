package com.company;

import java.util.Scanner;

import static com.company.animalsDefault.*;

public class Main {

    public static void main(String[] args) {
        setDefaultValues();
        Menu();
    }

    public static void Menu() {
        System.out.println("Выберите действие:\n 1 - Добавить\n 2 - Внести изменения\n 3 - Просмотреть всё\n 4 - Запрос\n 5 - Выход");
        Scanner input = new Scanner(System.in);
        int action = input.nextInt();
        switch (action) {
            case 1:
                System.out.println("Выберите класс животного:\n (1) - Птицы\n (2) - Рыбы");
                System.out.print("Вы выбрали: ");
                int i = input.nextInt();
                switch (i) {
                    case 1:
                        addBirds();
                        break;
                    case 2:
                        addFish();
                        break;
                }
                selectingNextAction();
                break;
            case 2:
                String animalsName = InputClass.inputString("Введите название животного: ");
                try {
                    Animals mammol = animalsDefault.locateAnimals(animalsName);
                    mammol.changeData();
                } catch (NullPointerException e) {
                    System.out.println("Животное не найдено.\n");
                }
                selectingNextAction();
                break;
            case 3:
                for (Animals mammol : BirdsAndFish) {
                    System.out.println(mammol.info());
                }
                selectingNextAction();
                break;
            case 4:
                String animalsName2 = InputClass.inputString("Введите название животного : ");

                try {
                    Animals mam = animalsDefault.locateAnimals(animalsName2);
                    Quantity quantity =  mam; // животное этого класса присваиваем
                    System.out.println("Количество символов в слове: " + quantity.quanAni());
                } catch (NullPointerException e) {
                    System.out.println("Язык не найден.\n");
                }
                selectingNextAction();
                break;
            default:
                System.out.println("[Выход]");
                break;
        }
    }

    private static void selectingNextAction() {
        String[] strings = {"Выберите одно из действий:",
                "1 - Продолжить работу ",
                "2 - Выйти из программы"};
        InputClass.outputStrings(strings);
        int action = InputClass.inputInteger("Вы выбрали: ");
        switch (action) {
            case 1:
                Menu();
                break;
            case 2:
                System.out.println("Выход");
                break;
            default:
                System.out.println("Некорректный ввод (введите 1 или 2).\n");
                selectingNextAction();
                break;
        }
    }
}




