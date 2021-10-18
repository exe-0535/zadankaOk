package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,17,38,45,-13,14};
        wypiszSumeTrzechLiczb(3,4,5);
        wypiszSumeTrzechLiczb(4,5,6);
        wypiszSumeTrzechLiczb(7,8,9);

        System.out.println(suma(1,2,3));
        System.out.println(wieksza(4,5));
        System.out.println(boolA(4));
        System.out.println(witam(6,9,7));
        echo("Witam");
        System.out.println(czyKwadrat(5,5));
        System.out.println(czyRownoboczny(7,8,9));
        System.out.println(czyIstniejeTrojkat(4,3,0));
        System.out.println(czyProstokatny(3,6,5));
        piszTablice(a);
        tab(a);
        tabb(a);
        System.out.println(asd(a,5,4));
        System.out.println(znajdzNajwieksza(a));
    }
    public static void wypiszSumeTrzechLiczb(int a, int b, int c) {
        System.out.println("Suma twoich trzech liczb to: " + (a + b + c));
    }
    public static boolean czyLiczba(int liczba) {
        return liczba % 2 == 0;
    }

    // 1

    public static int suma(int x, int y, int z) {
        return  x + y + z;
    }

    // 2

    public static int wieksza(int x, int z) {
        return Math.max(x,z);
    }

    // 3

    public static boolean boolA(int x) {
        return x > 0;
    }

    // 4

    public static int witam(int x, int y, int z) {
         return Math.max(Math.max(x,y),Math.max(y,z));
    }

    // 5

    public static void echo(String echo) {
        System.out.println(echo);
    }

    // 6

    public static boolean czyKwadrat(int x, int z) {
        return x == z;
    }

    // 7

    public static boolean czyRownoboczny(int x, int y, int z) {
        return x == z && z == y;
    }

    // 8

    public static boolean czyIstniejeTrojkat(int x, int y, int z) {
        return x + y >= z && y + z >= x && x + z >= y;
    }

    // 9

    public static boolean czyProstokatny(int x, int y, int z) {
        return (x*x) + (y*y) == (z*z);
    }

    // 10

    public static void piszTablice(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    // 11

    public static void tab(int[] a) {
        for(int i: a) {
            if(i > 0) System.out.println(i);
        }
    }

    // 12

    public static void tabb(int[] a) {
        for(int i : a) {
            if(i % 2 == 0) System.out.println(i);
        }
    }

    // 13

    public static String asd(int[] a, int x, int y) {
        x = a.length;
        y = a[0];
        a[0] = x;
        a[a.length - 1] = y;
        return Arrays.toString(a);
    }

    // 14

    public static int znajdzNajwieksza(int[] a) {
        int max = Integer.MIN_VALUE;
        for(var i : a) {
            if(i > max) max = i;
        }
        return max;
    }


}
