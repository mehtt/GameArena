public class Driver
{
	public static void main(String[] args)
	{
	GameArena a1 = new GameArena(600, 400);
	Ball b1 = new Ball(200, 200, 25, "RED",10);
	
	a1.addBall(b1);

	while(true)
	{
		if(a1.downPressed())
			b1.moveDown();
		
		if(a1.upPressed())
			b1.moveUp();
		
		if(a1.leftPressed())
			b1.moveLeft();
		
		if(a1.rightPressed())
			b1.moveRight();
		
		a1.pause();
	}
}
}