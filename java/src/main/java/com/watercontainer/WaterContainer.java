package com.watercontainer;

public final class WaterContainer {

    private WaterContainer() {
    }

    public static int waterContainer(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int max1 = 0;
        int max2 = 0;
        for (int a : arr) {
            if (a > max1) {
                max2 = max1;
                max1 = a;
            }
        }

        if (max1 == max2) {
            return max1 * arr.length;
        }

        return (max2 * arr.length) + ((max1 - max2) / 2) * arr.length;
    }

    public static void main(String[] args) {
        System.out.println(waterContainer(new int[] { 1, 5, 9, 3, 2, 0 }));
    }
}
