package com.QA.TextAdventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
	
	
	static boolean stillPlaying = true;
	static boolean correctY;
	static boolean correctX;
	
	public static void main(String[] args) {
		
		//scanner
		Scanner sc = new Scanner(System.in);
		
		
		Map map = new Map(10, 10);
		
		Player player = new Player("dave", 0,0);
		PointOfInterest tree = new PointOfInterest("oak", 1,1);
		Treasure treasure = new Treasure("Gold", 2,3);
		
		map.listOfObjects.add(player);
		map.listOfObjects.add(tree);
		map.listOfObjects.add(treasure);
		
		
		
		for (int i: map.mapArrayX){
			
			if(treasure.getPositionX() == player.getPositionX())
			{
				correctX = true;
			}
			else
			{
				correctX = false;
			}
		}
		
		for (int j: map.mapArrayY) {	
			
			if(treasure.getPositionY() == player.getPositionY())
			{
				correctY = true;
			}
			else
			{
				correctY = false;
			}
		}
		
		//System.out.println("X: "+correctX);
		//System.out.println("Y: "+correctY);
		
		
		System.out.println("Find the treasure!"); 
		System.out.println("Type 'north', 'east', 'south' or 'west' to move in that direction");
		
		
		while(stillPlaying)
		{
			//take input
			System.out.println("enter text:");
			String input = sc.next();
			
			if((player.getPositionX() == treasure.getPositionX())&&(player.getPositionY() == treasure.getPositionY()))
			{
				System.out.println("you found the treasure!!!");
				stillPlaying = false;
			}
			else if(input.equals("north"))
			{
				player.setPositionX(player.getPositionX() + 1);
			}
			else if (input.equals("south"))
			{
				player.setPositionX(player.getPositionX() - 1);
			}
			else if (input.equals("east"))
			{
				player.setPositionY(player.getPositionY() + 1);
			}
			else if (input.equals("west"))
			{
				player.setPositionY(player.getPositionY() - 1);
			}
			else
			{
				System.out.println("invalid move. Try again!");
			}
			
			System.out.println("moving "+input);
			System.out.println("x position: "+player.getPositionX());
			System.out.println("y position: "+player.getPositionY());
		}
		
		
		
		
		
        
		
		
	}

}
