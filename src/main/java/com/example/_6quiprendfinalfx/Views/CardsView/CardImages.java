package com.example._6quiprendfinalfx.Views.CardsView;

import com.example._6quiprendfinalfx.model.CardSetups.Card;
import com.example._6quiprendfinalfx.model.CardSetups.Deck;
import javafx.scene.image.Image;
import lombok.Data;

import java.net.URL;

@Data
public class CardImages {
    private static final Image backsideImage = createBacksizeImage();
    private static final Image[] cardImages = createCardImages();
    public static Image getBacksideImage() {
        return backsideImage;
    }
    public static Image getFrontCardImage(Card card) {
        return (card != null)? cardImages[card.value] : backsideImage;
    }
    private static Image createBacksizeImage() {
        URL imgUrl = CardImages.class.getResource("backside.png");
        assert imgUrl != null;
        return new Image(imgUrl.toExternalForm());
    }
    private static Image[] createCardImages() {
        Image[] res = new Image[1+ Deck.MAX_CARD_VALUE];
        res[0] = null;
        for(int i = 1; i <= Deck.MAX_CARD_VALUE; i++) {
            URL imgUrl = CardImages.class.getResource(i + ".png");
            assert imgUrl != null;
            res[i] = new Image(imgUrl.toExternalForm());
        }
        return res;
    }
}
