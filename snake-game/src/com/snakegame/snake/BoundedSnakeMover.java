/**
 * 
 */
package com.snakegame.snake;

import java.util.Random;

import com.snakegame.model.Board;
import com.snakegame.model.CellData;
import com.snakegame.model.Snake;

/**
 * @author VJ
 * 13 May 2022
 */
public class BoundedSnakeMover extends SnakeMover {

	public BoundedSnakeMover(Snake snake, Board board) {
		super(snake, board);
	}

	@Override
	public boolean move() {
		String direction = this.chooseRandomDirection();
		int[] curr = this.snake.getSnakeCurrPosition();
		curr = new int[] { curr[0], curr[1] };
		if (direction.equals("L")) {
			curr[1] -= 1;
		} else if (direction.equals("R")) {
			curr[1] += 1;
		} else if (direction.equals("U")) {
			curr[0] -= 1;
		} else {
			curr[0] += 1;
		}
		int m = board.getRows();
		int n = board.getColumns();
		if (curr[0] < 0 || curr[1] < 0 || curr[0] >= m || curr[1] >= n
				|| board.getValue(curr[0], curr[1]).equals(CellData.SNAKE.name())) {
			// snake has hit walls or itself;
			return false;
		}
		if (this.board.getValue(curr[0], curr[1]).equals(CellData.FOOD.name())) {
			// snake eats food and grows length
			this.snake.growSnakeLength();
		} else {
			// snake moves ahead, vacating prev pos
			this.board.setFree(snake.getSnakeCurrPosition()[0], snake.getSnakeCurrPosition()[1]);
		}
		this.board.setSnake(curr[0], curr[1]);
		this.snake.updateCurrentPosition(curr[0], curr[1]);
		return true;
	}

	private String chooseRandomDirection() {
		int x = new Random().nextInt(4);
		return directions[x];
	}
}
