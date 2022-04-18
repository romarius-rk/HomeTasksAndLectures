package lec6.task2Computer;

public class RAM {
    private String model;
    private int capacity;

    public RAM(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String toString() {
        return String.format("RAM spec: %s, %d.",
                this.model, this.capacity);
    }
}
