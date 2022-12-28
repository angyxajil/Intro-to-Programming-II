package exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

// Made possible by https://raw.githubusercontent.com/jsquared21/Intro-to-Java-Programming/master/Exercise_15/Exercise_15_11/Exercise_15_11.java
// which helped me with the movement using WASD
public class MovingCircle extends Application {
	
	private Circle circle;

	@Override
	public void start(@SuppressWarnings("exports") Stage primaryStage) {

	// --------------------------------------------------------------------	
		Pane pane = new Pane();
		
		 circle = new Circle(250, 200, 30);
		 circle.setFill(Color.LIGHTBLUE);
	// --------------------------------------------------------------------
		
		pane.setOnKeyPressed(e -> {
			switch(e.getCode()) {
			case W  : circle.setCenterY(circle.getCenterY() > circle.getRadius() ? circle.getCenterY() - 15: circle.getCenterY());
				break;
			case A:
				circle.setCenterX(circle.getCenterX() > circle.getRadius() ? circle.getCenterX() - 15: circle.getCenterX()); 
				break;
		    case S : circle.setCenterY(circle.getCenterY() < pane.getHeight() - circle.getRadius() ? circle.getCenterY() + 15 : circle.getCenterY()); 
		    	break;
		    case D:
				circle.setCenterX(circle.getCenterX() < pane.getWidth() - circle.getRadius() ? circle.getCenterX() + 15: circle.getCenterX());
				break;
		    case SPACE:
		    	 pane.getChildren().add(copyCircle());
				break;
			default:
				break;
			}
		});
		
		
	// --------------------------------------------------------------------

		Scene sc = new Scene(pane, 500, 350);
		primaryStage.setTitle("Moving Circle");
		primaryStage.setScene(sc);
		primaryStage.show();
		
		pane.getChildren().add(circle);
		pane.requestFocus();
	}

	 private Circle copyCircle() {
	        Circle c = new Circle(circle.getCenterX(), circle.getCenterY(), circle.getRadius(), circle.getFill());
	        return c;
	    }

	public static void main(String[] args) {
		Application.launch(args);
	}
}