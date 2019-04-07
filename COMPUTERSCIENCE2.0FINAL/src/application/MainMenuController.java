package application;


import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainMenuController {

	@FXML private Button btn;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Rectangle statTile;
	@FXML private Rectangle tile2;
	@FXML private Rectangle tile3;
	@FXML private Rectangle tile4;
	@FXML private Rectangle tile5;
	@FXML private Rectangle tile6;
	@FXML private Rectangle tile7;
	@FXML private Rectangle tile8;
	@FXML private Rectangle endTile;
	
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void handlebtn(ActionEvent event) {
		
		try {
			
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("playGame.fxml"));
			
			Parent root = FXMLLoader.load(getClass().getResource("playGame.fxml"));
			Scene playGame = new Scene(root);
			
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(playGame);
			window.show();
			
			gameController c = loader.getController();
			
			c.setMC(this);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	public void handlebtn2(ActionEvent event) {
		
		btn2.setText("btn2 WORKS");
		
	}
	public void handlebtn3(ActionEvent event) {
		
		btn3.setText("btn3 WORKS");
		
	}
	
	
	
}
