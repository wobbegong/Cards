package com.crd.cards;
/**
 *  The controlling class in the card game.
 */
public class Table {
	private Dealer dealer = null;
	private Player[] players = null;

	public Table(int numOfPlayers) {
		this.players = new Player[numOfPlayers];
		for (int x = 0; x < players.length; x++) {
			players[x] = new Player("player" + x);
		}
		this.dealer = new Dealer();
	}

	/**
	 * Want to play a game?
	 */
	public void play() {
		// Shuffle the deck
		dealer.shuffle();
		// deal the cards
		dealer.deal(players);
		// players are called
		call();
	}

	/*
	 * All players must show their hand
	 */
	private void call() {
		for (Player player: players) {
			player.call();
		}
	}
}
