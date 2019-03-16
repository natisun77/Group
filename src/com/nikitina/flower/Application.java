package com.nikitina.flower;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        FlowerStore store = new FlowerStore();
        System.out.println("Wallet is: " + store.getWallet());
        System.out.println(Arrays.toString(store.sell(2, 4, 4)));
        System.out.println("Wallet is: " + store.getWallet());
        store.sellSequence(3, 2, 1);
        System.out.println("Wallet is: " + store.getWallet());
        System.out.println(Arrays.toString(store.sellSequence(5, 3, 4)));
        System.out.println("Wallet is: " + store.getWallet());
    }
}
