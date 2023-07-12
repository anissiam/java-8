package oop.interfaces;

public class MSI extends Computer implements WaterCooler,ABC {

    public MSI() {
    }

    public MSI(int RAM, String CPU, int storage, String GPU) {
        super(RAM, CPU, storage, GPU);
    }

    @Override
    public int tankSize(int size) {
        return size;
    }

    @Override
    public int tubesLength() {
        return 1;
    }

    @Override
    public boolean isGPUWater(boolean bool) {
        return bool;
    }
}
