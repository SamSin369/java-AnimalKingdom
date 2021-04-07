package animalKingdom;

public class Fish extends Animal {
    private String move = "Swim";
    private String breath = "Gills";
    private String reproduce = "Egg";

    public Fish(String name, int year) {
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
