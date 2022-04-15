/**
 * This class is for each individual point on the grid of the battleship board.
 * contains an x and y coordinate location, an booleans to see if the point
 * contains a ship and whether or not it has been hit yet.
 */

package application;

public class Point {
	
	private boolean hit;
	private boolean hasShip;

	public Point() {
		hit = false;
		hasShip = false;
	}
	
	/**
	 * call when this point has been hit to check it has a hit location
	 */
	public void setAsHit() {
		hit = true;
	}
	
	/**
	 * retrieve status of whether or not this location has been hit
	 * @return boolean that is true if this location has been hit already
	 */
	public boolean getHitStatus() {
		return hit;
	}
	
	/**
	 * marks this location as containing a ship
	 */
	public void setShipHere() {
		hasShip = true;
	}
	
	/**
	 * checks if there is a ship at this location
	 * @return a boolean that is true if a ship is located here
	 */
	public boolean checkForShip() {
		return hasShip;
	}
}
