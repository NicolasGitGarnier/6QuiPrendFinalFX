package com.example._6quiprendfinalfx.Views.CardsView;

import com.example._6quiprendfinalfx.model.Cards.Card;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import lombok.Getter;

public class CardView {
    @Getter
    protected Pane component;
    protected StackPane stackView;
    protected ImageView frontImageView;
    protected Card card;
    protected boolean frontSide;
    public CardView(Card card, int width, int height) {
        this.card = card;
        this.frontSide = true;
        if (card == null) {
            this.frontSide = false;
        }
        component = new Pane();
        Image frontImage = CardImages.getFrontCardImage(card);
        frontImageView = new ImageView(frontImage);
        frontImageView.setPreserveRatio(true); // Garder la proportion ors de l'ajustement de l'image
        frontImageView.setFitWidth(width);

        stackView = new StackPane(frontImageView);
        component.getChildren().add(stackView);
        component.setPrefSize(width, height);
    }
}
