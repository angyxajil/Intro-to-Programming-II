package exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Make a line drawing program.
//Use the mouse to click in the window, drag to another location, then release the button.
//The program will draw a line between the two points.
//The program should be able to draw at least 10 lines.
//Use the left and right arrow keys to change the color of the lines.

public class LineDrawing extends Application {

	private Canvas canvas; // function to draw on, sets size
	private GraphicsContext ln; // function for shapes
	@SuppressWarnings("unused")
	private ColorPicker cp = new ColorPicker();

	@Override
	public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {

		canvas = new Canvas(600, 500);

		// --------------------------------------------------------------------

		ln = canvas.getGraphicsContext2D(); // sets type of shape on canvas
		ln.setStroke(Color.BLACK); // set color
		ln.setLineWidth(2); // set thickness
		// --------------------------------------------------------------------

		canvas.setOnMousePressed(e -> { // called when mouse is pressed
			ln.beginPath(); // resets path to empty for new line
			ln.lineTo(e.getSceneX(), e.getSceneY()); // gets position of mouse
			ln.stroke(); // draws line
		});

		canvas.setOnMouseDragged(e -> { // called when the mouse is released
			ln.lineTo(e.getSceneX(), e.getSceneY()); // gets position of mouse
			ln.stroke(); // draws line
		});
		// --------------------------------------------------------------------

		Pane pane = new Pane(); // creates new pane
		pane.getChildren().addAll(canvas); // adds canvas to the pane //add ", cp" in parameters for pallete

		Scene scene = new Scene(pane, 600, 500);
		// creates window with pane (includes canvas) and matches the size of canvas
		// --------------------------------------------------------------------

		canvas.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case UP:
				ln.setStroke(Color.RED);
				break;
			case DOWN:
				ln.setStroke(Color.GREEN);
				break;
			case RIGHT:
				ln.setStroke(Color.LIGHTBLUE);
				break;
			case LEFT:
				ln.setStroke(Color.VIOLET);
				break;
			default:
				break;
			}
		});

		// --------------------------------------------------------------------

		primaryStage.setTitle("Line Drawing :)"); // title of window
		primaryStage.setScene(scene); // creates window with the scene
		primaryStage.show(); // displays window

		canvas.requestFocus();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
