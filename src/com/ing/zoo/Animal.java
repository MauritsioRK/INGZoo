package com.ing.zoo;

import com.ing.zoo.strategies.IEatingStrategy;

import java.util.Random;

/**
 *
 */
public class Animal {
    private Random rng = new Random(1234);

    private IEatingStrategy eatingStrategy;
    private String helloPhrase;
    private String eatingPhrase;
    private String[] tricks;

    /**
     * Class constructor
     * @param eatingStrategy The animal's eating strategy, class as per Strategy pattern
     * @param helloPhrase String printed during hello commands
     * @param eatingPhrase String printed during eat commands
     * @param tricks Available trick Strings during perform commands
     */
    public Animal(IEatingStrategy eatingStrategy, String helloPhrase, String eatingPhrase, String[] tricks) {
        this.eatingStrategy = eatingStrategy;
        this.helloPhrase = helloPhrase;
        this.eatingPhrase = eatingPhrase;
        this.tricks = tricks;
    }

    /**
     * Calls and prints the hello phrase
     */
    public void sayHello() {
        System.out.println(this.helloPhrase);
    }

    /**
     * Passes the food to the animal's Strategy
     * @param food The given food String
     */
    public void eat(String food) {
        eatingStrategy.eat(food, this.eatingPhrase);
    }

    /**
     * Performs a random trick from a set the animal knows
     */
    public void performTrick() {
        if (this.tricks.length == 0) {
            // Animal doesn't know any tricks - no implementation
        } else {
            int trickIndex = rng.nextInt(this.tricks.length);
            System.out.println(this.tricks[trickIndex]);
        }

    }
}
