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
        addPlayers();
        dealCards();
        UserInterface.displayAllPlayersCards(players);
        startGame();
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
        {
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
    }

    private void playGame() {
        Queue<Player> queuedPlayers = new LinkedList<>(players);
        while (!queuedPlayers.isEmpty()) {
            var player = queuedPlayers.poll();
            UserInterface.displayAllPlayersCards(players);

            System.out.println();
            System.out.print("Card or No Card ? (y/n)");
            String response = input.nextLine()
                                   .strip()
                                   .toLowerCase();

            if (response.equalsIgnoreCase("Y"))
            {     // get card from player

                Card card = deck.takeCard();

                player.dealTo(card);

                if (player.getMatchCount() <= 0) {
                    // add player back to the queue
                    queuedPlayers.offer(player);
                }
            }
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






