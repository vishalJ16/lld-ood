/**
 * 
 */
package com.snakegame.model;

import java.util.Random;

import com.snakegame.snake.BoundedSnakeMover;
import com.snakegame.snake.SnakeMover;

/**
 * @author VJ 13 May 2022
 * 
 *         Creates a snake. Snake will have head facing upwards...all directions
 *         will be calculated from that reference. Initial position is being set
 *         as the middle of the board. Snake will grow if it eats the food, with
 *         its head's new pos at food cell.
 * 
 */
public class Snake {

	int length;
//	int[][] coordinates;
	int[] currentPosition = new int[2];

	public Snake() {
		// currentPosition (0,0);
//		this.updateCoordinates(0, 0);
	}

	public Snake(int x, int y) {
		this.currentPosition = new int[] { x, y };
	}

	public boolean move(Board board) {
		SnakeMover snakeMover = new BoundedSnakeMover(this, board);
		boolean isAliveAfterMove = snakeMover.move();
		return isAliveAfterMove;
	}

	public void updateCurrentPosition(int x, int y) {
		this.currentPosition[0] = x;
		this.currentPosition[1] = y;
	}

	public int getSnakeLength() {
		return this.length;
	}

	public void growSnakeLength() {
		this.length++;
	}

	public int[] getSnakeCurrPosition() {
		return this.currentPosition;
	}
}
