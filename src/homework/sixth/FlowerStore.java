package homework.sixth;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public List<Flower> sell(int roses, int tulips, int chamomiles) {
        List<Flower> bouquet = new ArrayList<>();
        for (int i = 0; i < roses; i++) {
            bouquet.add(new Rose());
        }
        for (int i = 0; i < tulips; i++) {
            bouquet.add(new Tulip());
        }
        for (int i = 0; i < chamomiles; i++) {
            bouquet.add(new Chamomile());
        }
        wallet += roses * Rose.PRICE + tulips * Tulip.PRICE + chamomiles * Chamomile.PRICE;
        return bouquet;
    }

    public List<Flower> sellSequence(int roses, int tulips, int chamomiles) {
        List<Flower> bouquet = new ArrayList<>();
        wallet += roses * Rose.PRICE + tulips * Tulip.PRICE + chamomiles * Chamomile.PRICE;
        int numberOfFlowers = roses + tulips + chamomiles;
        while (bouquet.size() < numberOfFlowers) {
            if (roses > 0) {
                bouquet.add(new Rose());
                roses--;
            }
            if (tulips > 0) {
                bouquet.add(new Tulip());
                tulips--;
            }
            if (chamomiles > 0) {
                bouquet.add(new Chamomile());
                chamomiles--;
            }
        }
        return bouquet;
    }

}
