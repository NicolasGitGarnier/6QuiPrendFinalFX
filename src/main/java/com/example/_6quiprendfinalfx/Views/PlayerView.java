package com.example._6quiprendfinalfx.Views;

import com.example._6quiprendfinalfx.Views.CardsView.CardView;
import com.example._6quiprendfinalfx.model.Cards.Card;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class PlayerView {
    private final HBox component = new HBox();
    private List<CardView> handCardsViews;
    public PlayerView() {
        handCardsViews = new ArrayList<>(); // Liste vide -> Pas de cartes
    }
    public void addCardToHand(Card card) {
        CardView cardView = new CardView(card, 78, 120);
        handCardsViews.add(cardView);
        component.getChildren().add(cardView.getComponent());
    }
}
