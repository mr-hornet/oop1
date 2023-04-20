public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int witchcraft,
                      int transgress, int nobility, int honor, int bravery) {
        super(name, surname, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public int sumParameters() {
        return super.sumParameters() + nobility + honor + bravery;
    }




}
