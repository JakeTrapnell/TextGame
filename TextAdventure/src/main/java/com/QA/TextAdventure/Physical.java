package com.QA.TextAdventure;

public abstract class Physical {
	
	private String name;
	private int positionX;
	private int positionY;
	
	public Physical(String name, int positionX, int positionY)
	{
		this.name= name;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public int getPositionY(){
		return positionY;
	}
	
	public void setPositionY(int positionY)
	{
		this.positionY = positionY;
	}

	@Override
	public String toString() {
		return "Physical [name=" + name + ", positionX=" + positionX + ", positionY=" + positionY + "]";
	}
	
	
	
}
