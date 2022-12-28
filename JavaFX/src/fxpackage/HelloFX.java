package fxpackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {
		
		public static void main(String[] args) {
			
			System.out.println("hey there fx");
			Application.launch(args);
			
		}
		
		
		@Override
		public void start(@SuppressWarnings("exports") Stage primaryStage) {
			System.out.println("top of start class");

			primaryStage.setTitle("Hello World! window title");

			Text tx = new Text("Look at this awesome text!.Hidden behind the button");
			Button btn = new Button();
			btn.setText("Say 'Hello World'");

			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hello to the World!");
				}

			});

			StackPane root = new StackPane();
			root.getChildren().add(tx);
			root.getChildren().add(btn);

			Scene sc = new Scene(root, 400, 250);
			primaryStage.setScene(sc);
			primaryStage.show();

			System.out.println("bottom of start class");
	}

}