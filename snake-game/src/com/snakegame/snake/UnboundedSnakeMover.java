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
public class UnboundedSnakeMover extends SnakeMover {

	public UnboundedSnakeMover(Snake snake, Board board) {
		super(snake, board);
	}

	@Override
	public boolean move() {
		return false;
	}

}
