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
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.*;

import static com.example._6quiprendfinalfx.model.Cards.Cards.cards;
import static com.example._6quiprendfinalfx.model.Cards.Cards.distributeRandomCards;

public class GameController implements Initializable {
    @FXML
    private AnchorPane mainPane;
    @FXML
    private ImageView card_0_1_0;
    @FXML
    private ImageView card_0_1_1;
    @FXML
    private ImageView card_0_1_2;
    @FXML
    private ImageView card_0_1_3;
    @FXML
    private ImageView card_0_1_4;
    @FXML
    private ImageView card_0_1_5;
    @FXML
    private ImageView card_0_2_0;
    @FXML
    private ImageView card_0_2_1;
    @FXML
    private ImageView card_0_2_2;
    @FXML
    private ImageView card_0_2_3;
    @FXML
    private ImageView card_0_2_4;
    @FXML
    private ImageView card_0_2_5;
    @FXML
    private ImageView card_0_3_0;
    @FXML
    private ImageView card_0_3_1;
    @FXML
    private ImageView card_0_3_2;
    @FXML
    private ImageView card_0_3_3;
    @FXML
    private ImageView card_0_3_4;
    @FXML
    private ImageView card_0_3_5;
    @FXML
    private ImageView card_0_4_0;
    @FXML
    private ImageView card_0_4_1;
    @FXML
    private ImageView card_0_4_2;
    @FXML
    private ImageView card_0_4_3;
    @FXML
    private ImageView card_0_4_4;
    @FXML
    private ImageView card_0_4_5;
    @FXML
    private ImageView card_1_0_0;
    @FXML
    private ImageView card_1_0_1;
    @FXML
    private ImageView card_1_0_2;
    @FXML
    private ImageView card_1_0_3;
    @FXML
    private ImageView card_1_0_4;
    @FXML
    private ImageView card_1_0_5;
    @FXML
    private ImageView card_1_0_6;
    @FXML
    private ImageView card_1_0_7;
    @FXML
    private ImageView card_1_0_8;
    @FXML
    private ImageView card_1_0_9;
    @FXML
    private ImageView card_2_0_0;
    @FXML
    private ImageView card_2_0_1;
    @FXML
    private ImageView card_2_0_2;
    @FXML
    private ImageView card_2_0_3;
    @FXML
    private ImageView card_2_0_4;
    @FXML
    private ImageView card_2_0_5;
    @FXML
    private ImageView card_2_0_6;
    @FXML
    private ImageView card_2_0_7;
    @FXML
    private ImageView card_2_0_8;
    @FXML
    private ImageView card_2_0_9;

    public boolean isFinished;
    private List<Player> players;
    private List<Card> allCards;
    private List<CardStack> tableRows;
    private List<CardStackView> cardStackViews;


    public GameController() {
        this.isFinished = false;
        this.players = new ArrayList<>();
        this.allCards = new ArrayList<>(cards);
        this.tableRows = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            this.tableRows.add(new CardStack(allCards.remove(rand.nextInt(allCards.size()))));
        }
        this.cardStackViews = new ArrayList<>();
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
        players.get(0).addCardImageView(card_1_0_0);
        players.get(0).addCardImageView(card_1_0_1);
        players.get(0).addCardImageView(card_1_0_2);
        players.get(0).addCardImageView(card_1_0_3);
        players.get(0).addCardImageView(card_1_0_4);
        players.get(0).addCardImageView(card_1_0_5);
        players.get(0).addCardImageView(card_1_0_6);
        players.get(0).addCardImageView(card_1_0_7);
        players.get(0).addCardImageView(card_1_0_8);
        players.get(0).addCardImageView(card_1_0_9);

        players.get(1).addCardImageView(card_2_0_0);
        players.get(1).addCardImageView(card_2_0_1);
        players.get(1).addCardImageView(card_2_0_2);
        players.get(1).addCardImageView(card_2_0_3);
        players.get(1).addCardImageView(card_2_0_4);
        players.get(1).addCardImageView(card_2_0_5);
        players.get(1).addCardImageView(card_2_0_6);
        players.get(1).addCardImageView(card_2_0_7);
        players.get(1).addCardImageView(card_2_0_8);
        players.get(1).addCardImageView(card_2_0_9);
// --------------------- Rows cards distribution --------------------------------
        CardStackView cardStackView1 = new CardStackView();
        CardStackView cardStackView2 = new CardStackView();
        CardStackView cardStackView3 = new CardStackView();
        CardStackView cardStackView4 = new CardStackView();

        cardStackView1.add(card_0_1_0);
        cardStackView1.add(card_0_1_1);
        cardStackView1.add(card_0_1_2);
        cardStackView1.add(card_0_1_3);
        cardStackView1.add(card_0_1_4);

        cardStackView2.add(card_0_2_0);
        cardStackView2.add(card_0_2_1);
        cardStackView2.add(card_0_2_2);
        cardStackView2.add(card_0_2_3);
        cardStackView2.add(card_0_2_4);

        cardStackView3.add(card_0_3_0);
        cardStackView3.add(card_0_3_1);
        cardStackView3.add(card_0_3_2);
        cardStackView3.add(card_0_3_3);
        cardStackView3.add(card_0_3_4);

        cardStackView4.add(card_0_4_0);
        cardStackView4.add(card_0_4_1);
        cardStackView4.add(card_0_4_2);
        cardStackView4.add(card_0_4_3);
        cardStackView4.add(card_0_4_4);

        cardStackViews.add(cardStackView1);
        cardStackViews.add(cardStackView2);
        cardStackViews.add(cardStackView3);
        cardStackViews.add(cardStackView4);

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
            System.out.println(tableRows.get(i).getCards());
            Card CardInitialisation = tableRows.get(i).getCards().get(0);
            cardStackViews.get(i).updateImageByIndex(0,getCardImagePath(CardInitialisation));
        }
    }
    private String getCardImagePath(Card card){
        return "/com/example/_6quiprendfinalfx/cards/" + card.getValue() + ".png";
    }
}
