package com.ing.zoo.strategies;

public class OmnivorousStrategy implements IEatingStrategy {
    public void eat(String food, String eatingPhrase) {
        if (food.equals("leaves")) {
            System.out.println(eatingPhrase);
        } else if (food.equals("meat")) {
            System.out.println(eatingPhrase);
        } else {
            // Animal doesn't know what this food is
        }
    }
}
