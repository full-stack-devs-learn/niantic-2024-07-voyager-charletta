package com.niantic.application;

import com.niantic.models.Card;
import com.niantic.models.Deck;
import com.niantic.models.Player;
import com.niantic.ui.UserInterface;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class CardGameApplication
{   Scanner input = new Scanner(System.in);
    Deck deck = new Deck();
    ArrayList<Player> players = new ArrayList<>();
    Player winner = new Player("win hand");

    public void run() {
        startGame();
        UserInterface.displayAllPlayersCards(players);
        playGame();
        determineWinner();
        //UserInterface.displayWinner(winner);

    }

    private void addPlayers() {
        players.add(new Player("One"));
        players.add(new Player("Two"));
    }

    private void startGame() {
        addPlayers();
        dealCards();
    }

    private void dealCards() {
        deck.shuffle();

            for (int i = 0; i < 5; i++)
                for (Player player : players) {
                    Card card = deck.takeCard();
                    player.dealTo(card);
                }
            {
                for (Player player : players) {

                    player.checkForMatches();
                }
            }

    }

    private void playGame() {
        Queue<Player> queuedPlayers = new LinkedList<>(players);
        while (!queuedPlayers.isEmpty()) {
            var player = queuedPlayers.poll();
            UserInterface.displayAllPlayersCards(players);

            System.out.println();
            System.out.print("what card do you want ?");
            String response = input.nextLine()
                                   .strip()
                                   .toLowerCase();

            // look in the other players hand for that card
            // if player2 has that card, remove them from player2's hand
                // and add them to player1's hand
            // else say go fish - and player 1 takes a card from the deck

            if (response.equalsIgnoreCase("Y"))
            {     // get card from player

                Card card = deck.takeCard();

                player.dealTo(card);

                if (player.getMatchCount() <= 0) {
                    // add player back to the queue
                    queuedPlayers.offer(player);
                }
            }

            players.forEach( p -> {
                if(p.getHand().getCardCount() == 0)
                {
                    return; // to get out of the loop
                }
            });
        }
    }
        private void determineWinner()
        {
            for (Player player: players)
            {
                int points = player.getMatchCount();
                if(points > winner.getMatchCount() && points <= 12 )
                {
                    winner = player;
                }
            }
        }
    }






