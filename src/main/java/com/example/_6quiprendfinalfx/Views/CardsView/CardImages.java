package com.example._6quiprendfinalfx.Views.CardsView;

import com.example._6quiprendfinalfx.model.CardSetups.Card;
import com.example._6quiprendfinalfx.model.CardSetups.Deck;
import javafx.scene.image.Image;
import lombok.Data;

import java.net.URL;

@Data
public class CardImages {
    private static final Image backsideImage = createBackCardImage();
    private static final Image[] cardImages = createCardImages();
    public static Image getFrontCardImage(Card card) {
        return (card != null)? cardImages[card.value] : backsideImage;
    }
    private static Image createBackCardImage() {
        URL imgUrl = CardImages.class.getResource("backside.png");
        assert imgUrl != null;
        return new Image(imgUrl.toExternalForm());
    }
    private static Image[] createCardImages() {
        Image[] cardImage = new Image[1+ Deck.MAX_CARD_VALUE];
        cardImage[0] = null;
        for(int i = 1; i <= Deck.MAX_CARD_VALUE; i++) {
            URL imgUrl = CardImages.class.getResource(i + ".png");
            assert imgUrl != null;
            cardImage[i] = new Image(imgUrl.toExternalForm());
        }
        return cardImage;
    }
}
