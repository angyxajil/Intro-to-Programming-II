package exercises;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Buttons1 extends Application {

	@Override
	public void start(@SuppressWarnings("exports") Stage primaryStage) {

	// --------------------------------------------------------------------		
		VBox vbox1 = new VBox(45); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		vbox1.setAlignment(Pos.TOP_CENTER);
		
		GridPane gridBox = new GridPane();
		gridBox.setAlignment(Pos.CENTER); 
		gridBox.setHgap(45); // distance between 2 buttons
		gridBox.setPadding(new Insets(25, 15, 30, 30)); // size of background color
		gridBox.setStyle("-fx-background-color: LIGHTGRAY"); // sets color 
		
	// --------------------------------------------------------------------
		Text txt1 = new Text("Which do you prefer?");
		txt1.setFont(Font.font ("Chalkboard", 15)); // sets font and size
		
		Text txt3 = new Text("Vote by pressing the buttons!");
		txt3.setFont(Font.font ("Chalkboard", 15)); // sets font and size
		
		Text txt2 = new Text("Thank you for voting!!");
		txt2.setFont(Font.font ("Chalkboard", 15)); // sets font and size
		
		Button btn1 = new Button();
		Button btn2 = new Button();
		
	// --------------------------------------------------------------------		
		btn1.setText("Vote Cats");
		btn1.setStyle("-fx-background-color: LIGHTBLUE"); // changed color of buttons
		btn1.setFont(Font.font ("Chalkboard", 15)); // sets font and size
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("One vote added for cats");
				txt1.setText("Thank you for voting! (:");
				
			}
		});
		
		
		btn2.setText("Vote Dogs");
		btn2.setStyle("-fx-background-color: LIGHTBLUE");
		btn2.setFont(Font.font ("Chalkboard", 15));
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("One vote added for dogs");
				txt1.setText("Thank you for voting! (:");
			}
		});
	// --------------------------------------------------------------------		xc
		
		gridBox.add(btn1, 0, 0);
		gridBox.add(btn2, 1, 0);
		
		vbox1.getChildren().add(txt1);
		vbox1.getChildren().add(txt3);
		vbox1.getChildren().add(gridBox);

		vbox1.getChildren().add(txt2);

		Scene sc = new Scene(vbox1, 400, 350);
		primaryStage.setTitle("Two Button VBox");
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}