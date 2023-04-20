public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, String surname, int witchcraft,
                     int transgress, int cunning, int determination,
                     int ambition, int resourcefulness, int power) {
        super(name, surname, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                '}';
    }

    @Override
    public int sumParameters() {
        return super.sumParameters() + cunning + determination + ambition + resourcefulness + power;
    }
}
