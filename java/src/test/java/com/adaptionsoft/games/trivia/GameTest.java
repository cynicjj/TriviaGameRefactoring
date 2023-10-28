package com.adaptionsoft.games.trivia;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	private Game game;

	@BeforeEach
	void init() {
		game = new Game();
	}

	@Test
	void testHowManyPalyers() {
		assertThat(game.howManyPlayers()).isZero();

		game.add("p1");
		assertThat(game.howManyPlayers()).isEqualTo(1);

		addPlayers(3);
		assertThat(game.howManyPlayers()).isEqualTo(4);
	}

	private void addPlayers(int count) {
		for (int i = 0; i < count; i++) {
			game.add("player" + i);
		}
	}
	
	@Test
	void testIsPlayable() {
		assertThat(game.isPlayable()).isFalse();
		
		game.add("p1");
		assertThat(game.isPlayable()).isFalse();

		game.add("p1");
		assertThat(game.isPlayable()).isTrue();
	}
}
