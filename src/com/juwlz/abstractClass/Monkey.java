package com.juwlz.abstractClass;

public class Monkey implements Living {

    private String favFood;

    @Override
    public void setName(String newName) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setHeight(String newHeight) {

    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public void setWeight(String newWeight) {

    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setFavFood(String newFood) {
        favFood = newFood;


    }

    @Override
    public String getFavFood() {
        return favFood;
    }

    @Override
    public void setSpeed(String newSpeed) {

    }

    @Override
    public double getSpeed() {
        return 0;
    }

    @Override
    public void setSound(String newSound) {

    }

    @Override
    public String getSound() {
        return null;
    }
}
