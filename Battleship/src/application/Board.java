/**
 * this is the board class that represents each Battleship board in the game.
 * Each game will have a board for the server player and the client player.
 * The board will be a 10 x 10 grid held as a 2D array of Point objects.
 */

package application;

public class Board {
	
	private Point[][] grid;
	
	public Board() {
		grid = new Point[10][10];
	}
	
	/**
	 * places a ship at the given x,y coordinates on the board and updates that point.
	 * @param x
	 * @param y
	 */
	public void placeShip(int x, int y) {
		grid[x][y].setShipHere();
	}
	
	/**
	 * fires an attack on the x,y coordinates on the board. returns a boolean of whether or not it was a hit.
	 * @param x the x coordinate of where to attack
	 * @param y the y coordinate of where to attack
	 * @return a boolean that is true if this attack is a hit and there is a ship at this location.
	 * false if it is a miss.
	 */
	public boolean fireMissle(int x, int y) {
		grid[x][y].setAsHit();
		return grid[x][y].checkForShip();
	}
}
