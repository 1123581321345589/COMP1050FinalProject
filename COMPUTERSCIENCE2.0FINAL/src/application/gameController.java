package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class gameController {

	@FXML
	private Button keyboard;
	@FXML
	private Circle player;
	@FXML
	private Rectangle obsticle;
	@FXML
	private Circle cobj;
	// Valid Stage1 tiles
	@FXML private Rectangle startTile;
	@FXML private Rectangle tile2;
	@FXML private Rectangle tile3;
	@FXML private Rectangle tile4;
	@FXML private Rectangle tile5;
	@FXML private Rectangle tile6;
	@FXML private Rectangle tile7;
	@FXML private Rectangle tile8;
	@FXML private Rectangle endTile;
	@FXML private Rectangle bar1;
	@FXML private Rectangle bar2;
	@FXML private Rectangle bar3;
	@FXML private Rectangle bar4;
	@FXML private Rectangle bar5;
	@FXML private Rectangle bar6;
	@FXML private Rectangle bar7;
	@FXML private Rectangle bar8;
	@FXML private Rectangle bar9;
	@FXML private Rectangle bar10;
	@FXML private Rectangle barend;
	@FXML private AnchorPane pane;
	
	private MainMenuController MC;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		//On initalize load the obsticles class and set their animation path
		new Obsticles(pane);
	}
	
	public void setMC(MainMenuController MC) {
		this.MC = MC;
	}
	
	
	public boolean validMov(int direction) {
		//Declare all relevent points
		Double playerRightX = player.getLayoutX() + player.getRadius();
		Double playerRightY = player.getLayoutY() + player.getRadius();
		
		Point2D RT = new Point2D(playerRightX, playerRightY);
		Point2D RB = new Point2D(playerRightX, player.getLayoutY() - player.getRadius());
		
		Point2D LT = new Point2D(player.getLayoutX() - player.getRadius(), playerRightY);
		Point2D LB = new Point2D(player.getLayoutX() - player.getRadius(), player.getLayoutY() - player.getRadius());
		//Checking if a right move is valid
		if(direction == 1) {
			if((startTile.getBoundsInParent().contains(RT) || startTile.getBoundsInParent().contains(RB) )){
				return true;
			}
			else if(tile2.getBoundsInParent().contains(RT) || tile2.getBoundsInParent().contains(RB)) {
				return true;
			}
			else if(tile3.getBoundsInParent().contains(RT) || tile3.getBoundsInParent().contains(RB)) {
				return true;
			}
			else if(tile4.getBoundsInParent().contains(RT) || tile4.getBoundsInParent().contains(RB)) {
				return true;
			}
			else if(tile5.getBoundsInParent().contains(RT) || tile5.getBoundsInParent().contains(RB)) {
				return true;
			}
			else if(tile6.getBoundsInParent().contains(RT) || tile6.getBoundsInParent().contains(RB)) {
				return true;
			}
			else if(tile7.getBoundsInParent().contains(RT) || tile7.getBoundsInParent().contains(RB)) {
				return true;
			}
			else if(tile8.getBoundsInParent().contains(RT) || tile8.getBoundsInParent().contains(RB)) {
				return true;
			}
			else if(endTile.getBoundsInParent().contains(RT) || endTile.getBoundsInParent().contains(RB)) {
				return true;
			}
			else {
				return false;
			}
		}
		//Checking if a left move is valid
		if(direction == 2) {
			if(startTile.getBoundsInParent().contains(LT) || startTile.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile2.getBoundsInParent().contains(LT) || tile2.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile3.getBoundsInParent().contains(LT) || tile3.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile4.getBoundsInParent().contains(LT) || tile4.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile5.getBoundsInParent().contains(LT) || tile5.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile6.getBoundsInParent().contains(LT) || tile6.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile7.getBoundsInParent().contains(LT) || tile7.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile8.getBoundsInParent().contains(LT) || tile8.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(endTile.getBoundsInParent().contains(LT) || endTile.getBoundsInParent().contains(LB)) {
				return true;
			}
			else {
				return false;
			}
		}
		//Checking if a move up is valid
		if(direction == 3) {
			if(startTile.getBoundsInParent().contains(RT) || startTile.getBoundsInParent().contains(LT)) {
				return true;
			}
			else if(tile2.getBoundsInParent().contains(RT) || tile2.getBoundsInParent().contains(LT)) {
				return true;
			}
			else if(tile3.getBoundsInParent().contains(RT) || tile3.getBoundsInParent().contains(LT)) {
				return true;
			}
			else if(tile4.getBoundsInParent().contains(RT) || tile4.getBoundsInParent().contains(LT)) {
				return true;
			}
			else if(tile5.getBoundsInParent().contains(RT) || tile5.getBoundsInParent().contains(LT)) {
				return true;
			}
			else if(tile6.getBoundsInParent().contains(RT) || tile6.getBoundsInParent().contains(LT)) {
				return true;
			}
			else if(tile7.getBoundsInParent().contains(RT) || tile7.getBoundsInParent().contains(LT)) {
				return true;
			}
			else if(tile8.getBoundsInParent().contains(RT) || tile8.getBoundsInParent().contains(LT)) {
				return true;
			}
			else if(endTile.getBoundsInParent().contains(RT) || endTile.getBoundsInParent().contains(LT)) {
				return true;
			}
			else {
				return false;
			}
		}
		//Checking if down is a valid move
		if(direction == 4) {
			if(startTile.getBoundsInParent().contains(RB) || startTile.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile2.getBoundsInParent().contains(RB) || tile2.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile3.getBoundsInParent().contains(RB) || tile3.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile4.getBoundsInParent().contains(RB) || tile4.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile5.getBoundsInParent().contains(RB) || tile5.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile6.getBoundsInParent().contains(RB) || tile6.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile7.getBoundsInParent().contains(RB) || tile7.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(tile8.getBoundsInParent().contains(RB) || tile8.getBoundsInParent().contains(LB)) {
				return true;
			}
			else if(endTile.getBoundsInParent().contains(RB) || endTile.getBoundsInParent().contains(LB)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
		return false;
	}
	
	@FXML
	public void handlekeyboard(KeyEvent event) {
		
		keyboard.requestFocus();
		
		int direction;
		
		if(event.getCode() == KeyCode.RIGHT) // && (startTile.getBoundsInParent().contains(playerRightX, playerRightY) || tile2.getBoundsInParent().contains(playerRightX, playerRightY) || tile3.getBoundsInParent().contains(playerRightX, playerRightY) || tile4.getBoundsInParent().contains(playerRightX, playerRightY) || tile5.getBoundsInParent().contains(playerRightX, playerRightY) || tile6.getBoundsInParent().contains(playerRightX, playerRightY) || tile7.getBoundsInParent().contains(playerRightX, playerRightY) || tile8.getBoundsInParent().contains(playerRightX, playerRightY))) {
			{
			direction = 1;
			if(validMov(direction)) {
				player.setLayoutX(player.getLayoutX() + 2);
			}
			}
		else if(event.getCode() == KeyCode.LEFT) {
			direction = 2;
			if(validMov(direction)) {
				player.setLayoutX(player.getLayoutX() - 2);
			}
		}
		else if(event.getCode() == KeyCode.UP) {
			direction = 4;
			if(validMov(direction)) {
			player.setLayoutY(player.getLayoutY() - 2);
			}
		}
		else if(event.getCode() == KeyCode.DOWN) {
			direction = 3;
			if(validMov(direction)) {
			player.setLayoutY(player.getLayoutY() + 2);
			}
		}
		
	}
	
	
	
	
}
