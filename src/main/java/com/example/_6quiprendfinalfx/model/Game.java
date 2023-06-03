package com.example._6quiprendfinalfx.model;
import com.example._6quiprendfinalfx.model.Cards.Card;
import com.example._6quiprendfinalfx.model.Cards.CardSet;
import com.example._6quiprendfinalfx.model.Cards.CardStack;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

import static com.example._6quiprendfinalfx.model.Cards.Cards.cards;
import static com.example._6quiprendfinalfx.model.Cards.Cards.distributeRandomCards;

@Getter
@Setter
@ToString
public class Game {
    public boolean isFinished;
    private List<Player> players;
    private List<Card> allCards;
    private List<CardStack> tableRows;
    private CardStack selectedRow;
    private List<Card> cardsToPlay;
    private Map<Player, Card> playerToCardPlayed;
    private Player currentPlayer;
    private int currentPlayerIndex;

    public Game() {
        this.isFinished = false;
        this.players = new ArrayList<>();
        this.allCards = new ArrayList<>(cards);
        this.cardsToPlay = new ArrayList<>();
        this.tableRows = new ArrayList<>();
        this.playerToCardPlayed = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            this.tableRows.add(new CardStack(allCards.remove(rand.nextInt(allCards.size()))));
        }
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    }
    public void start(int nbPlayers, int nbCards) {
        Random random = new Random();
        addPlayer(new Player("Joueur ",false));
        addPlayer(new Player("IA ",true));

        List<CardSet> cardSets = distributeRandomCards(nbPlayers, new Random(), allCards, nbCards);
        for (Player player : players) {
            for (Card card : cardSets.remove(0).getCards().stream().toList()) {
                player.addCardToHand(card);
            }
        }
        for (CardStack cardStack : tableRows) {
            System.out.println(cardStack.getCards());
        }
        currentPlayerIndex = 0;
        currentPlayer = players.get(currentPlayerIndex);
    }
}
