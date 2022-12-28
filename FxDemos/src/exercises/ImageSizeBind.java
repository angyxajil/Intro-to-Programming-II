package exercises;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageSizeBind extends Application {
	@Override // Override the start method in the Application class
	public void start(@SuppressWarnings("exports") Stage primaryStage) throws FileNotFoundException, Exception {
		double winHeight = 100;
		double winWidth = 300;
		double winRatio = 1.0;
		
		// Create a pane to hold the image views
		Pane sPane = new StackPane();
		sPane.setPadding(new Insets(5, 5, 5, 5));		

		Image image1 = new Image("file:///Users/AngyXajil/Desktop/minecraft.jpg");
		//sets image with path
		
		double imgHeight = image1.getHeight();
		double imgWidth = image1.getWidth();
		winRatio = imgHeight / imgWidth;
		//gets dimensions of image
		
		ImageView imageView1 = new ImageView(image1);
		imageView1.setPreserveRatio(true);
		//keeps image the same size with expansion of window
		//**prevents stretching**
		
		
		imageView1.fitWidthProperty().bind(sPane.widthProperty());
		//makes image the same size as window pane
		
		sPane.getChildren().add(imageView1);
		//displays image on pane

		// Create a scene and place it in the stage
		winHeight = 350;
		winWidth = winHeight / winRatio; //displays window w image dimensions
		Scene scene = new Scene(sPane, winWidth, winHeight);
		
		
		primaryStage.setTitle("MineCraft Bee :)"); // sets stage title
		primaryStage.setScene(scene); // Place the scene in the stage// ??not sure how this works
		primaryStage.show(); // Display the stage

	}

//----------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}