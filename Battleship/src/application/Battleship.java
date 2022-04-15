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
			
			stage.setTitle("Battleship" + user.toUpperCase());
			
			Button testButton = new Button("testing");
			Button testButton2 = new Button("testing2");
			Text titleText = new Text("Battleship");
			Pane playerBoard = new Pane(testButton);
			Pane enemyBoard = new Pane(testButton2);
			
			HBox hbox = new HBox(testButton, testButton2);
			hbox.setSpacing(50);
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
	
	
	
	public static void main(String[] args) {
		try {
			user = args[0];
		} catch (Exception e) {
			e.printStackTrace();
		}
		launch(args);
	}
}
