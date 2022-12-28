package exercises;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtontoClock extends Application {

	@Override
	public void start(@SuppressWarnings("exports") Stage primaryStage) {
		primaryStage.setTitle("Digital Clock");
	// --------------------------------------------------------------------		
		VBox vbox1 = new VBox(10); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		vbox1.setAlignment(Pos.BOTTOM_CENTER);
		
		HBox hbox1 = new HBox(30); // the attribute sets the space between buttons
		hbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		hbox1.setStyle("-fx-background-color: LAVENDER");
		hbox1.setAlignment(Pos.BOTTOM_CENTER);  //placement

		
	// --------------------------------------------------------------------
		Text txt1 = new Text();
		Text txt2 = new Text();
		Button btn1 = new Button();
		Button btn2 = new Button();
		
		Date currentTime = new Date();
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
		
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
		
	// --------------------------------------------------------------------		
		btn1.setText("Show Current Time");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println(timeFormat.format(currentTime));
				txt1.setText(timeFormat.format(currentTime));
				txt1.setFont(Font.font ("Courier New", 30));
				txt1.setFill(Color.BLACK);
				
			}
		});
		
		
		btn2.setText("Show Today's Date");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println(dateFormat.format(currentDate));
				txt1.setText(dateFormat.format(currentDate));
			}
		});
	// --------------------------------------------------------------------	
		
		txt2.setText("Welcome to Our Digital Clock! (:");
		txt2.setFont(Font.font ("Arial", 15));
		txt2.setFill(Color.BLACK);
		
		hbox1.getChildren().add(btn1);
		hbox1.getChildren().add(btn2);
		
		vbox1.getChildren().add(txt1);
		vbox1.getChildren().add(hbox1);
		vbox1.getChildren().add(txt2);

		Scene sc = new Scene(vbox1, 450, 200);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}