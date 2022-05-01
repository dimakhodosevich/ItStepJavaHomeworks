package by.itstep.khodosevich.secondproject.module.data;

public class Dinosaur {

    public static final int GRAMM_IN_KILLOGRAMM = 1000;
    public static final int KILLOGRAMM_IN_CENTNER = 100;
    public static final int CENTNER_IN_TON = 10;

    private long weightInGramm;
    private String name;

    public Dinosaur() {
        this.name = "no name";
        this.weightInGramm = 50000l;
    }

    public Dinosaur(String name, long gramm) {
        this.name = name;
        this.weightInGramm = gramm;
    }

    public Dinosaur(Dinosaur dinosaur) {
        this.name = dinosaur.name;
        this.weightInGramm = dinosaur.weightInGramm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(long gramm) {
        this.weightInGramm = gramm;
    }

    public String getName() {
        return this.name;
    }

    public long getWeight() {
        return this.weightInGramm;
    }

    public static int translateGrammToKillogramm(long gramm) {
        if (gramm <= 0) {
            return -1;
        }

        return (int) (gramm / GRAMM_IN_KILLOGRAMM);
    }

    public static int translateKillogrammToCentner(int killogramm) {

        if (killogramm <= 0) {
            return -1;
        }

        return killogramm / KILLOGRAMM_IN_CENTNER;
    }

    public static int translateCentnerToTon(int centner) {

        if (centner <= 0) {
            return -1;
        }

        return centner / CENTNER_IN_TON;
    }
}
