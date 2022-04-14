/**
 * This is the controller class for the Battleship game. Handles the user input for decisions made in the game.
 */

package application;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class BattleshipController {

	public BattleshipController(String user) {
		if (user.toUpperCase().equals("SERVER")) {
			try {
				ServerSocket server = new ServerSocket(4000);
				Socket connection = server.accept();
				ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
				ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
				// Do some IO.
				connection.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (user.toUpperCase().equals("CLIENT")) {
			try {
				Socket server = new Socket("localhost", 4000);
				ObjectOutputStream output = new
					ObjectOutputStream(server.getOutputStream());
				ObjectInputStream input = new
					ObjectInputStream(server.getInputStream());
				// Do some IO with the server
				server.close();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
