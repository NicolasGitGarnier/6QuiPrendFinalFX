package com.example._6quiprendfinalfx.Views;

import com.example._6quiprendfinalfx.Views.CardsView.CardStackView;
import com.example._6quiprendfinalfx.model.Cards.Card;
import com.example._6quiprendfinalfx.model.Cards.CardSet;
import com.example._6quiprendfinalfx.model.Cards.CardStack;
import com.example._6quiprendfinalfx.model.Player;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.*;

import static com.example._6quiprendfinalfx.model.Cards.Cards.cards;
import static com.example._6quiprendfinalfx.model.Cards.Cards.distributeRandomCards;

public class GameController implements Initializable {
    // Cards Player 1
    @FXML
    private ImageView cardP1_0;
    @FXML
    private ImageView cardP1_1;
    @FXML
    private ImageView cardP1_2;
    @FXML
    private ImageView cardP1_3;
    @FXML
    private ImageView cardP1_4;
    @FXML
    private ImageView cardP1_5;
    @FXML
    private ImageView cardP1_6;
    @FXML
    private ImageView cardP1_7;
    @FXML
    private ImageView cardP1_8;
    @FXML
    private ImageView cardP1_9;

    // Cards Player 2
    @FXML
    private ImageView cardP2_0;
    @FXML
    private ImageView cardP2_1;
    @FXML
    private ImageView cardP2_2;
    @FXML
    private ImageView cardP2_3;
    @FXML
    private ImageView cardP2_4;
    @FXML
    private ImageView cardP2_5;
    @FXML
    private ImageView cardP2_6;
    @FXML
    private ImageView cardP2_7;
    @FXML
    private ImageView cardP2_8;
    @FXML
    private ImageView cardP2_9;

    // Cards Row 1
    @FXML
    private ImageView cardR1_0;
    @FXML
    private ImageView cardR1_1;
    @FXML
    private ImageView cardR1_2;
    @FXML
    private ImageView cardR1_3;
    @FXML
    private ImageView cardR1_4;
    @FXML
    private ImageView cardR1_5;

    // Cards Row 2
    @FXML
    private ImageView cardR2_0;
    @FXML
    private ImageView cardR2_1;
    @FXML
    private ImageView cardR2_2;
    @FXML
    private ImageView cardR2_3;
    @FXML
    private ImageView cardR2_4;
    @FXML
    private ImageView cardR2_5;

    // Cards Row 3
    @FXML
    private ImageView cardR3_0;
    @FXML
    private ImageView cardR3_1;
    @FXML
    private ImageView cardR3_2;
    @FXML
    private ImageView cardR3_3;
    @FXML
    private ImageView cardR3_4;
    @FXML
    private ImageView cardR3_5;

    // Cards Row 4
    @FXML
    private ImageView cardR4_0;
    @FXML
    private ImageView cardR4_1;
    @FXML
    private ImageView cardR4_2;
    @FXML
    private ImageView cardR4_3;
    @FXML
    private ImageView cardR4_4;
    @FXML
    private ImageView cardR4_5;

    public boolean isFinished;
    private List<Player> players;
    private List<Card> allCards;
    private List<CardStack> CardRows;
    private List<CardStackView> CardRowsView;


    public GameController() {
        this.isFinished = false;
        this.players = new ArrayList<>();
        this.allCards = new ArrayList<>(cards);
        this.CardRows = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            this.CardRows.add(new CardStack(allCards.remove(rand.nextInt(allCards.size()))));
        }
        this.CardRowsView = new ArrayList<>();
    }

    @Override
    public void initialize (URL location, ResourceBundle resources){
        start();
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    }
    public void start() {
        addPlayer(new Player("Joueur",false ));
        addPlayer(new Player("IA",true ));
// --------------------- Players cards distribution --------------------------------
        // Player 1 (you)
        players.get(0).addCardImageView(cardP1_0);
        players.get(0).addCardImageView(cardP1_1);
        players.get(0).addCardImageView(cardP1_2);
        players.get(0).addCardImageView(cardP1_3);
        players.get(0).addCardImageView(cardP1_4);
        players.get(0).addCardImageView(cardP1_5);
        players.get(0).addCardImageView(cardP1_6);
        players.get(0).addCardImageView(cardP1_7);
        players.get(0).addCardImageView(cardP1_8);
        players.get(0).addCardImageView(cardP1_9);
        // Player 2 (IA)
        players.get(1).addCardImageView(cardP2_0);
        players.get(1).addCardImageView(cardP2_1);
        players.get(1).addCardImageView(cardP2_2);
        players.get(1).addCardImageView(cardP2_3);
        players.get(1).addCardImageView(cardP2_4);
        players.get(1).addCardImageView(cardP2_5);
        players.get(1).addCardImageView(cardP2_6);
        players.get(1).addCardImageView(cardP2_7);
        players.get(1).addCardImageView(cardP2_8);
        players.get(1).addCardImageView(cardP2_9);
// --------------------- Rows cards distribution --------------------------------
        CardStackView cardStackView1 = new CardStackView();
        CardStackView cardStackView2 = new CardStackView();
        CardStackView cardStackView3 = new CardStackView();
        CardStackView cardStackView4 = new CardStackView();

        cardStackView1.add(cardR1_0);
        cardStackView1.add(cardR1_1);
        cardStackView1.add(cardR1_2);
        cardStackView1.add(cardR1_3);
        cardStackView1.add(cardR1_4);
        cardStackView1.add(cardR1_5);

        cardStackView2.add(cardR2_0);
        cardStackView2.add(cardR2_1);
        cardStackView2.add(cardR2_2);
        cardStackView2.add(cardR2_3);
        cardStackView2.add(cardR2_4);
        cardStackView2.add(cardR2_5);

        cardStackView3.add(cardR3_0);
        cardStackView3.add(cardR3_1);
        cardStackView3.add(cardR3_2);
        cardStackView3.add(cardR3_3);
        cardStackView3.add(cardR3_4);
        cardStackView3.add(cardR3_5);

        cardStackView4.add(cardR4_0);
        cardStackView4.add(cardR4_1);
        cardStackView4.add(cardR4_2);
        cardStackView4.add(cardR4_3);
        cardStackView4.add(cardR4_4);
        cardStackView4.add(cardR4_5);

        CardRowsView.add(cardStackView1);
        CardRowsView.add(cardStackView2);
        CardRowsView.add(cardStackView3);
        CardRowsView.add(cardStackView4);

        List<CardSet> cardSets = distributeRandomCards(2, new Random(), allCards);
        for (Player player : players) { // Ajoute les cartes aux mains des joueurs et met les images à jour
            int i=0;
            for (Card card : cardSets.remove(0).getCards().stream().toList()) { // Parcour (via stream) le cardset sans la carte(0) et le transforme en liste
                player.addCardToHand(card);
                System.out.println(player.getHandImages());
                player.getHandImages().get(i).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(getCardImagePath(card)))));
                i++;
            }
        }
        for (int i=0; i<4;i++) {
            System.out.println(CardRows.get(i).getCards());
            Card CardInitialisation = CardRows.get(i).getCards().get(0);
            CardRowsView.get(i).updateImageByIndex(0,getCardImagePath(CardInitialisation));
        }
    }
    private String getCardImagePath(Card card){
        return "/com/example/_6quiprendfinalfx/cards/" + card.getValue() + ".png";
    }
}
