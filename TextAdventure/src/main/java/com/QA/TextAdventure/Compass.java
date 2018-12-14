package com.QA.TextAdventure;

public class Compass {
	
	public Compass()
	{
		
	}
	
	double distanceToTreasure(int playerX, int playerY, int treasureX, int treasureY)
	{
		//calculate distance between player and treasure using: a^ + b^ = c^
		double lengthX = (double)playerX - (double)treasureX;
		double lengthY = (double)playerY - (double)treasureY;
		double xSqu = lengthX * lengthX;
		double ySqu = lengthY * lengthY;
		double distSqu = xSqu + ySqu;
		double dist = Math.sqrt(distSqu);
		return dist;
	}
	
	double distanceToInterest(int playerX, int playerY, int interestX, int interestY)
	{
		//calculate distance between player and treasure using: a^ + b^ = c^
		double lengthX = (double)playerX - (double)interestX;
		double lengthY = (double)playerY - (double)interestY;
		double xSqu = lengthX * lengthX;
		double ySqu = lengthY * lengthY;
		double distSqu = xSqu + ySqu;
		double dist = Math.sqrt(distSqu);
		return dist;
	}
	
	

}
