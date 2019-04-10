package application;




import java.util.Timer;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Animation.Status;
import javafx.fxml.FXML;
import javafx.util.Duration;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;



public class Obsticles extends gameController{

	@FXML
	private Circle player;
	@FXML
	private Rectangle startTile;
	
	//public Status status;
	
	public double x;
	
	public double y;
	
	//public Timer cTime;

	public Obsticles(AnchorPane pane, Rectangle startTile) {
																//Creates base Grunt Unit
		
																	//Creates base Grunt Unit
			Circle grunte = new Circle();
			grunte.setRadius(30);
			grunte.setFill(javafx.scene.paint.Color.RED);
			grunte.setLayoutX(250);
			grunte.setLayoutY(500);
			
																	//Code of the generic Path
			Path path = new Path();
		
			path.getElements().add(new MoveTo(200,0));	    
		    
		    
		    														//Start Coordinates
			double startX = -15;
		    double endX = -115;
		    														//Loop's rest of enemy path
		  //  for(int i = 0; i <= 6 ; ++i) {
		    	
		    	path.getElements().add(new LineTo(0, 250));
		    	path.getElements().add(new LineTo(250, 10));
		    	path.getElements().add(new LineTo(0, 10));
		    	path.getElements().add(new LineTo(250, 10));
		    //	path.getElements().add(new LineTo(endX, 1000));
		    //	path.getElements().add(new LineTo(endX, 10));
		    //	path.getElements().add(new LineTo(endX - 100, 10));
		    	
		    	startX = endX - 200;
		    	endX = endX - 300;
		    	
		 // path.addEventHandler(eventType, eventHandler); //may be useful
		    	
		    	
		//    }
		   													//Adds path to grunt unit
		    PathTransition pathT = new PathTransition();
		    
		    pathT.setDuration(Duration.seconds(2));
		    pathT.setPath(path);
		    pathT.setNode(grunte);
		    pathT.setCycleCount(Animation.INDEFINITE);
		    pathT.setAutoReverse(false);
		    pathT.play();
		  //  status = pathT.getStatus();
		  //  cTime = new Timer();
		    x = grunte.getTranslateX();
		    y = grunte.getTranslateY(); 
		   
		  
		    pane.getChildren().add(grunte);
		  /*  
		  if(cTime.toSeconds() % 3 == 0) {
			  enemyMovement(this);
		  }
			*/
			
			
		}
		
		}

	
	