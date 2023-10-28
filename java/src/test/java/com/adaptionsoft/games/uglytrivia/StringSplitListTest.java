package com.adaptionsoft.games.uglytrivia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringSplitListTest {

	// """ 위치에 따라 앞뒤에 공백이 추가 될 수 있다
	private String result = """
			line number 1
			line number 2
			line number 3
							""";
	
	// 닫는 """ 위치는 문자열과 같은 위치에 둬야 공백이 없다
	private static String resultLog = """
			Chet was added
			They are player number 1
			Chet was added
			They are player number 1
			Pat was added
			They are player number 2
			Sue was added
			They are player number 3
			Chet was added
			They are player number 1
			Pat was added
			They are player number 2
			Sue was added
			They are player number 3
			Chet is the current player
			They have rolled a 4
			Chet's new location is 4
			The category is Pop
			Pop Question 0
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
			They have rolled a 5
			Sue's new location is 5
			The category is Science
			Science Question 1
			Answer was corrent!!!!
			Sue now has 1 Gold Coins.
			Chet is the current player
			They have rolled a 2
			Chet's new location is 6
			The category is Sports
			Sports Question 0
			Answer was corrent!!!!
			Chet now has 2 Gold Coins.
			Pat is the current player
			They have rolled a 3
			Pat's new location is 4
			The category is Pop
			Pop Question 1
			Answer was corrent!!!!
			Pat now has 2 Gold Coins.
			Sue is the current player
			They have rolled a 1
			Sue's new location is 6
			The category is Sports
			Sports Question 1
			Answer was corrent!!!!
			Sue now has 2 Gold Coins.
			Chet is the current player
			They have rolled a 1
			Chet's new location is 7
			The category is Rock
			Rock Question 0
			Answer was corrent!!!!
			Chet now has 3 Gold Coins.
			Pat is the current player
			They have rolled a 5
			Pat's new location is 9
			The category is Science
			Science Question 2
			Answer was corrent!!!!
			Pat now has 3 Gold Coins.
			Sue is the current player
			They have rolled a 5
			Sue's new location is 11
			The category is Rock
			Rock Question 1
			Answer was corrent!!!!
			Sue now has 3 Gold Coins.
			Chet is the current player
			They have rolled a 3
			Chet's new location is 10
			The category is Sports
			Sports Question 2
			Answer was corrent!!!!
			Chet now has 4 Gold Coins.
			Pat is the current player
			They have rolled a 2
			Pat's new location is 11
			The category is Rock
			Rock Question 2
			Question was incorrectly answered
			Pat was sent to the penalty box
			Sue is the current player
			They have rolled a 1
			Sue's new location is 0
			The category is Pop
			Pop Question 2
			Answer was corrent!!!!
			Sue now has 4 Gold Coins.
			Chet is the current player
			They have rolled a 2
			Chet's new location is 0
			The category is Pop
			Pop Question 3
			Answer was corrent!!!!
			Chet now has 5 Gold Coins.
			Pat is the current player
			They have rolled a 2
			Pat is not getting out of the penalty box
			Sue is the current player
			They have rolled a 1
			Sue's new location is 1
			The category is Science
			Science Question 3
			Question was incorrectly answered
			Sue was sent to the penalty box
			Chet is the current player
			They have rolled a 4
			Chet's new location is 4
			The category is Pop
			Pop Question 4
			Answer was corrent!!!!
			Chet now has 6 Gold Coins.
			""";


	@Test
	void 따옴표3개_문자열을_뉴라인으로_스플릿_해보자() {
		String[] splited = result.split("\n");
		System.out.println(splited[0].trim());
		System.out.println(splited[1]);
		System.out.println(splited[2]);
	}
	
	@Test
	void 실제_게임_로그를_스플릿해서_공백_없는지_확인() {
		String[] splited = resultLog.split("\n");
		System.out.println(splited[0].trim());
		System.out.println(splited[1]);
		System.out.println(splited[2]);
	}

}
