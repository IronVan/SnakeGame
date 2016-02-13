package my.snakegame.objects;

public class Snake {

	public int direction = 2;
	public int length = 2;

	public final int RIGTH = 0;
	public final int DOWN = 1;
	public final int LEFT = 2;
	public final int UP = 3;

	public int snakeX[] = new int[100];
	public int snakeY[] = new int[100];

	public Snake(int x0, int y0, int x1, int y1) {
		snakeX[0] = x0;
		snakeY[0] = y0;
		snakeX[1] = x1;
		snakeY[1] = y1;
	}

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
	}

}
