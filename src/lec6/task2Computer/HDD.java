package lec6.task2Computer;

public class HDD {
    private String model;
    private int capacity;
    private boolean portable;

    public HDD(String model, int capacity, boolean portable) {
        this.model = model;
        this.capacity = capacity;
        this.portable = portable;
    }

    public String toString() {
        return String.format("HDD spec: %s, %d, portable is %s.",
                this.model, this.capacity, this.portable);
    }
}
