package com.example._6quiprendfinalfx.Views.CardsView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CardStackView {
    private List<ImageView> cardsImages = new ArrayList<>(5);
    public CardStackView() {
    }
    public void add(ImageView cardView) {
        cardsImages.add(cardView);
    }
    public void updateImageByIndex(int index, String imagelink) {
        cardsImages.get(index).setImage(new Image(getClass().getResourceAsStream(imagelink)));
    }
}
