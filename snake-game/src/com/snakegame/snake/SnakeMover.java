/**
 * 
 */
package com.snakegame.snake;

import com.snakegame.model.Board;
import com.snakegame.model.Snake;

/**
 * @author VJ
 * 13 May 2022
 */
public abstract class SnakeMover {

	Snake snake;
	Board board;
	
	protected static final String[] directions = { "L", "R", "U", "D" };

	public SnakeMover(Snake snake, Board board) {
		this.snake = snake;
		this.board = board;
	}

	public abstract boolean move();
}
