package exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Make a simple high/low guessing game.
//Computer picks a number. User guesses a number.
//Computer responds with the guess is too high, to low, or correct.
//Add a leader board to the game where after winning the player enters +
//their name and the computer records that and their stats - number of guesses, total time to win etc.
//Board shows top 5 winners - based on?
//The leader board is persistent - it is stored in a file between games.

public class GuessingGame extends Application {

	TextField guess = new TextField();
    int numGuesses = 0;
    int rand = (int)((Math.random() * 100) + 1);
    
	@Override
	public void start(@SuppressWarnings("exports") Stage primaryStage) {
		
		// --------------------------------------------------------------------

		VBox vbox1 = new VBox(30); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		vbox1.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1 = new HBox(30); // the attribute sets the space between nodes
		hbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		hbox1.setAlignment(Pos.BOTTOM_CENTER);

		// --------------------------------------------------------------------
		Text txt1 = new Text("Please guess a number between 1 and 100 :)");
		txt1.setFont(Font.font("TimesNewRoman", 15)); // sets font and size

		Text txt2 = new Text("Thank You for playing :)");
		txt2.setFont(Font.font("TimesNewRoman", 15)); // sets font and size

		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();

		// --------------------------------------------------------------------
		btn1.setText("New Game");
		btn1.setStyle("-fx-background-color: GRAY"); // changed color of buttons
		btn1.setFont(Font.font("TimesNewRoman", 15)); // sets font and size
		btn1.setOnAction(actionEvent -> {
				getNum();
				System.out.println("New Game Started");
				guess.setText("");
		});

		btn2.setText("Submit Guess");
		btn2.setStyle("-fx-background-color: GRAY");
		btn2.setFont(Font.font("TimesNewRoman", 15));
		btn2.setOnAction(actionEvent -> {
				callGame(numGuesses);
		});
		
		btn3.setText("Submit Guess");
		btn3.setStyle("-fx-background-color: GRAY");
		btn3.setFont(Font.font("TimesNewRoman", 15));
		btn3.setOnAction(actionEvent -> {
				System.out.println("Done Playing ):");
				leaderBoard();
		});
		
		// --------------------------------------------------------------------
		
		vbox1.getChildren().add(txt1);
		hbox1.getChildren().addAll(btn1, btn2);
		
		vbox1.getChildren().addAll(guess, hbox1, txt2);

		Scene sc = new Scene(vbox1, 400, 275);
		primaryStage.setTitle("Guess the Number");
		primaryStage.setScene(sc);
		primaryStage.show();
	}


	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void getNum() {
		guess.setPromptText("Enter your guess!");
		numGuesses = 0;
	}
	
	public void callGame(int numGuessses) {
		
		int num = Integer.parseInt(guess.getText());
		 		
		if (num > rand) {
			System.out.println(num + " is too big :( try again!");
			guess.setText("");
			numGuesses++;
		} else if (num < rand) {
			System.out.println(num + " is too small :( try again!");
			guess.setText("");
			numGuesses++;
		} else {
			System.out.println("You've guessed the number! Congratulations! :)");
			System.out.println("Number of guesses: " + numGuesses);
		}
	}
	
	public void leaderBoard() {
		// I wish 
	}

}
