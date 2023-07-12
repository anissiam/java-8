package oop.interfaces;

public class MSIWaterRGB extends Computer implements WaterCoolerRGB{
    public MSIWaterRGB() {
    }

    public MSIWaterRGB(int RAM, String CPU, int storage, String GPU) {
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
        return false;
    }

    @Override
    public void addRGB() {
        System.out.println("Blue and RED");
    }
}
