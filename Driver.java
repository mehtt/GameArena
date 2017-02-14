public class Driver
{
	public static void main(String[] args)
	{
	GameArena a1 = new GameArena(600, 400);
	Ball b1 = new Ball(200, 200, 25, "CYAN");
	
	a1.addBall(b1);
	double speed = 5;
	double i = speed;
	double j = speed;

	while(true)
	{
		double x = b1.getXPosition();
		double y = b1.getYPosition();
		
		if(x > a1.getArenaWidth())
			i = -speed;
		
		if(x == 0)
			i = speed;
		
		b1.setXPosition(x = x+i);

		if(y > a1.getArenaHeight())
			j = -speed;
		
		if(y == 0)
			j = speed;
		
		b1.setYPosition(y = y+j);
		
		a1.pause();
	}
}
}