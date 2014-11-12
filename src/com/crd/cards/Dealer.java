package com.crd.cards;
/**
 * Responsible for the Deck
 */
public class Dealer {
	private Deck deck = null;

	public Dealer() {
		deck = new Deck();
	}

	/**
	 * Shuffles the deck
	 */
	public void shuffle() {
		deck.shuffle();
	}

	/**
	 * Deals the entire deck of cards
	 * @param players - an array of type Player
	 */
	public void deal(Player[] players) {
		while(deck.moreCards()) {
			for (int x = 0; x < players.length; x++) {
				if (deck.moreCards()) {
					players[x].addPlayerCard(deck.getNextCard());
				}
			}
		}
	}
}
