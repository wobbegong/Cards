package com.crd.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Controls the cards for a game
 */
public class Deck {

	private ArrayList<Card> cards = null;
	private Iterator<Card> iterator = null;

	public Deck() {
		// Initialize the Card list
		cards = new ArrayList<Card>();
		for (CardSuit suit: CardSuit.values()) {
			for (CardFace face: CardFace.values()) {
				cards.add(new Card(suit, face));
			}
		}
	}

	/**
	 * Shuffle the deck
	 */
	public void shuffle() {
		this.iterator = null;
		Collections.shuffle(cards);
		this.iterator = cards.iterator();
	}

	/**
	 * Returns the next card or null if EOD
	 * @return
	 */
	public Card getNextCard() {
		if (iterator.hasNext()) {
			return iterator.next();
		}
		return null;
	}

	/**
	 * Returns true until EOD is reached
	 * @return
	 */
	public boolean moreCards() {
		return iterator.hasNext();
	}

}
