## ING Zoo

This Java application is an exercise requested by the **ING Tech Research & Development** department to verify 
my competences for a potential graduation internship position. It's probably a bad idea to use this as a learning 
reference.

This is an improved version. The original version can be found [here](https://bitbucket.org/corebankresearch/zoo/src/master/).

The application is loosely based on the [Strategy design pattern](https://www.oodesign.com/strategy-pattern.html). 
There are some caveats in the application because of this:
- One of the strengths of the Strategy pattern is its ability to change an object's strategy at runtime, but no use 
is made of this. While this change is certainly realistic for humans (Omnivore to Herbivore), in the animal kingdom 
this may only occur due to evolution (I think). The pattern was mostly chosen to prevent code duplication in nearly identical
arbitrary classes like Carnivore, Herbivore and Omnivore.
- In the original application, Omnivorous creatures had differing responses for eating leaves and plants - this is 
not reflected here. It may be possible to turn the IEatingStrategy into an abstract class though this requires some 
work on the Animal class itself and defeats the purpose of the pattern. In other words, a design oversight. Whoops!
    