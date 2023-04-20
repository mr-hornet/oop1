public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int witchcraft,
                      int transgress, int industriousness, int loyalty, int honesty) {
        super(name, surname, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    @Override
    public int sumParameters() {
        return super.sumParameters() + industriousness + loyalty + honesty;
    }
}
