package com.company;

public abstract class Animals implements Quantity {

    // Fields.
    private String animalsName;

    // Getters and Setters.
    public String getAnimalsName() {

        return animalsName;
    }

    public void setAnimalsName(String animalsName) {

        this.animalsName = animalsName;
    }
    @Override
    public int quanAni() {
        String str = getAnimalsName();
        int count = 0;
        for(int i = 0; i<str.length(); i++) {
            count++;
        }
        return count;

    }
    public abstract void changeData();

    public abstract Animals inputAnimals();

    public abstract String info();
}
