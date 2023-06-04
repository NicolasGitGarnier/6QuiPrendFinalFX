package com.example._6quiprendfinalfx.model.Cards;

import lombok.Data;
import java.util.Collection;
import java.util.TreeSet;

@Data
public class Hand { // Ensemble de cartes/Groupe de cartes donné à un joueur dans la classe Deck.
    private final TreeSet<Card> cards = new TreeSet<>(); // Ensemble des cartes de la main du joueur. Gardé dans l'ordre bien précis.
    public Hand(Collection<Card> listOfCards) {
        cards.addAll(listOfCards);
    }
    public void add(Card indexCard) {
        boolean remove = cards.remove(indexCard);
        if (!remove) throw new IllegalArgumentException();
    }

}

