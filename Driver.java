public class Driver
{
	public static void main(String[] args)
	{
	GameArena a1 = new GameArena(600, 400);
	Ball b1 = new Ball(200, 200, 25, "CYAN");
	
	a1.addBall(b1);

	while(true)
	{
		b1.moveBall(1,1,10);
		
		a1.pause();
	}
}
}