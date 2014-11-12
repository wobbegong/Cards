package com.crd.cards;

/**
 * Test the card game
 */
public class CardsTest {

	public static void main(String args[])
	{
		// Args 0 should be number of players
		int numPlayers = 0;
		if (args.length == 1) {
			try{
				numPlayers = Integer.parseInt(args[0]);
				// we need at least one player
				if (numPlayers == 0) {
					throw new IllegalArgumentException("You need at least one player to play.");
				}
			}catch(NumberFormatException e){
				throw new IllegalArgumentException("How many players?");
			}
		}else {
			throw new IllegalArgumentException("Usage:  PlayerTest numOfPlayers");
		}

		// Initialize the table
		Table table = new Table(numPlayers);
		// Play one hand
		table.play();

	}
}
