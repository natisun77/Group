package com.nikitina.flower;

import com.nikitina.flower.entity.Chamomile;
import com.nikitina.flower.entity.Flower;
import com.nikitina.flower.entity.Rose;
import com.nikitina.flower.entity.Tulip;

public class FlowerStore {
    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int roses, int tulips, int chamomiles) {
        int numberOfFlowers = roses + tulips + chamomiles;
        Flower[] bouquet = new Flower[numberOfFlowers];
        for (int i = 0; i < roses; i++) {
            bouquet[i] = new Rose();
        }
        for (int i = roses; i < roses + tulips; i++) {
            bouquet[i] = new Tulip();
        }
        for (int i = roses + tulips; i < numberOfFlowers; i++) {
            bouquet[i] = new Chamomile();
        }
        adjustBalance(bouquet);
        return bouquet;
    }

    public Flower[] sellSequence(int roses, int tulips, int chamomiles) {
        int numberOfFlowers = roses + tulips + chamomiles;
        Flower[] bouquet = new Flower[numberOfFlowers];
        int i = 0;
        while (i < numberOfFlowers) {
            if (roses > 0) {
                bouquet[i] = new Rose();
                roses--;
                i++;
            }
            if (tulips > 0) {
                bouquet[i] = new Tulip();
                tulips--;
                i++;
            }
            if (chamomiles > 0) {
                bouquet[i] = new Chamomile();
                chamomiles--;
                i++;
            }
        }
        adjustBalance(bouquet);
        return bouquet;
    }

    private void adjustBalance(Flower[] bouquet) {
        for (int i = 0; i < bouquet.length; i++) {
            wallet += bouquet[i].getPrice();
        }
    }

}
