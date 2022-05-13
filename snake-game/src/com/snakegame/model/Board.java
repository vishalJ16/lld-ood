/**
 * 
 */
package com.snakegame.model;

import com.snakegame.food.FoodGenerator;
import com.snakegame.food.IFoodGenerator;

/**
 * @author VJ
 * 13 May 2022
 */
public class Board {

	int rows;
	int columns;
	String[][] board;

	private static final int DEFAULT_ROWS = 10;
	private static final int DEFAULT_COLUMNS = 10;

	public Board() {
		this(DEFAULT_ROWS, DEFAULT_COLUMNS);
	}

	private void init() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				board[i][j] = "";
			}
		}
	}

	public Board(int m, int n) {
		this.rows = m;
		this.columns = n;
		this.board = new String[rows][columns];
		init();
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void generateFood() {

		IFoodGenerator fg = new FoodGenerator(5);
		fg.generate(this);
	}

	public String getValue(int x, int y) {
		return this.board[x][y];
	}

	public void setFood(int x, int y) {
		this.board[x][y] = CellData.FOOD.name();
	}

	public void setFree(int x, int y) {
		this.board[x][y] = "";
	}

	public void setSnake(int x, int y) {
		this.board[x][y] = CellData.SNAKE.name();
	}
}
