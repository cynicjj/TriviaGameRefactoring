package com.adaptionsoft.games.uglytrivia;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class GameTestByConsoleMessage {

	@Test
	void 플레이어_Chet_추가() {
		TestableGame game = new TestableGame();
		game.add("Chet");

		List<String> result = game.lastMessages;

		List<String> expected = Arrays.asList("Chet was added", "They are player number 1");
		assertIterableEquals(result, expected);
	}

	class TestableGame extends Game {

		List<String> lastMessages = new ArrayList<String>();

		@Override
		protected void println(Object message) {
			lastMessages.add(message.toString());
		}
	}
}
