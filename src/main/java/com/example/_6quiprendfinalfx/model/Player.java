package com.example._6quiprendfinalfx.model;

import com.example._6quiprendfinalfx.model.CardSetups.Card;
import javafx.scene.image.ImageView;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Player {
    private String name;
    private List<Card> hand;
    private List<ImageView> handImages;
    private int penalities;
    private boolean Ai;
    public Player(String name,boolean isAi) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.handImages = new ArrayList<>();
        this.penalities = 0;
        this.Ai = isAi;
    }
    public void addCardToHand(Card card) {
        hand.add(card);
    }
    public void addCardImageView(ImageView card) {
        handImages.add(card);
    }
}
