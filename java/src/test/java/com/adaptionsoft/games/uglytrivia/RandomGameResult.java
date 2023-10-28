package com.adaptionsoft.games.uglytrivia;

import java.util.Arrays;
import java.util.List;

public class RandomGameResult {

	private final boolean t = true;
	private final boolean f = false;

	private final String log01 = """
			Chet was added
			They are player number 1
			Pat was added
			They are player number 2
			Sue was added
			They are player number 3
			Chet is the current player
			They have rolled a 1
			Chet's new location is 1
			The category is Science
			Science Question 0
			Question was incorrectly answered
			Chet was sent to the penalty box
			Pat is the current player
			They have rolled a 3
			Pat's new location is 3
			The category is Rock
			Rock Question 0
			Answer was corrent!!!!
			Pat now has 1 Gold Coins.
			Sue is the current player
			They have rolled a 2
			Sue's new location is 2
			The category is Sports
			Sports Question 0
			Answer was corrent!!!!
			Sue now has 1 Gold Coins.
			Chet is the current player
			They have rolled a 2
			Chet is not getting out of the penalty box
			Pat is the current player
			They have rolled a 5
			Pat's new location is 8
			The category is Pop
			Pop Question 0
			Answer was corrent!!!!
			Pat now has 2 Gold Coins.
			Sue is the current player
			They have rolled a 3
			Sue's new location is 5
			The category is Science
			Science Question 1
			Question was incorrectly answered
			Sue was sent to the penalty box
			Chet is the current player
			They have rolled a 4
			Chet is not getting out of the penalty box
			Pat is the current player
			They have rolled a 1
			Pat's new location is 9
			The category is Science
			Science Question 2
			Answer was corrent!!!!
			Pat now has 3 Gold Coins.
			Sue is the current player
			They have rolled a 5
			Sue is getting out of the penalty box
			Sue's new location is 10
			The category is Sports
			Sports Question 1
			Answer was correct!!!!
			Sue now has 2 Gold Coins.
			Chet is the current player
			They have rolled a 3
			Chet is getting out of the penalty box
			Chet's new location is 4
			The category is Pop
			Pop Question 1
			Answer was correct!!!!
			Chet now has 1 Gold Coins.
			Pat is the current player
			They have rolled a 2
			Pat's new location is 11
			The category is Rock
			Rock Question 1
			Answer was corrent!!!!
			Pat now has 4 Gold Coins.
			Sue is the current player
			They have rolled a 3
			Sue is getting out of the penalty box
			Sue's new location is 1
			The category is Science
			Science Question 3
			Answer was correct!!!!
			Sue now has 3 Gold Coins.
			Chet is the current player
			They have rolled a 1
			Chet is getting out of the penalty box
			Chet's new location is 5
			The category is Science
			Science Question 4
			Answer was correct!!!!
			Chet now has 2 Gold Coins.
			Pat is the current player
			They have rolled a 1
			Pat's new location is 0
			The category is Pop
			Pop Question 2
			Answer was corrent!!!!
			Pat now has 5 Gold Coins.
			Sue is the current player
			They have rolled a 4
			Sue is not getting out of the penalty box
			Chet is the current player
			They have rolled a 1
			Chet is getting out of the penalty box
			Chet's new location is 6
			The category is Sports
			Sports Question 2
			Question was incorrectly answered
			Chet was sent to the penalty box
			Pat is the current player
			They have rolled a 3
			Pat's new location is 3
			The category is Rock
			Rock Question 2
			Answer was corrent!!!!
			Pat now has 6 Gold Coins.
			""";

	public List<String> getLog01() {
		return Arrays.asList(log01.split("\n"));
	}

	public List<String> getPlayers01() {
		return Arrays.asList("Chet", "Pat", "Sue");
	}

	public int[] getRolls01() {
		return new int[] { 1, 3, 2, 2, 5, 3, 4, 1, 5, 3, 2, 3, 1, 1, 4, 1, 3 };
	}

	public boolean[] getAnswerCheck01() {
		return new boolean[] { f, t, t, t, t, t, t, t, t, t, t, f, t, t, t, f, t };
	}

	private final String log02 = """
			Chet was added
			They are player number 1
			Pat was added
			They are player number 2
			Sue was added
			They are player number 3
			Chet is the current player
			They have rolled a 3
			Chet's new location is 3
			The category is Rock
			Rock Question 0
			Answer was corrent!!!!
			Chet now has 1 Gold Coins.
			Pat is the current player
			They have rolled a 4
			Pat's new location is 4
			The category is Pop
			Pop Question 0
			Answer was corrent!!!!
			Pat now has 1 Gold Coins.
			Sue is the current player
			They have rolled a 3
			Sue's new location is 3
			The category is Rock
			Rock Question 1
			Answer was corrent!!!!
			Sue now has 1 Gold Coins.
			Chet is the current player
			They have rolled a 1
			Chet's new location is 4
			The category is Pop
			Pop Question 1
			Answer was corrent!!!!
			Chet now has 2 Gold Coins.
			Pat is the current player
			They have rolled a 4
			Pat's new location is 8
			The category is Pop
			Pop Question 2
			Answer was corrent!!!!
			Pat now has 2 Gold Coins.
			Sue is the current player
			They have rolled a 1
			Sue's new location is 4
			The category is Pop
			Pop Question 3
			Answer was corrent!!!!
			Sue now has 2 Gold Coins.
			Chet is the current player
			They have rolled a 5
			Chet's new location is 9
			The category is Science
			Science Question 0
			Answer was corrent!!!!
			Chet now has 3 Gold Coins.
			Pat is the current player
			They have rolled a 1
			Pat's new location is 9
			The category is Science
			Science Question 1
			Answer was corrent!!!!
			Pat now has 3 Gold Coins.
			Sue is the current player
			They have rolled a 5
			Sue's new location is 9
			The category is Science
			Science Question 2
			Answer was corrent!!!!
			Sue now has 3 Gold Coins.
			Chet is the current player
			They have rolled a 3
			Chet's new location is 0
			The category is Pop
			Pop Question 4
			Answer was corrent!!!!
			Chet now has 4 Gold Coins.
			Pat is the current player
			They have rolled a 1
			Pat's new location is 10
			The category is Sports
			Sports Question 0
			Answer was corrent!!!!
			Pat now has 4 Gold Coins.
			Sue is the current player
			They have rolled a 1
			Sue's new location is 10
			The category is Sports
			Sports Question 1
			Answer was corrent!!!!
			Sue now has 4 Gold Coins.
			Chet is the current player
			They have rolled a 3
			Chet's new location is 3
			The category is Rock
			Rock Question 2
			Answer was corrent!!!!
			Chet now has 5 Gold Coins.
			Pat is the current player
			They have rolled a 3
			Pat's new location is 1
			The category is Science
			Science Question 3
			Answer was corrent!!!!
			Pat now has 5 Gold Coins.
			Sue is the current player
			They have rolled a 2
			Sue's new location is 0
			The category is Pop
			Pop Question 5
			Answer was corrent!!!!
			Sue now has 5 Gold Coins.
			Chet is the current player
			They have rolled a 1
			Chet's new location is 4
			The category is Pop
			Pop Question 6
			Answer was corrent!!!!
			Chet now has 6 Gold Coins.
			""";

	public List<String> getLog02() {
		return Arrays.asList(log02.split("\n"));
	}

	public List<String> getPlayers02() {
		return Arrays.asList("Chet", "Pat", "Sue");
	}

	public int[] getRolls02() {
		return new int[] { 3, 4, 3, 1, 4, 1, 5, 1, 5, 3, 1, 1, 3, 3, 2, 1 };
	}

	public boolean[] getAnswerCheck02() {
		return new boolean[] { t, t, t, t, t, t, t, t, t, t, t, t, t, t, t, t };
	}

	private String log03 = """
			Chet was added
			They are player number 1
			Pat was added
			They are player number 2
			Sue was added
			They are player number 3
			Chet is the current player
			They have rolled a 2
			Chet's new location is 2
			The category is Sports
			Sports Question 0
			Answer was corrent!!!!
			Chet now has 1 Gold Coins.
			Pat is the current player
			They have rolled a 1
			Pat's new location is 1
			The category is Science
			Science Question 0
			Answer was corrent!!!!
			Pat now has 1 Gold Coins.
			Sue is the current player
			They have rolled a 4
			Sue's new location is 4
			The category is Pop
			Pop Question 0
			Answer was corrent!!!!
			Sue now has 1 Gold Coins.
			Chet is the current player
			They have rolled a 5
			Chet's new location is 7
			The category is Rock
			Rock Question 0
			Answer was corrent!!!!
			Chet now has 2 Gold Coins.
			Pat is the current player
			They have rolled a 5
			Pat's new location is 6
			The category is Sports
			Sports Question 1
			Answer was corrent!!!!
			Pat now has 2 Gold Coins.
			Sue is the current player
			They have rolled a 4
			Sue's new location is 8
			The category is Pop
			Pop Question 1
			Answer was corrent!!!!
			Sue now has 2 Gold Coins.
			Chet is the current player
			They have rolled a 5
			Chet's new location is 0
			The category is Pop
			Pop Question 2
			Answer was corrent!!!!
			Chet now has 3 Gold Coins.
			Pat is the current player
			They have rolled a 2
			Pat's new location is 8
			The category is Pop
			Pop Question 3
			Answer was corrent!!!!
			Pat now has 3 Gold Coins.
			Sue is the current player
			They have rolled a 3
			Sue's new location is 11
			The category is Rock
			Rock Question 1
			Answer was corrent!!!!
			Sue now has 3 Gold Coins.
			Chet is the current player
			They have rolled a 3
			Chet's new location is 3
			The category is Rock
			Rock Question 2
			Answer was corrent!!!!
			Chet now has 4 Gold Coins.
			Pat is the current player
			They have rolled a 2
			Pat's new location is 10
			The category is Sports
			Sports Question 2
			Answer was corrent!!!!
			Pat now has 4 Gold Coins.
			Sue is the current player
			They have rolled a 2
			Sue's new location is 1
			The category is Science
			Science Question 1
			Answer was corrent!!!!
			Sue now has 4 Gold Coins.
			Chet is the current player
			They have rolled a 1
			Chet's new location is 4
			The category is Pop
			Pop Question 4
			Answer was corrent!!!!
			Chet now has 5 Gold Coins.
			Pat is the current player
			They have rolled a 2
			Pat's new location is 0
			The category is Pop
			Pop Question 5
			Question was incorrectly answered
			Pat was sent to the penalty box
			Sue is the current player
			They have rolled a 2
			Sue's new location is 3
			The category is Rock
			Rock Question 3
			Answer was corrent!!!!
			Sue now has 5 Gold Coins.
			Chet is the current player
			They have rolled a 5
			Chet's new location is 9
			The category is Science
			Science Question 2
			Answer was corrent!!!!
			Chet now has 6 Gold Coins.
			""";

	public List<String> getLog03() {
		return Arrays.asList(log03.split("\n"));
	}

	public List<String> getPlayers03() {
		return Arrays.asList("Chet", "Pat", "Sue");
	}

	public int[] getRolls03() {
		return new int[] 		{ 2, 1, 4, 5, 5, 4, 5, 2, 3, 3, 2, 2, 1, 2, 2, 5 };
	}

	public boolean[] getAnswerCheck03() {
		return new boolean[] 	{ t, t, t, t, t, t, t, t, t, t, t, t, t, f, t, t };
	}

}
