package exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ChessBoard extends Application {
	@Override // Override the start method in the Application class
	public void start(@SuppressWarnings("exports") Stage primaryStage) {
		// Create a pane and set its properties
		GridPane gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		gPane.setHgap(0.5); // space between squares horizontally
		gPane.setVgap(0.5); // space between squares vertically

		Rectangle r01 = new Rectangle(0, 0, 50, 50); // top left at location 0,0 - size 50 width x 50 50 height
		Rectangle r02 = new Rectangle(0, 0, 50, 50);
		Rectangle r03 = new Rectangle(0, 0, 50, 50);
		Rectangle r04 = new Rectangle(0, 0, 50, 50);
		Rectangle r05 = new Rectangle(0, 0, 50, 50);
		Rectangle r06 = new Rectangle(0, 0, 50, 50);
		Rectangle r07 = new Rectangle(0, 0, 50, 50);
		Rectangle r08 = new Rectangle(0, 0, 50, 50);
		Rectangle r09 = new Rectangle(0, 0, 50, 50);
		Rectangle r10 = new Rectangle(0, 0, 50, 50);
		Rectangle r11 = new Rectangle(0, 0, 50, 50);
		Rectangle r12 = new Rectangle(0, 0, 50, 50);
		Rectangle r13 = new Rectangle(0, 0, 50, 50);
		Rectangle r14 = new Rectangle(0, 0, 50, 50);
		Rectangle r15 = new Rectangle(0, 0, 50, 50);
		Rectangle r16 = new Rectangle(0, 0, 50, 50);
		Rectangle r17 = new Rectangle(0, 0, 50, 50);
		Rectangle r18 = new Rectangle(0, 0, 50, 50);
		Rectangle r19 = new Rectangle(0, 0, 50, 50);
		Rectangle r20 = new Rectangle(0, 0, 50, 50);
		Rectangle r21 = new Rectangle(0, 0, 50, 50); // top left at location 0,0 - size 50 width x 50 50 height
		Rectangle r22 = new Rectangle(0, 0, 50, 50);
		Rectangle r23 = new Rectangle(0, 0, 50, 50);
		Rectangle r24 = new Rectangle(0, 0, 50, 50);
		Rectangle r25 = new Rectangle(0, 0, 50, 50);

		
		r01.setFill(Color.BLACK);
		r02.setFill(Color.LIGHTGRAY);
		r03.setFill(Color.BLACK);
		r04.setFill(Color.LIGHTGRAY);
		r05.setFill(Color.BLACK);
		r06.setFill(Color.LIGHTGRAY);
		r07.setFill(Color.BLACK);
		r08.setFill(Color.LIGHTGRAY);
		r09.setFill(Color.BLACK);
		r10.setFill(Color.LIGHTGRAY);
		r11.setFill(Color.BLACK);
		r12.setFill(Color.LIGHTGRAY);
		r13.setFill(Color.BLACK);
		r14.setFill(Color.LIGHTGRAY);
		r15.setFill(Color.BLACK);
		r16.setFill(Color.LIGHTGRAY);
		r17.setFill(Color.BLACK);
		r18.setFill(Color.LIGHTGRAY);
		r19.setFill(Color.BLACK);
		r20.setFill(Color.LIGHTGRAY);
		r21.setFill(Color.BLACK);
		r22.setFill(Color.LIGHTGRAY);
		r23.setFill(Color.BLACK);
		r24.setFill(Color.LIGHTGRAY);
		r25.setFill(Color.BLACK);
		

		// Place nodes in the pane
		gPane.add(r01, 0, 0); // put Rectangle r01 at grid location column 0, row 0
		gPane.add(r02, 0, 1); // put Rectangle r02 at grid location column 0, row 1
		gPane.add(r03, 0, 2);
		gPane.add(r04, 0, 3);
		gPane.add(r05, 0, 4);
		gPane.add(r06, 1, 0);
		gPane.add(r07, 1, 1);
		gPane.add(r08, 1, 2);
		gPane.add(r09, 1, 3);
		gPane.add(r10, 1, 4);
		gPane.add(r11, 2, 0);
		gPane.add(r12, 2, 1);
		gPane.add(r13, 2, 2);
		gPane.add(r14, 2, 3);
		gPane.add(r15, 2, 4);
		gPane.add(r16, 3, 0);
		gPane.add(r17, 3, 1);
		gPane.add(r18, 3, 2);
		gPane.add(r19, 3, 3);
		gPane.add(r20, 3, 4);
		gPane.add(r21, 4, 0); 
		gPane.add(r22, 4, 1); 
		gPane.add(r23, 4, 2);
		gPane.add(r24, 4, 3);
		gPane.add(r25, 4, 4);
		// goes top to bottom, left to right
		

		// Create a scene and place it in the stage
		Scene scene = new Scene(gPane);
		primaryStage.setTitle("Mini Chess"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
