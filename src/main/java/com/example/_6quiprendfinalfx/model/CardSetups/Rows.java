package com.example._6quiprendfinalfx.model.CardSetups;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ToString
@Data
public class Rows { // Cartes par rangées
    private List<Card> cards = new ArrayList<>(5);
    public Rows(Card firstCard) {
        Objects.requireNonNull(firstCard);
        rebootRow(firstCard);
    }
    public void add(Card card){
        this.cards.add(card);
    }
    public void rebootRow(Card card) {
        this.cards.clear();
        this.cards.add(card);
    }
}
