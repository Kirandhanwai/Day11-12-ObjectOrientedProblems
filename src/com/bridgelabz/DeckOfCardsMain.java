package com.bridgelabz;

public class DeckOfCardsMain {
	public static void main(String[] args) {
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.alignCards();
		String[] deck = deckOfCards.suffleCards();
		deckOfCards.displayCards(deck);

	}

}
