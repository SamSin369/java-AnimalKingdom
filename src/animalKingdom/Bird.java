package animalKingdom;

public class Bird extends Animal {
    private String move = "Fly";
    private String breath = "Lungs";
    private String reproduce = "Egg";

    public Bird(String name, int year) {
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
