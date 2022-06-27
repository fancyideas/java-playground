package com.playground;

public class Main {
    public static void main(String[] args) {
        // 不会触发短路 &&
        boolean result01 = compute01(4);
        boolean result02 = compute02(1);
        boolean result03 = compute03(5);
        System.out.println(result01 && result02 && result03);
        // 触发短路 &&
//        boolean result = compute01(4) && compute02(1) && compute03(5);
//        System.out.println(result);
    }

    private static boolean compute01(int arg) {
        System.out.println("compute01");
        return arg > 3;
    }

    private static boolean compute02(int arg) {
        System.out.println("compute02");
        return arg > 3;
    }

    private static boolean compute03(int arg) {
        System.out.println("compute03");
        return arg > 3;
    }
}
