package animalKingdom;

public abstract class Animal {
    protected String name;
    protected int id;
    private static int maxId = 0;
    protected int year;

    public Animal(String name, int year) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }

    public int Eat(int food) {
        return food--;
    }

    public int getYear() {
        return year;
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();

    @Override
    public String toString() {
        return "Animals{id=" + this.id + ", name=" + this.name + " , yearNamed=" + this.year + "}";
    }
}
