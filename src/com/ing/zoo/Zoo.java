package com.ing.zoo;

import com.ing.zoo.strategies.CarnivorousStrategy;
import com.ing.zoo.strategies.HerbivorousStrategy;
import com.ing.zoo.strategies.OmnivorousStrategy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Animal(new CarnivorousStrategy(), "roooaoaaaaar",
                "nomnomnom thx mate", new String[]{});
        Animal hippo = new Animal(new HerbivorousStrategy(), "splash",
                "munch munch lovely", new String[]{});
        Animal pig = new Animal(new OmnivorousStrategy(), "splash",
                "munch nom oink", new String[]{"rolls in the mud", "runs in circles"});
        Animal tiger = new Animal(new CarnivorousStrategy(), "rraaarrw",
                "nomnomnom oink wubalubadubdub", new String[]{"jumps in tree", "scratches ears"});
        Animal zebra = new Animal(new HerbivorousStrategy(), "zebra zebra",
                "munch munch zank yee bra", new String[]{});
        Animal sparrow = new Animal(new OmnivorousStrategy(), "chirp chirp",
                "peck peck peck", new String[]{"fly away", "hop around"});

        // HashMap, with the animal's name as the key
        Map<String, Animal> allAnimals = new HashMap<>();

        allAnimals.put("henk", lion);
        allAnimals.put("elsa", hippo);
        allAnimals.put("dora", pig);
        allAnimals.put("wally", tiger);
        allAnimals.put("marty", zebra);
        allAnimals.put("harry", sparrow);
        allAnimals.put("artemis", tiger);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("List of commands: hello, hello [name], give leaves, give meat, perform trick, exit");
            System.out.print("Enter your command: ");
            String[] arguments = scanner.nextLine().split(" ");

            if (arguments.length > 2) {
                System.out.println("Invalid amount of args");
            }
            // Commands for greeting animals
            else if (arguments[0].equals("hello") && arguments.length == 1) {
                Collection<Animal> animalValues = allAnimals.values();
                for (Animal animal : animalValues) {
                    animal.sayHello();
                }
            } else if (arguments[0].equals("hello") && arguments.length == 2) {
                try {
                    allAnimals.get(arguments[1]).sayHello();
                } catch (NullPointerException ex) {
                    System.out.println("(no reply)");
                }
            }
            // Commands for feeding animals
            else if (arguments[0].equals("give") && arguments.length == 1) {
                System.out.println("Invalid amount of args");
            } else if (arguments[0].equals("give") && arguments.length == 2) {
                Collection<Animal> animalValues = allAnimals.values();
                for (Animal animal : animalValues) {
                    animal.eat(arguments[1]);
                }
            }
            // Commands for having animals perform tricks
            else if (arguments[0].equals("perform") && arguments.length == 1) {
                System.out.println("Invalid amount of args");
            } else if (arguments[0].equals("perform") && arguments[1].equals("trick")) {
                Collection<Animal> animalValues = allAnimals.values();
                for (Animal animal : animalValues) {
                    animal.performTrick();
                }
            }
            // Other
            else if (arguments[0].equals("exit")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
