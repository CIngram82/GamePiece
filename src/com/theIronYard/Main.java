package com.theIronYard;

import com.GamePiece;

public class Main {

    public static void main(String[] args) {
    		GamePiece pawn = new GamePiece();
				pawn.move(3,4);
//    		pawn.freeze();
				System.out.println(pawn.getPosX() +" "+ pawn.getPosY());
				pawn.move(600,600);
				System.out.println(pawn.getPosX() +" "+ pawn.getPosY());
//				pawn.unfreeze();
				pawn.move(6,6);
				System.out.println(pawn.getPosX() +" "+ pawn.getPosY());
				pawn.randomPosXY();
				System.out.println(pawn.getPosX() +" "+ pawn.getPosY());
		}
}
//    Model a game piece:
	//        Test the freeze, unfreeze and move methods in the public static void main(String[] args) method of Main.java.
	//
//        Create a GamePiece object.
//        Only call the methods on the object, do not access the instance variables directly.
//        Verify that if the game piece is not frozen then the call to freeze sets the frozen varable to true.
//        Verify that if the game piece is frozen then the call to unfreeze sets the frozen varable to false.
//        Verify that if the game piece is not frozen then the call to move results in the new position.
//        Verify that if the game piece is frozen then the call to move does not change the position.
//        Extras
//
//        Use the Random.nextInt method to randomly get values for x and y when calling move.
//
//        More Extras
//
//        Add four instance variables (minX, maxX, minY, maxY) to define the bounds of a grid confining the game piece (e.g. x is bounded by zero and 100 and y is bounded by zero and 500). Set the values in the constructor. Add getter methods.
//
//        Refactor the move() method to not allow the game piece to move outside the grid (move the piece to the border of the grid but not beyond).
//
//        Test the movement in the main method of Main.java.