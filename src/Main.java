public class Main {
    public static void main(String[] args) {

        Gryffindor garry = new Gryffindor("Garry", "Potter", 90, 80, 62, 32, 84);
        Gryffindor hermione = new Gryffindor("Hermione", "Granger", 54, 45, 68, 99, 35);
        Gryffindor ron = new Gryffindor("Ron", "Weasley", 15, 89, 19, 65, 32);

        Slytherin draco = new Slytherin("Draco", "Malfoy", 65, 89, 45, 21, 32, 78, 45);
        Slytherin graham = new Slytherin("Graham", "Montagu", 45, 69, 32, 11, 47, 56, 12);
        Slytherin gregory = new Slytherin("Gregory", "Goyle", 47, 56, 55, 23, 12, 1, 14);

        Hufflepuff zacharias = new Hufflepuff("Zacharias", "Smith", 44, 69, 12, 32, 78);
        Hufflepuff cedric = new Hufflepuff("Cedric", "Diggory", 78, 98, 12, 11, 32);
        Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchley", 44, 23, 47, 1, 9);

        Ravenclaw zhou = new Ravenclaw("Zhou", "Chang", 41, 2, 78, 11, 3, 5);
        Ravenclaw padma = new Ravenclaw("Padma", "Patil", 78, 98, 12, 1, 32, 45);
        Ravenclaw marcus = new Ravenclaw("Marcus", "Belby", 45, 12, 23, 65, 78, 98);

        print(garry);
        print(cedric);

        System.out.println(compareGryffindor(garry, hermione));
        System.out.println(compareRavenclaw(zhou, padma));
        System.out.println(compareSlytherin(draco, graham));
        System.out.println(compareHufflepuff(zacharias, justin));

        System.out.println(compare(draco, garry));

    }


    public static void print(Hogwarts student) {
        System.out.println(student);
    }

    public static String compareGryffindor(Gryffindor first, Gryffindor second) {
        if (first.sumParameters() > second.sumParameters()) {
            return first.getName() + " лучший Грифиндорец чем " + second.getName();
        } else if (first.sumParameters() < second.sumParameters()) {
            return second.getName() + " лучший Грифиндорец чем " + first.getName();
        } else {
            return first.getName() + " равны с " + second.getName();
        }
    }

    public static String compareRavenclaw(Ravenclaw first, Ravenclaw second) {
        if (first.sumParameters() > second.sumParameters()) {
            return first.getName() + " лучший Когтевранец чем " + second.getName();
        } else if (first.sumParameters() < second.sumParameters()) {
            return second.getName() + " лучший Когтевранец чем " + first.getName();
        } else {
            return first.getName() + " равны с " + second.getName();
        }
    }

    public static String compareSlytherin(Slytherin first, Slytherin second) {
        if (first.sumParameters() > second.sumParameters()) {
            return first.getName() + " лучший Слизеринец чем " + second.getName();
        } else if (first.sumParameters() < second.sumParameters()) {
            return second.getName() + " лучший Слизеринец чем " + first.getName();
        } else {
            return first.getName() + " равны с " + second.getName();
        }
    }

    public static String compareHufflepuff(Hufflepuff first, Hufflepuff second) {
        if (first.sumParameters() > second.sumParameters()) {
            return first.getName() + " лучший Пуффендуец чем " + second.getName();
        } else if (first.sumParameters() < second.sumParameters()) {
            return second.getName() + " лучший Пуффендуец чем " + first.getName();
        } else {
            return first.getName() + " равны с " + second.getName();
        }
    }

    public static String compare(Hogwarts first, Hogwarts second) {
        if (first.forCompareMagic() > second.forCompareMagic()) {
            return first.getName() + " " + first.getSurname() + " обладает большей мощностью магии, чем " + second.getName() + " " + second.getSurname();
        } else if (first.forCompareMagic() < second.forCompareMagic()) {
            return second.getName() + " " + second.getSurname() + " обладает большей мощностью магии, чем " + first.getName() + " " + first.getSurname();
        } else {
            return first.getName() + " " + first.getSurname() + " равны с " + second.getName() + " " + second.getSurname();
        }
    }


}