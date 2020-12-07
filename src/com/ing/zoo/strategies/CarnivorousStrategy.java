package com.ing.zoo.strategies;

public class CarnivorousStrategy implements IEatingStrategy {
    public void eat(String food, String eatingPhrase) {
        if (food.equals("leaves")) {
            // Animal doesn't eat this food
        } else if (food.equals("meat")) {
            System.out.println(eatingPhrase);
        } else {
            // Animal doesn't know what this food is
        }
    }
}
