package oop.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MSIWaterRGB msiWaterRGB = new MSIWaterRGB(8, "I7", 2, "RTX 3090");
        msiWaterRGB.addRGB();
        msiWaterRGB.isGPUWater(false);
        msiWaterRGB.tankSize(200);
        System.out.println(msiWaterRGB.toString());

        ///////////////////////////////////////////////////////////////////////////////////////////////////
        MSI msi = new MSI(16, "I9", 1, "RTX 4080");
        boolean b = msi.isGPUWater(true);
        int tankSize = msi.tankSize(150);
        System.out.println(msi.toString());

        int c;
        do {
            System.out.println("1.)Show Computer Data\n2.)Show GPU status\n3.)Show Tank Size\n4.)Update RAM Size");
            c = scanner.nextInt();
            switch (c) {
                case 1 :
                    System.out.println(msi.toString());
                    break;
                case 2 :
                    checkGPU(b);
                    break;
                case  3 :
                    System.out.println(tankSize + " ML");
                    break;
                case 4 :
                    updateRam(scanner, msi);
                    break;
            }

        }while (c<5);



    }

    private static void updateRam(Scanner scanner, MSI msi) {
        System.out.println("Enter new ram size");
        int ram = scanner.nextInt();
        msi.setRAM(ram);
    }

    private static void checkGPU(boolean b) {
        if(b){
            System.out.println("The GPU is water cooler");
        }else {
            System.out.println("The GPU is not water cooler");
        }
    }
}
