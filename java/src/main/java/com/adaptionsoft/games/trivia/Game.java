package com.adaptionsoft.games.trivia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game {
	List<String> players = new ArrayList<String>();
	int[] places = new int[6];
	int[] purses = new int[6];
	boolean[] inPenaltyBox = new boolean[6];

	LinkedList<String> popQuestions = new LinkedList<String>();
	LinkedList<String> scienceQuestions = new LinkedList<String>();
	LinkedList<String> sportsQuestions = new LinkedList<String>();
	LinkedList<String> rockQuestions = new LinkedList<String>();

	int currentPlayer = 0;
	boolean isGettingOutOfPenaltyBox;

	public Game() {
		for (int i = 0; i < 50; i++) {
			popQuestions.addLast("Pop Question " + i);
			scienceQuestions.addLast(("Science Question " + i));
			sportsQuestions.addLast(("Sports Question " + i));
			rockQuestions.addLast(createRockQuestion(i));
		}
	}

	public String createRockQuestion(int index) {
		return "Rock Question " + index;
	}

	public boolean isPlayable() {
		return (howManyPlayers() >= 2);
	}

	public boolean add(String playerName) {

		players.add(playerName);
		places[howManyPlayers()] = 0;
		purses[howManyPlayers()] = 0;
		inPenaltyBox[howManyPlayers()] = false;

		println(playerName + " was added");
		println("They are player number " + players.size());
		return true;
	}

	public int howManyPlayers() {
		return players.size();
	}

	protected void println(Object message) {
		System.out.println(message.toString());
	}

	public void roll(int roll) {
		println(players.get(currentPlayer) + " is the current player");
		println("They have rolled a " + roll);

		if (inPenaltyBox[currentPlayer]) {
			if (roll % 2 != 0) {
				isGettingOutOfPenaltyBox = true;

				println(players.get(currentPlayer) + " is getting out of the penalty box");
				places[currentPlayer] = places[currentPlayer] + roll;
				if (places[currentPlayer] > 11)
					places[currentPlayer] = places[currentPlayer] - 12;

				println(players.get(currentPlayer) + "'s new location is " + places[currentPlayer]);
				println("The category is " + currentCategory());
				askQuestion();
			} else {
				println(players.get(currentPlayer) + " is not getting out of the penalty box");
				isGettingOutOfPenaltyBox = false;
			}

		} else {

			places[currentPlayer] = places[currentPlayer] + roll;
			if (places[currentPlayer] > 11)
				places[currentPlayer] = places[currentPlayer] - 12;

			println(players.get(currentPlayer) + "'s new location is " + places[currentPlayer]);
			println("The category is " + currentCategory());
			askQuestion();
		}

	}

	private void askQuestion() {
		if (currentCategory() == "Pop")
			println(popQuestions.removeFirst());
		if (currentCategory() == "Science")
			println(scienceQuestions.removeFirst());
		if (currentCategory() == "Sports")
			println(sportsQuestions.removeFirst());
		if (currentCategory() == "Rock")
			println(rockQuestions.removeFirst());
	}

	private String currentCategory() {
		if (places[currentPlayer] == 0)
			return "Pop";
		if (places[currentPlayer] == 4)
			return "Pop";
		if (places[currentPlayer] == 8)
			return "Pop";
		if (places[currentPlayer] == 1)
			return "Science";
		if (places[currentPlayer] == 5)
			return "Science";
		if (places[currentPlayer] == 9)
			return "Science";
		if (places[currentPlayer] == 2)
			return "Sports";
		if (places[currentPlayer] == 6)
			return "Sports";
		if (places[currentPlayer] == 10)
			return "Sports";
		return "Rock";
	}

	public boolean wasCorrectlyAnswered() {
		if (inPenaltyBox[currentPlayer]) {
			if (isGettingOutOfPenaltyBox) {
				println("Answer was correct!!!!");
				purses[currentPlayer]++;
				println(players.get(currentPlayer) + " now has " + purses[currentPlayer] + " Gold Coins.");

				boolean winner = didPlayerWin();
				currentPlayer++;
				if (currentPlayer == players.size())
					currentPlayer = 0;

				return winner;
			} else {
				currentPlayer++;
				if (currentPlayer == players.size())
					currentPlayer = 0;
				return true;
			}

		} else {

			println("Answer was corrent!!!!");
			purses[currentPlayer]++;
			println(players.get(currentPlayer) + " now has " + purses[currentPlayer] + " Gold Coins.");

			boolean winner = didPlayerWin();
			currentPlayer++;
			if (currentPlayer == players.size())
				currentPlayer = 0;

			return winner;
		}
	}

	public boolean wrongAnswer() {
		println("Question was incorrectly answered");
		println(players.get(currentPlayer) + " was sent to the penalty box");
		inPenaltyBox[currentPlayer] = true;

		currentPlayer++;
		if (currentPlayer == players.size())
			currentPlayer = 0;
		return true;
	}

	protected boolean didPlayerWin() {
		return !(purses[currentPlayer] == 6);
	}
}
