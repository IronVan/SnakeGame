package my.snakegame.objects;

import my.snakegame.SnakeGame;

public class Snake {

	SnakeGame main;

	public int direction = 3;
	public int length = 2;

	public final int RIGTH = 0;
	public final int DOWN = 1;
	public final int LEFT = 2;
	public final int UP = 3;

	@SuppressWarnings("static-access")
	public int snakeX[] = new int[main.WIDTH * main.HEIGHT];
	@SuppressWarnings("static-access")
	public int snakeY[] = new int[main.WIDTH * main.HEIGHT];

	public Snake(int x0, int y0, int x1, int y1) {
		snakeX[0] = x0;
		snakeY[0] = y0;
		snakeX[1] = x1;
		snakeY[1] = y1;
	}

	@SuppressWarnings("static-access")
	public void move() {

		for (int d = length; d > 0; d--) {
			snakeX[d] = snakeX[d - 1];
			snakeY[d] = snakeY[d - 1];
		}

		if (direction == RIGTH)
			snakeX[0]++;
		if (direction == DOWN)
			snakeY[0]++;
		if (direction == LEFT)
			snakeX[0]--;
		if (direction == UP)
			snakeY[0]--;

		for (int d = length - 1; d > 0; d--) {
			if ((snakeX[0] == snakeX[d]) & (snakeY[0] == snakeY[d]))
				length = d;
		}

		if (snakeX[0] > main.WIDTH)
			snakeX[0] = 0;
		if (snakeX[0] < 0)
			snakeX[0] = main.WIDTH - 1;
		if (snakeY[0] > main.HEIGHT - 1)
			snakeY[0] = 0;
		if (snakeY[0] < 0)
			snakeY[0] = main.HEIGHT - 1;

		if (length < 2)
			length = 2;

	}

}
