/**
 * This is the Model class for the Battleship game.
 */

package application;

public class BattleshipModel {
	
	private Board playerBoard;
	private Board enemyBoard;
	
	public BattleshipModel() {
		playerBoard = new Board();
		enemyBoard = new Board();
	}
	
	public Board getPlayerBoard() {
		return playerBoard;
	}
	
	public Board getEnemyBoard() {
		return enemyBoard;
	}

}
