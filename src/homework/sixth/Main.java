package homework.sixth;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FlowerStore store = new FlowerStore();
        System.out.println("Wallet is: " + store.getWallet());
        System.out.println(store.sell(2, 4, 6));
        System.out.println("Wallet is: " + store.getWallet());
        store.sellSequence(3, 2, 1);
        System.out.println("Wallet is: " + store.getWallet());
        System.out.println(store.sellSequence(5, 3, 2));
    }
}
