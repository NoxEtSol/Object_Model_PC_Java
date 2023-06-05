package model;

public class Memory {

    private String size;
    private String speed;

    public Memory(String size, String speed) {
        this.size = size;
        this.speed = speed;
    }

    public String getSize() {
        return size;
    }

    public String getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size='" + size + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
