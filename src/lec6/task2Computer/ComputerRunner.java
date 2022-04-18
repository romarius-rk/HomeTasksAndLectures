package lec6.task2Computer;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer(100000, "GayEngine");
        RAM ram = new RAM("GayShitInfarct", 1248);
        HDD hdd = new HDD("GayShitMemory", 40, true);
        computer.setHdd(hdd);
        computer.setRam(ram);
        System.out.println(computer);

        Computer computer1 = new Computer(193029,"CasualShit",ram,hdd);
        System.out.println(computer1);
    }
}
