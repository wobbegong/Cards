package com.crd.cards;

import java.util.TreeSet;
import java.util.Set;

/**
 * A participant in the game.
 */
public class Player {
	private String playerName;
	// To store list of cards for each player
	private Set<Card> hand = new TreeSet<Card>();

	/**
	 * Constructor
	 */
	public Player(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * Add a card to the players hand
	 * @param card - a Card
	 */
	public void addPlayerCard(Card card) {
		hand.add(card);
	}

	/**
	 *  Loop through and present all cards
	 */
	public void call() {
		System.out.println("Cards for Player:  " + this.playerName);
		for (Card card: hand) {
			System.out.println("\t"+card.toString());
		}
	}

}
