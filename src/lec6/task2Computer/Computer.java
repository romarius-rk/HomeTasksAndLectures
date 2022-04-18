package lec6.task2Computer;

public class Computer {
    private int cost;
    private String model;
    private RAM ram;
    private HDD hdd;

    protected Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    protected Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String toString(){
        return String.format("Computer characters: %s, %d, %s, %s.",
                this.model, this.cost, this.ram, this.hdd);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }
}
