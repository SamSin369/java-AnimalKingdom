package animalKingdom;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // System.out.println(zebra.reproduce());
        // System.out.println(zebra);
        // System.out.println(eagle.reproduce());
        // System.out.println(eagle);
        // System.out.println(trout);
        // System.out.println(trout.move());

        List<Mammal> mammalList = new ArrayList<Mammal>();
        mammalList.add(new Mammal("Panda", 1869));
        mammalList.add(new Mammal("Zebra", 1778));
        mammalList.add(new Mammal("Koala", 1816));
        mammalList.add(new Mammal("Sloth", 1804));
        mammalList.add(new Mammal("Armadillo", 1758));
        mammalList.add(new Mammal("Raccoon", 1758));
        mammalList.add(new Mammal("BigFoot", 2021));
        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(new Bird("Pigeon", 1837));
        birdList.add(new Bird("Peacock", 1821));
        birdList.add(new Bird("Toucan", 1758));
        birdList.add(new Bird("Parrot", 1824));
        birdList.add(new Bird("Swan", 1758));
        List<Fish> fishList = new ArrayList<Fish>();
        fishList.add(new Fish("Salmon", 1758));
        fishList.add(new Fish("CatFish", 1758));
        fishList.add(new Fish("Perch", 1758));

        List<Animal> animalList = new ArrayList<Animal>();

        mammalList.forEach((mammal) -> animalList.add(mammal));
        birdList.forEach((bird) -> animalList.add(bird));
        fishList.forEach((fish) -> animalList.add(fish));
        animalList.forEach((animal) -> System.out.println(animal));
        animalList.sort((Animal a1, Animal a2) -> {
            return (a1.getYear() > a2.getYear()) ? 1 : -1;
        });
        System.out.println(animalList);
    }
}