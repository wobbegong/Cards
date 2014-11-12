package com.crd.cards;

/**
 * A card in a deck
 */
public class Card implements Comparable<Card> {

	private CardSuit suit;
	private CardFace face;

	public Card(CardSuit suit, CardFace face) {
		this.suit = suit;
		this.face = face;
	}

	/**
	 * Get the face
	 */
	public CardFace getFace() {
		return face;
	}

	/**
	 * Get the suit
	 */
	public CardSuit getSuit() {
		return suit;
	}

	/*
	 * compare a card against another for sorting.
	 */
	public int compareTo(Card otherCard) {
		int suitDiff = this.suit.compareTo(otherCard.suit);
		if (suitDiff == 0) {
			return this.face.compareTo(otherCard.face); 
		}
		else {
			return suitDiff;
		}
	}


	public String toString()
	{
		return (suit.name() + "--" + face.name());

	}

}
