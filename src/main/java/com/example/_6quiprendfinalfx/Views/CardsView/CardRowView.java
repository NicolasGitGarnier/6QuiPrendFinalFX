package com.example._6quiprendfinalfx.Views.CardsView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class CardRowView {
    private List<ImageView> cardsImages = new ArrayList<>(5);
    public CardRowView() {}
    public void add(ImageView cardView) {
        cardsImages.add(cardView);
    }
    public void updateImages(int index, String imagelink) {
        cardsImages.get(index).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagelink))));
    }
}
