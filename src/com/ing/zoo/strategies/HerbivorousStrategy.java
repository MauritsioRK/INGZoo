package com.ing.zoo.strategies;

public class HerbivorousStrategy implements IEatingStrategy {
    public void eat(String food, String eatingPhrase) {
        if (food.equals("leaves")) {
            System.out.println(eatingPhrase);
        } else if (food.equals("meat")) {
            // Animal doesn't eat this food
        } else {
            // Animal doesn't know what this food is
        }
    }
}
