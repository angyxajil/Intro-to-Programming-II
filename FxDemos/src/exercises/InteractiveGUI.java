package exercises;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Slider controls should show the values selected. A slider could set the level of a progress bar.
//Spinners
//Colors
//Drop shadows

public class InteractiveGUI extends Application {

	private int count = 0;

	@Override
	public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {

		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges

		VBox vbox1 = new VBox(20); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		vbox1.setStyle(" -fx-border-width: 2");

		VBox vbox2 = new VBox(20); // the attribute sets the space between nodes
		vbox2.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		vbox2.setStyle(" -fx-border-width: 2");
		vbox2.setStyle("-fx-background-color: LIGHTGRAY");
		vbox2.setTranslateX(250);
		vbox2.setTranslateY(10);

		Pane pane1 = new Pane();
		pane1.setPadding(new Insets(15, 15, 15, 15));

		Pane pane2 = new Pane();
		Pane pane3 = new Pane();
		// --------------------------------------------------------------------
		Text txt1 = new Text("Welcome to the BusyBox");
		txt1.setFont(Font.font("Times New Roman", 17)); // sets font and size
		txt1.setTranslateX(235);
		txt1.setTranslateY(30);

		Button btn1 = new Button();
		Button btnP = new Button();
		Button btnG = new Button();

		ImageView btnPic = new ImageView("file:///Users/AngyXajil/Desktop/minecraft.jpg");

		btnPic.setFitWidth(50);
		btnPic.setPreserveRatio(true);
		btnP.setGraphic(btnPic);

		Rectangle rec01 = new Rectangle(0, 0, 30, 30);
		rec01.setStroke(Color.RED);
		rec01.setFill(Color.RED);

		Circle circ01 = new Circle();
		circ01.setRadius(15);
		circ01.setStroke(Color.RED);
		circ01.setFill(Color.RED);
		// --------------------------------------------------------------------
		btn1.setText("Change Color");
		btn1.setTranslateX(100);
		btn1.setTranslateY(120);
		btn1.setPrefSize(100, 40);
		btn1.setOnAction(e -> {
			count++;
			if (count % 2 == 0) {
				btn1.setTextFill(Color.WHITE);
				btn1.setStyle("-fx-background-color: BLACK");
			} else {
				btn1.setStyle("-fx-background-color: WHITE");
				btn1.setTextFill(Color.BLACK);
			}

		});
		// --------------------------------------------------------------------
		Label label = new Label("Do you like the bee? :");
		label.setTranslateX(15);
		label.setTranslateY(50);

		Font font = Font.font("Times New Roman", 20); // Setting font to the label
		label.setFont(font);
		label.setTextFill(Color.BLACK); // Filling color to the label

		TextField txtField = new TextField();
		txtField.setTranslateX(200);
		txtField.setTranslateY(50);

		TextField answer1 = new TextField();
		answer1.setTranslateX(200);
		answer1.setTranslateY(100);

		String a = txtField.getText();

		btnP.setText("Submit");
		btnP.setPrefSize(125, 40);
		btnP.setTranslateX(370);
		btnP.setTranslateY(50);

		btnP.setOnAction(e -> {
			answer1.setEditable(false);
			if (a == "yes") {
				answer1.setText("yay! (:");
			} else if (a == "no") {
				answer1.setText("Why not?! >:/");
			} else {
				answer1.setText("No text submitted :(");
			}

			// please tell me why this doesn't work??? :(
		});

		ImageView lblPic = new ImageView("file:///Users/AngyXajil/Desktop/LabelPic.jpg");
		lblPic.setFitWidth(150);
		lblPic.setPreserveRatio(true);

		Label labelImg = new Label("I made the label image!", lblPic); // Setting font to the label
		labelImg.setFont(Font.font("Chalkboard", 25)); // Filling color to the label
		labelImg.setTextFill(Color.OLIVE);
		labelImg.setTranslateX(30);
		labelImg.setTranslateY(150);

		Polygon triangle = new Polygon();
		triangle.getPoints().addAll(new Double[] { 0.0, 0.0, 40.0, 20.0, 0.0, 40.0 });
		triangle.setRotate(360);
		triangle.setFill(Color.RED);

		Label triLabel = new Label(" Looks like a play button!", triangle);
		triLabel.setFont(Font.font("Chalkboard", 25));
		triLabel.setTextFill(Color.RED);
		triLabel.setTranslateX(20);
		triLabel.setTranslateY(50);

		// --------------------------------------------------------------------
		PasswordField pass = new PasswordField();
		pass.setTranslateX(225);
		pass.setTranslateY(310);

		TextField showpass = new TextField();
		showpass.setTranslateX(130);
		showpass.setTranslateY(345);

		btnG.setText("Enter");
		btnG.setPrefSize(140, 40);
		btnG.setTranslateX(400);
		btnG.setTranslateY(300);
		btnG.setOnAction(e -> {
			count++;
			if (count % 2 == 0) {
				btnG.setText("Surprise! :3");
				btnG.setGraphic(rec01);
				showpass.setText(pass.getText());
			} else {
				btnG.setText("Click Again!");
				btnG.setGraphic(circ01);
				showpass.setText(pass.getText());
			}
		});
		// --------------------------------------------------------------------

		Text txt2 = new Text("Enter random Password:");
		txt2.setFont(Font.font("Times New Roman", 20));
		txt2.setTranslateX(15);
		txt2.setTranslateY(325);

		Text txt3 = new Text("You entered:");
		txt3.setFont(Font.font("Times New Roman", 20));
		txt3.setTranslateX(15);
		txt3.setTranslateY(360);

		TextArea inOut = new TextArea("What's your name? ");
		String name = inOut.getText();
		inOut.setPrefSize(300, 150);

		ScrollPane scroll = new ScrollPane();
		scroll.setContent(inOut);
		scroll.setPrefWidth(300);
		scroll.setPrefHeight(100);
		scroll.setTranslateX(30);
		scroll.setTranslateY(250);

		gridPane.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case ENTER:
				inOut.setText("Your name is: " + name);
				break;
			default:
				break;
			}
			// this honestly doesn't work, couldn't figure it out ):
		});
		// --------------------------------------------------------------------

		Label radio = new Label("Which is better?");

		ToggleGroup tog = new ToggleGroup();

		RadioButton r1 = new RadioButton("Chocolate");
		RadioButton r2 = new RadioButton("Vanilla");
		RadioButton r3 = new RadioButton("Strawberry");

		r1.setToggleGroup(tog);
		r2.setToggleGroup(tog);
		r3.setToggleGroup(tog);

		vbox1.getChildren().addAll(radio, r1, r2, r3);
		vbox1.setTranslateX(15);
		vbox1.setTranslateY(10);
		// --------------------------------------------------------------------
		Label check = new Label("Which food do you like?");

		CheckBox box1 = new CheckBox("Thai");
		CheckBox box2 = new CheckBox("Italian");
		CheckBox box3 = new CheckBox("Indian");

		vbox1.getChildren().addAll(check, box1, box2, box3);
		vbox1.setTranslateX(15);
		vbox1.setTranslateY(10);
		// --------------------------------------------------------------------

		Label age = new Label("How old are you?");
		ComboBox<String> ageList = new ComboBox<String>();

		ageList.setPromptText("Select age");
		ObservableList<String> list1 = ageList.getItems();
		list1.add("12-15");
		list1.add("16-20");
		list1.add("21-30");
		list1.add("31-20");
		list1.add("41-50");
		list1.add("50-80");

		vbox2.getChildren().addAll(age, ageList);
		// --------------------------------------------------------------------

		Label phone = new Label("How do you greet the phone?");
		ObservableList<String> list2 = FXCollections.observableArrayList("Hello", "Yellow", "Hi", "Helloski",
				"What's up?");
		ListView<String> view = new ListView<String>(list2);
		view.setMaxSize(200, 160);

		vbox2.getChildren().addAll(phone, view);
		// --------------------------------------------------------------------

		Slider slider = new Slider();
		slider.setMin(0);
		slider.setMax(50);
		slider.setBlockIncrement(5);
		slider.setPrefSize(200, 10);

		slider.setTranslateX(50);
		slider.setTranslateY(200);
		// --------------------------------------------------------------------
		Menu menu = new Menu("Options");
		MenuItem menu1 = new MenuItem("File");
		MenuItem menu2 = new MenuItem("Edit");
		MenuItem menu3 = new MenuItem("Window");

		menu.getItems().add(menu1);
		menu.getItems().add(menu2);
		menu.getItems().add(menu3);

		MenuBar bar = new MenuBar();
		bar.getMenus().add(menu);
		// --------------------------------------------------------------------

		TabPane tPane = new TabPane();

		Tab tab1 = new Tab();
		tab1.setContent(pane1);

		Tab tab2 = new Tab();
		tab2.setContent(pane2);

		Tab tab3 = new Tab();
		tab3.setContent(pane3);

		tPane.getTabs().addAll(tab1, tab2, tab3);
		// --------------------------------------------------------------------

		pane1.getChildren().addAll(txt1, label, txtField, btnP, answer1, labelImg, txt2, pass, txt3, showpass, btnG);
		pane2.getChildren().addAll(triLabel, slider, inOut, scroll, bar, btn1);
		pane3.getChildren().addAll(vbox1, vbox2);

		Scene sc = new Scene(tPane, 570, 450); // horizontal, vertical

		primaryStage.setScene(sc);
		primaryStage.setTitle("PlaySchool BusyBox");
		primaryStage.show();
	}
	// ---- methods -------------------------------------------------

	public static void main(String[] args) {
		Application.launch(args);
	}
}