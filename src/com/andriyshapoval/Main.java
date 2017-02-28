package com.andriyshapoval;

public class Main {

    public static void checkFermat(double a, double b, double c, double n){
        if(Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n >= 2){
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }

    public static void beerSong(int bottles) {
        if(bottles == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                    "’cause there are no more bottles of beer on the wall!");
        }else {
            System.out.println(bottles + " bottles of beer on the wall,\n" +
                    bottles + " bottles of beer,\n" +
                    "ya’ take one down, ya’ pass it around,\n" +
                    (bottles -1) + " bottles of beer on the wall.");
            beerSong(bottles - 1);
        }
    }


    public static void main(String[] args) {

        beerSong(99);
    }
}
