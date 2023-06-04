package com.example._6quiprendfinalfx.model.CardSetups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    public static final int MIN_CARD_VALUE = 1;
    public static final int MAX_CARD_VALUE = 104;
    public static final int DEFAULT_CARDS_COUNT_PER_PLAYER = 10;
    public static final List<Card> cards = createCards();
    private static List<Card> createCards() {
        List<Card> listofcards = new ArrayList<>();
        for (int i = MIN_CARD_VALUE; i <= MAX_CARD_VALUE; i++) {
            listofcards.add(new Card(i, cardPenalty(i)));
        }
        return Collections.unmodifiableList(listofcards);
    }

    public static int cardPenalty(int number) { // A modifier
        if (number == 55) {
            return 7;
        } else if (number % 11 == 0) {
            return 5;
        } else if (number % 10 == 0) {
            return 3;
        } else if (number % 5 == 0) {
            return 2;
        } else {
            return 1;
        }
    }
    public static List<Hand> distributeRandomCards(int nPlayer, Random random, List<Card> cards) {
        return distributeRandomCards(nPlayer, random, cards, DEFAULT_CARDS_COUNT_PER_PLAYER);
    }
    public static List<Hand> distributeRandomCards(int Players, Random rand, List<Card> cards, int CardQuantity) {
        if (Players < 0 || Players > 10) throw new IllegalArgumentException();
        List<Card> remainingCards = new ArrayList<>(cards);
        List<List<Card>> playerCards = new ArrayList<>();

        for (int j = 0; j < Players; j++) { // Ajouter les mains des joueurs
            playerCards.add(new ArrayList<>(CardQuantity));
        }

        for (int i = 0; i < CardQuantity; i++) { // Distribue aléatoirement les cartes aux joueurs
            for (List<Card> playerHand : playerCards) {
                int indexCard = rand.nextInt(remainingCards.size());
                Card card = remainingCards.remove(indexCard);
                playerHand.add(card);
            }
        }
        List<Hand> TotalPlayerHands = new ArrayList<>(Players);
        for (List<Card> playerHand : playerCards) {
            TotalPlayerHands.add(new Hand(playerHand));
        }
        return TotalPlayerHands;
        // TotalPlayerHands = Liste de 2 elements (2 joueurs) qui contient chacun un CardSet (qui est une liste de 10 cartes)
        // Ça permet de renvoyer les mains de chaque joueur pour pouvoir les afficher. Dans l'idée d'implémenter par la suite l'affichage
        // face caché des cartes de l'adversaire.
    }
}
