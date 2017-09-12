package com;

import java.util.Random;

public class GamePiece {
	int positionX;
	int positionY;
	Boolean frozen;
	String name;
	String color;
	int minX;
	int maxX;
	int minY;
	int maxY;

	public GamePiece(){
			positionX = 0;
			positionY = 0;
			frozen = false;
			minX = 0;
			maxX = 100;
			minY = 0;
			maxY = 500;
	}
	public int getPosX(){
			return positionX;
	}
	public int getPosY(){
				return positionY;
	}
	public Boolean getFrozen(){
			return frozen;
	}
	public String getColor() {
			return color;
	}
	public void setFrozen(Boolean frozen) {
			this.frozen = frozen;
	}
	public String getName() {
			return name;
	}
	public void setName(String name) {
			this.name = name;
	}
	public void setColor(String color) {
			this.color = color;
	}
	public void move(int newPosX, int newPosY){
			if (frozen == false) {
					if (newPosX < maxX){
							positionX = newPosX;
					}else {
							positionX = 100;
					}
					if (newPosY < maxY) {
							positionY = newPosY;
					}else{
							positionY = 500;
					}
			}
	}
	public void freeze(){
			frozen = true;
	}
	public void unfreeze(){
			frozen = false;
	}
	public void randomPosXY(){
			if (frozen == false){
					Random randomNum = new Random();
					positionX = randomNum.nextInt(100);
					positionY = randomNum.nextInt(500);
			}
	}
		public int getMinX() {
				return minX;
		}
		public int getMaxX() {
				return maxX;
		}
		public int getMinY() {
				return minY;
		}
		public int getMaxY() {
				return maxY;
		}
}
