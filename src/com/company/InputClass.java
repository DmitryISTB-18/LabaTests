package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {

    public static int inputInteger(String displayText) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print(displayText);
            number = input.nextInt();
            if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
                throw new InputMismatchException();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Некорректный ввод (введите целое число).\n");
            number = inputInteger(displayText);// пытается вызвать занова
        }
        return number;
    }

    public static String inputString(String displayText) {
        Scanner input = new Scanner(System.in);
        String line = "";
        try {
            System.out.print(displayText);
            line = input.nextLine();
            if (line.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("\n        Некорректный ввод (введите непустую строку).\n");
            line = inputString(displayText);
        }
        return line;
    }

    public static boolean inputBoolean(String displayText) {
        Scanner input = new Scanner(System.in);
        boolean line = false;
        try {
            System.out.print(displayText);
            line = input.nextBoolean();
        } catch (NullPointerException e) {
            System.out.println("\n        Некорректный ввод (введите непустую строку).\n");
            line = inputBoolean(displayText);
        }
        return line;
    }

    public static Habitat inputInheritance(String displayText) {
        String string = inputString("Введите тип наследования большими буквами (INTERFACE/SINGLE/MULTIPLE): ");

        try {
            Habitat habitat = Habitat.valueOf(string);// возвращаем строковое представление переданного аргумента
            return habitat;
        } catch (IllegalArgumentException e) {// исключение о некорректном аргументе

            return Habitat.INDEFINED;
        }
    }

    public static void outputStrings(String[] strings) {
        for (int i=0;i<strings.length;i+=1) { // выводит массив строк [1] [2]
            System.out.println(strings[i]);
        }
    }
}
