package com.example._6quiprendfinalfx.model;
import com.example._6quiprendfinalfx.model.CardSetups.Card;
import com.example._6quiprendfinalfx.model.CardSetups.Hand;
import com.example._6quiprendfinalfx.model.CardSetups.Rows;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

import static com.example._6quiprendfinalfx.model.CardSetups.Deck.cards;
import static com.example._6quiprendfinalfx.model.CardSetups.Deck.distribCards;

@Getter
@Setter
@ToString
public class Game {
    public boolean isFinished;
    private List<Player> players;
    private List<Card> allCards;
    private List<Rows> tableRows;
    private Rows selectedRow;
    private List<Card> cardsToPlay;
    private Map<Player, Card> playerToCardPlayed;
    private Player currentPlayer;
    private int currentIndexPlayer;

    public Game() {
        this.isFinished = false;
        this.players = new ArrayList<>();
        this.allCards = new ArrayList<>(cards);
        this.cardsToPlay = new ArrayList<>();
        this.tableRows = new ArrayList<>();
        this.playerToCardPlayed = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            this.tableRows.add(new Rows(allCards.remove(rand.nextInt(allCards.size()))));
        }
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    } // Début d'ajout de plusieurs joueurs et lancement de la partie
    public void start(int nbPlayers, int nbCards) {
        Random random = new Random();
        addPlayer(new Player("Joueur ",false));
        addPlayer(new Player("IA ",true));

        List<Hand> hands = distribCards(nbPlayers, new Random(), allCards, nbCards);
        for (Player player : players) {
            for (Card card : hands.remove(0).getCards().stream().toList()) {
                player.addCardToHand(card);
            }
        }
        for (Rows rows : tableRows) {
            System.out.println(rows.getCards());
        }
        currentIndexPlayer = 0;
        currentPlayer = players.get(currentIndexPlayer);
    }
}
