package com.example._6quiprendfinalfx.model.CardSetups;

import lombok.Data;

@Data
public class Card implements Comparable<Card> {
    public final int value;
    public final int penalty;

    public Card(int value, int penalty) {
        this.value = value;
        this.penalty = penalty;
    }
    @Override
    public int compareTo(Card otherCard) {
        return Integer.compare(this.value, otherCard.value);
    }
}

