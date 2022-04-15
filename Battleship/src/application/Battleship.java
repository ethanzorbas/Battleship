/**
 * This is the view class for the Battleship game. Handles the GUI elements
 */

package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Battleship extends Application {
	
	/* Constants for the scene */
	private static final int SCENE_HEIGHT = 800;
	private static final int SCENE_WIDTH = 1200;
	
	private static String user;
	
	@Override
	public void start(Stage stage) {
		try {
			BattleshipController controller = new BattleshipController(user);
			
			stage.setTitle("Battleship " + user.toUpperCase());
			
			//outline for the battleship boards
			Rectangle boardOutline1 = new Rectangle(500, 500);
			Rectangle boardOutline2 = new Rectangle(500, 500);
			boardOutline1.setFill(Color.DARKGRAY);
			boardOutline2.setFill(Color.DARKGRAY);
			
			Text titleText = new Text("Battleship");
			
			// need help with this part.
			Board pBoard = controller.getPlayerBoard();
			Board eBoard = controller.getEnemyBoard();
			Pane playerBoard = new Pane(boardOutline1);
			Pane enemyBoard = new Pane(boardOutline2);
			
			HBox hbox = new HBox(playerBoard, enemyBoard);
			hbox.setSpacing(100);
			hbox.setAlignment(Pos.CENTER);
			VBox vbox = new VBox(titleText, hbox);
			vbox.setAlignment(Pos.BASELINE_CENTER);
			vbox.setSpacing(50);
			
			Scene scene = new Scene(vbox, SCENE_WIDTH, SCENE_HEIGHT);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// need this method to take a given board object and display it within the pane. Help pls!
	private void displayBoard(Board b) {
		
	}
	
	
	// gathers command line argument and runs javaFX application
	public static void main(String[] args) {
		try {
			user = args[0];
		} catch (Exception e) {
			e.printStackTrace();
		}
		launch(args);
	}
}
