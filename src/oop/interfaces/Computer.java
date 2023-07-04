package oop.interfaces;

public class Computer {
    private int RAM;
    private String CPU;
    private int storage;
    private String GPU;

    public Computer() {
    }

    public Computer(int RAM, String CPU, int storage, String GPU) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.storage = storage;
        this.GPU = GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM=" + RAM + "GB " +
                ", CPU='" + CPU + '\'' +
                ", storage=" + storage +" TB " +
                ", GPU='" + GPU + '\'' +
                '}';
    }
}
