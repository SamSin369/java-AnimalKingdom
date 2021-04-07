package animalKingdom;

public class Mammal extends Animal {
    private String move = "walking";
    private String breath = "lungs";
    private String reproduce = "liveBirth";

    public Mammal(String name, int year) {
        super(name, year);

    }

    @Override
    public String move() {
        return "This Animal Moves By " + move;
    }

    @Override
    public String breath() {
        return "This Animal Breathes By " + breath;
    }

    @Override
    public String reproduce() {
        return "This Animal Has Birth By " + reproduce;
    }

}
