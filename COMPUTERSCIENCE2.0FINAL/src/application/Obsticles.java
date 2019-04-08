package application;




import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.util.Duration;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;



public class Obsticles extends gameController{

	@FXML
	private Circle player;
	
	//public Status status;
	
	public double x;
	
	public double y;
	
	//public Timer cTime;

	public Obsticles(AnchorPane pane) {
																//Creates base Grunt Unit
		Circle grunte = new Circle();
		grunte.setRadius(player.getRadius());
		grunte.setFill(javafx.scene.paint.Color.RED);
		grunte.setCenterX(100);
		grunte.setCenterY(55);
		
		
																//Code of the generic Path
		Path path = new Path();
	
		path.getElements().add(new MoveTo(100,55));	
		
	    
	    
	    														//Start Coordinates
	  //  double startX = -15;
	//    double endX = -115;
	    														
	 //   for(int i = 0; i <= 6 ; ++i) {
	    	
	    	path.getElements().add(new LineTo(100, 55));
	    	path.getElements().add(new LineTo(300, 55));
	   /* 	path.getElements().add(new LineTo(endX, 1000));
	    	path.getElements().add(new LineTo(endX, 10));
	    	path.getElements().add(new LineTo(endX - 100, 10));
	    	*/
	    	//startX = endX - 200;
	    //	endX = endX - 300;
	    	
	 // path.addEventHandler(eventType, eventHandler); //may be useful
	    	
	    	
	 //   }
	   													
	    PathTransition pathT = new PathTransition();
	    
	    pathT.setDuration(Duration.seconds(5));
	    pathT.setPath(path);
	    pathT.setNode(grunte);
	    pathT.setCycleCount(Animation.INDEFINITE);
	    pathT.setAutoReverse(false);
	    pathT.play();
	   
	    pane.getChildren().add(grunte);
	    
	  /*  
	  if(cTime.toSeconds() % 3 == 0) {
		  enemyMovement(this);
	  }
		*/
		
		
	}
}
	/* Not needed anymore
	public Obsticles(Rectangle grunt, AnchorPane pane, Rectangle spawner) {
		if(spawner.getBoundsInParent().contains(grunte.getTranslateX(), grunte.getTranslateY())) {
			
			new enemyCollection(grunt, spawnBox, pane);
			
			
		}
		
		
		
		
		
	}
	
	*/

	