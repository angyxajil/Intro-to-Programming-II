package exercises;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class MagicEightBall extends StackPane {
	
	Polygon triangle = new Polygon(0, 60, 60, -40, -60, -40);
	
	Circle eightBall = new Circle(250, 200, 130);
	
	WiseSaying wise = new WiseSaying();

	Label label = new Label("Ask a question!");

	
	public void showSaying() {		
		
		String response = wise.getRandomSaying();
		
		label.setText(response);
		
		label.setTranslateY(-27);
		
		//System.out.println("response on label");
	}
	
	public void showItems() {
		
		label.setTextFill(Color.WHITE);
		
		label.setTranslateY(-27);
		
		triangle.setFill(Color.DARKBLUE);
		
		getChildren().addAll(eightBall, triangle, label);

	}
	
}
