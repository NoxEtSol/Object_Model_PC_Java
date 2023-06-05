package model;

public class Procesor {

    private String manufaturer;
    private String frequency;

    public Procesor(String manufaturer, String frequency) {
        this.manufaturer = manufaturer;
        this.frequency = frequency;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public String getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Procesor{" +
                "manufaturer='" + manufaturer + '\'' +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}
