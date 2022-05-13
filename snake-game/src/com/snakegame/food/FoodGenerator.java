/**
 * 
 */
package com.snakegame.food;

import java.util.Random;

import com.snakegame.model.Board;
import com.snakegame.model.CellData;

/**
 * @author VJ
 * 13 May 2022
 */
public class FoodGenerator implements IFoodGenerator {

	private int numberOfFoods;

	public FoodGenerator(int number) {
		this.numberOfFoods = number;
	}

	public void generate(Board board) {

		Thread fgThread = new Thread(new Runnable() {

			@Override
			public void run() {
				int x = 0;
				int y = 0;
				for (int i = 0; i < numberOfFoods; i++) {
					do {
						x = new Random().nextInt(board.getRows());
						y = new Random().nextInt(board.getColumns());
					} while (board.getValue(x, y).equals(CellData.SNAKE.name()));

					board.setFood(x, y);
				}

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}
				board.setFree(x, y);

			}
		});
		fgThread.start();
	}
}
