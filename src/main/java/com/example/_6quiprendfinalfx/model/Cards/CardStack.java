package com.example._6quiprendfinalfx.model.Cards;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ToString
@Data
public class CardStack { // Cartes par rangées
    private List<Card> cards = new ArrayList<>(5);
    private Boolean interacted = false;
    public CardStack(Card firstCard) {
        Objects.requireNonNull(firstCard);
        resetWithTopCard(firstCard);
    }
    public void add(Card card){
        this.cards.add(card);
    }
    public void resetWithTopCard(Card card) {
        this.cards.clear();
        this.cards.add(card);
    }
}
