package exercise;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainStart extends Application {

	@Override
	public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {

		BorderPane borderPane = new BorderPane();
		borderPane.setStyle("-fx-background-color: SILVER");
		borderPane.setPadding(new Insets(15, 15, 15, 15));
			
		MagicEightBall ball = new MagicEightBall();
		ball.showItems();
		borderPane.setCenter(ball);
		
		Button submit = new Button("Ask");
		borderPane.setBottom(submit); //can i also center?
		submit.setAlignment(Pos.CENTER); // didnt work ):
		submit.setTranslateX(180);
		submit.setPrefSize(100, 30);

		submit.setOnAction(e -> {
			ball.showSaying();
			//System.out.println("reponse!");
		});

		Scene sc = new Scene(borderPane, 500, 450); // horizontal, vertical

		primaryStage.setScene(sc);
		primaryStage.setTitle("Magic 8 Ball");
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
