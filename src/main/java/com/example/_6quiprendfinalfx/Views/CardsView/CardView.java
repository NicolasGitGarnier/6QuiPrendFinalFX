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
    protected StackPane stackFrontOrBack;
    protected ImageView frontImageView;
    protected ImageView backImageView;
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
        Image backImage = CardImages.getBacksideImage();
        frontImageView = new ImageView(frontImage);
        frontImageView.setPreserveRatio(true);
        frontImageView.setFitWidth(width);

        backImageView = new ImageView(backImage);
        backImageView.setPreserveRatio(true);
        backImageView.setFitWidth(width);

        stackFrontOrBack = new StackPane(backImageView, frontImageView);
        component.getChildren().add(stackFrontOrBack);
        component.setPrefSize(width, height);
    }
}
