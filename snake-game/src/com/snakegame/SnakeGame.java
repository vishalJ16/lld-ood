/**
 * 
 */
package com.snakegame;

import com.snakegame.food.IFoodGenerator;
import com.snakegame.model.Board;
import com.snakegame.model.Snake;

/**
 * @author VJ
 * 13 May 2022
 */
public class SnakeGame {

	Board board;
	Snake snake;

	SnakeGame() {
	}

	SnakeGame(Board board) {
		this.board = board;

		// creating snake with initial position as mid of the board
		this.snake = new Snake(this.board.getRows() / 2, this.board.getColumns() / 2);
		this.board.setSnake(this.snake.getSnakeCurrPosition()[0], this.snake.getSnakeCurrPosition()[1]);
	}

	public void start() {
		boolean snakeAlive = true;
		while (snakeAlive) {
			this.board.generateFood();
			snakeAlive = snake.move(this.board);
		}

		System.out.println("Score: " + this.snake.getSnakeLength());
	}
}
