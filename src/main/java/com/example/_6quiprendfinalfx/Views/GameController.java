package com.example._6quiprendfinalfx.Views;

import com.example._6quiprendfinalfx.Views.CardsView.CardRowView;
import com.example._6quiprendfinalfx.model.Cards.Card;
import com.example._6quiprendfinalfx.model.Cards.Hand;
import com.example._6quiprendfinalfx.model.Cards.Rows;
import com.example._6quiprendfinalfx.model.Player;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.*;

import static com.example._6quiprendfinalfx.model.Cards.Deck.cards;
import static com.example._6quiprendfinalfx.model.Cards.Deck.distributeRandomCards;

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
    private List<Rows> CardRows;
    private List<CardRowView> CardRowsView;


    public GameController() {
        this.isFinished = false;
        this.players = new ArrayList<>();
        this.allCards = new ArrayList<>(cards);
        this.CardRows = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            this.CardRows.add(new Rows(allCards.remove(rand.nextInt(allCards.size()))));
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
        CardRowView cardRowView1 = new CardRowView();
        CardRowView cardRowView2 = new CardRowView();
        CardRowView cardRowView3 = new CardRowView();
        CardRowView cardRowView4 = new CardRowView();

        cardRowView1.add(cardR1_0);
        cardRowView1.add(cardR1_1);
        cardRowView1.add(cardR1_2);
        cardRowView1.add(cardR1_3);
        cardRowView1.add(cardR1_4);
        //cardRowView1.add(cardR1_5);

        cardRowView2.add(cardR2_0);
        cardRowView2.add(cardR2_1);
        cardRowView2.add(cardR2_2);
        cardRowView2.add(cardR2_3);
        cardRowView2.add(cardR2_4);
        //cardRowView2.add(cardR2_5);

        cardRowView3.add(cardR3_0);
        cardRowView3.add(cardR3_1);
        cardRowView3.add(cardR3_2);
        cardRowView3.add(cardR3_3);
        cardRowView3.add(cardR3_4);
        //cardRowView3.add(cardR3_5);

        cardRowView4.add(cardR4_0);
        cardRowView4.add(cardR4_1);
        cardRowView4.add(cardR4_2);
        cardRowView4.add(cardR4_3);
        cardRowView4.add(cardR4_4);
        //cardRowView4.add(cardR4_5);

        CardRowsView.add(cardRowView1);
        CardRowsView.add(cardRowView2);
        CardRowsView.add(cardRowView3);
        CardRowsView.add(cardRowView4);

        List<Hand> hands = distributeRandomCards(2, new Random(), allCards);
        for (Player player : players) { // Ajoute les cartes aux mains des joueurs et met les images à jour
            int i=0;
            for (Card card : hands.remove(0).getCards().stream().toList()) { // Parcour (via stream) le cardset sans la carte(0) et le transforme en liste
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
