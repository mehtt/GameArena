public class Driver
{
	public static void main(String[] args)
	{
	GameArena a1 = new GameArena(400, 800);
	Ball player = new Ball(0, 0, 10, "GREEN",10);
	Ball b1 = new Ball ( a1.getArenaWidth()*0.25, -300, 50, "RED", 10);
	Ball b2 = new Ball ( a1.getArenaWidth()*0.5, -500, 50, "RED", 10);
	Ball b3 = new Ball ( a1.getArenaWidth()*0.75, -50, 50, "RED", 10);
	
	a1.addBall(player);
	a1.addBall(b1);
	a1.addBall(b2);
	a1.addBall(b3);
	
	while(true)
	{
		if(a1.downPressed())
			player.moveDown();
		
		if(a1.upPressed())
			player.moveUp();
		
		if(a1.leftPressed())
			player.moveLeft();
		
		if(a1.rightPressed())
			player.moveRight();
		
		b1.setYPosition(b1.getYPosition()+b1.getSpeed());
		if(b1.getYPosition() > a1.getArenaHeight())
			b1.setYPosition(0);
		
		b2.setYPosition(b2.getYPosition()+b2.getSpeed());
		if(b2.getYPosition() > a1.getArenaHeight())
			b2.setYPosition(0);
		
		b3.setYPosition(b3.getYPosition()+b3.getSpeed());
		if(b3.getYPosition() > a1.getArenaHeight())
			b3.setYPosition(0);
		
		a1.pause();	
	}
}
}