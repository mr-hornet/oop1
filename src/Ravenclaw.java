public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, String surname, int witchcraft,
                     int transgress, int mind, int wisdom, int wit, int creation) {
        super(name, surname, witchcraft, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }

    @Override
    public int sumParameters() {
        return super.sumParameters() + mind + wisdom + wit + creation;
    }
}
