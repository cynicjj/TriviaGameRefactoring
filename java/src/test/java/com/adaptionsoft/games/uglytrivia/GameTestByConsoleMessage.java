package com.adaptionsoft.games.uglytrivia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTestByConsoleMessage {

	private TestableGame game;
	private RandomGameResult randomGameResult;

	@BeforeEach
	private void createLogAsList() {
		game = new TestableGame();
		randomGameResult = new RandomGameResult();
	}

	@Test
	void printResultLog() {
		for (String logLine : game.log) {
			System.out.println(logLine);
		}
	}

	@Test
	void testRandomGame01() {
		addPlayers(randomGameResult.getPlayers01());

		rollAndAnswer(randomGameResult.getRolls01(), randomGameResult.getAnswerCheck01());

		assertTrue(randomGameResult.getLog01().containsAll(game.log));
	}

	private void rollAndAnswer(int[] rolls, boolean[] answerCheck) {
		for (int i = 0; i < rolls.length; i++) {
			game.roll(rolls[i]);
			if (answerCheck[i])
				game.wasCorrectlyAnswered();
			else
				game.wrongAnswer();
		}
	}

	private void addPlayers(List<String> players) {
		for (String name : players) {
			game.add(name);
		}
	}

//	@Test
	void testRandomGame02() {
		addPlayers(randomGameResult.getPlayers02());

		rollAndAnswer(randomGameResult.getRolls02(), randomGameResult.getAnswerCheck02());

		assertTrue(randomGameResult.getLog02().containsAll(game.log));
	}

	@Test
	void testRandomGame03() {
		addPlayers(randomGameResult.getPlayers03());

		rollAndAnswer(randomGameResult.getRolls03(), randomGameResult.getAnswerCheck03());

		assertTrue(randomGameResult.getLog03().containsAll(game.log));
	}

	class TestableGame extends Game {

		List<String> log = new ArrayList<String>();

		@Override
		protected void println(Object message) {
			log.add(message.toString());
		}
	}
}
