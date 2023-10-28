package com.adaptionsoft.games.uglytrivia;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

class GameTestByConsoleMessage {

	static String[] expectedLog = { "Chet was added", "They are player number 1", "Pat was added", "They are player number 2", "Sue was added", "They are player number 3", "Chet is the current player", "They have rolled a 4", "Chet's new location is 4", "The category is Pop", "Pop Question 0", "Answer was corrent!!!!", "Chet now has 1 Gold Coins.", "Pat is the current player", "They have rolled a 1", "Pat's new location is 1", "The category is Science", "Science Question 0", "Answer was corrent!!!!", "Pat now has 1 Gold Coins.", "Sue is the current player", "They have rolled a 5", "Sue's new location is 5", "The category is Science", "Science Question 1", "Answer was corrent!!!!", "Sue now has 1 Gold Coins.", "Chet is the current player", "They have rolled a 2", "Chet's new location is 6", "The category is Sports", "Sports Question 0", "Answer was corrent!!!!", "Chet now has 2 Gold Coins.", "Pat is the current player", "They have rolled a 3", "Pat's new location is 4", "The category is Pop", "Pop Question 1", "Answer was corrent!!!!", "Pat now has 2 Gold Coins.", "Sue is the current player", "They have rolled a 1", "Sue's new location is 6", "The category is Sports", "Sports Question 1", "Answer was corrent!!!!", "Sue now has 2 Gold Coins.", "Chet is the current player", "They have rolled a 1", "Chet's new location is 7", "The category is Rock", "Rock Question 0", "Answer was corrent!!!!", "Chet now has 3 Gold Coins.", "Pat is the current player", "They have rolled a 5", "Pat's new location is 9", "The category is Science", "Science Question 2", "Answer was corrent!!!!", "Pat now has 3 Gold Coins.", "Sue is the current player", "They have rolled a 5", "Sue's new location is 11", "The category is Rock", "Rock Question 1", "Answer was corrent!!!!", "Sue now has 3 Gold Coins.", "Chet is the current player", "They have rolled a 3", "Chet's new location is 10", "The category is Sports", "Sports Question 2", "Answer was corrent!!!!", "Chet now has 4 Gold Coins.", "Pat is the current player", "They have rolled a 2", "Pat's new location is 11", "The category is Rock", "Rock Question 2", "Question was incorrectly answered", "Pat was sent to the penalty box", "Sue is the current player", "They have rolled a 1", "Sue's new location is 0", "The category is Pop", "Pop Question 2", "Answer was corrent!!!!", "Sue now has 4 Gold Coins.", "Chet is the current player", "They have rolled a 2", "Chet's new location is 0", "The category is Pop", "Pop Question 3", "Answer was corrent!!!!", "Chet now has 5 Gold Coins.", "Pat is the current player", "They have rolled a 2", "Pat is not getting out of the penalty box", "Sue is the current player", "They have rolled a 1", "Sue's new location is 1", "The category is Science", "Science Question 3", "Question was incorrectly answered", "Sue was sent to the penalty box", "Chet is the current player", "They have rolled a 4", "Chet's new location is 4", "The category is Pop", "Pop Question 4", "Answer was corrent!!!!", "Chet now has 6 Gold Coins."
	};

	private int expectedLogIndex = 0;

//	@Test
	void checkExpectedLog() {
		for (String logLine : expectedLog) {
			System.out.println(logLine);
		}
	}

	@Test
	void 플레이어_Chet_추가() {
		TestableGame game = new TestableGame();
		game.add("Chet");

		List<String> expected = getPartialLog(2);

		assertIterableEquals(game.log, expected);
	}

	private List<String> getPartialLog(int count) {
		List<String> partialLog = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			partialLog.add(expectedLog[i]);
			System.out.println(expectedLog[i]);
		}
		return partialLog;
	}

	@Test
	void 플레이어_모두_추가() {
		TestableGame game = new TestableGame();

		addAllPlayers(game);

		List<String> expected = getPartialLog(6);

		assertIterableEquals(game.log, expected);
	}

	@Test
	void 모든_게임_진행() {
		TestableGame game = new TestableGame();

		proceedAll(game);

		List<String> expected = getPartialLog(expectedLogIndex);

		assertIterableEquals(game.log, expected);
		assertTrue(game.didPlayerWin());
	}

	private void proceedAll(TestableGame game) {
		addAllPlayers(game);

		rollAndCorrect(game, new int[] { 4, 1, 5, 2, 3, 1, 1, 5, 5, 3 });
		rollAndWrong(game, new int[] { 2 });
		rollAndCorrect(game, new int[] { 1, 2 });
		rollAndEscapePenaltyBox(game, new int[] { 2 });
		rollAndWrong(game, new int[] { 1 });
		rollAndCorrect(game, new int[] { 4 });
	}

	private void rollAndEscapePenaltyBox(TestableGame game, int[] rolls) {
		for (int currentRoll : rolls) {
			game.inPenaltyBox[game.currentPlayer] = true;
			game.roll(currentRoll);
			game.wasCorrectlyAnswered();
		}
	}

	private void rollAndCorrect(TestableGame game, int[] rolls) {
		for (int currentRoll : rolls) {
			game.roll(currentRoll);
			game.wasCorrectlyAnswered();
		}
	}

	private void rollAndWrong(TestableGame game, int[] rolls) {
		for (int currentRoll : rolls) {
			game.roll(currentRoll);
			game.wrongAnswer();
		}
	}

	private void addAllPlayers(TestableGame game) {
		game.add("Chet");
		game.add("Pat");
		game.add("Sue");
	}

	class TestableGame extends Game {

		List<String> log = new ArrayList<String>();

		@Override
		protected void println(Object message) {
			log.add(message.toString());
		}

		@Override
		public boolean add(String playerName) {
			expectedLogIndex = expectedLogIndex + 2;
			return super.add(playerName);
		}

		@Override
		public void roll(int roll) {
			super.roll(roll);
			expectedLogIndex = expectedLogIndex + 5;
		}

		@Override
		public boolean wasCorrectlyAnswered() {
			boolean isInPenaltyBox = super.inPenaltyBox[super.currentPlayer];
			if (isInPenaltyBox) {
				expectedLogIndex = expectedLogIndex - 2;
			} else {
				expectedLogIndex = expectedLogIndex + 2;
			}
			return super.wasCorrectlyAnswered();
		}

		@Override
		public boolean wrongAnswer() {
			expectedLogIndex = expectedLogIndex + 2;
			return super.wrongAnswer();
		}
	}
}
