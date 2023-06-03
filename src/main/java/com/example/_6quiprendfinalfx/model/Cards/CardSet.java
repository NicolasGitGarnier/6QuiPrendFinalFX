package com.example._6quiprendfinalfx.model.Cards;

import lombok.Data;
import java.util.Collection;
import java.util.TreeSet;

@Data
public class CardSet {
    private final TreeSet<Card> cards = new TreeSet<>();
    public CardSet(Collection<Card> ls) {
        cards.addAll(ls);
    }
    public void add(Card c) {
        boolean remove = cards.remove(c);
        if (!remove) throw new IllegalArgumentException();
    }

}

