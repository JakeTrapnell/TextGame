package com.QA.TextAdventure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {
	
	private int widthX;
	private int heightY;
	List<Physical> listOfObjects = new ArrayList<Physical>();
	int[] mapArrayX = new int[0];
	int[] mapArrayY = new int[0];
	
	public Map(int widthX, int heightY)
	{
		this.widthX = widthX;
		this.heightY = heightY;
		mapArrayX = new int[widthX];		
		mapArrayY = new int[heightY];
	}
	

	public int getWidthX() {
		return widthX;
	}

	public void setWidthX(int widthX) {
		this.widthX = widthX;
	}

	public int getHeightY() {
		return heightY;
	}

	public void setHeightY(int heightY) {
		this.heightY = heightY;
	}


	@Override
	public String toString() {
		return "Map [widthX=" + widthX + ", heightY=" + heightY + ", listOfObjects=" + listOfObjects + ", mapArrayX="
				+ Arrays.toString(mapArrayX) + ", mapArrayY=" + Arrays.toString(mapArrayY) + "]";
	}

}
