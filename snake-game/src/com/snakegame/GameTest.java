/**
 * 
 */
package com.snakegame;

import com.snakegame.model.Board;

/**
 * @author VJ
 * 13 May 2022
 */
public class GameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Board board = new Board(20, 20);

		SnakeGame game = new SnakeGame(board);
		game.start();
	}

}
